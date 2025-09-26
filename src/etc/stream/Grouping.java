package etc.stream;

import oop.static_.utils.PrintUtil;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static etc.stream.Menu.MENU_LIST;

public class Grouping {
    public static void main(String[] args) {

        // 채식요리와 아닌 요리로 메뉴를 나누어보자
        // 두 분류로 나누어줌, (분류 기준을 논리 값으로 전달 해주어야 함)
        Map<Boolean, List<Dish>> veggieMenu = MENU_LIST.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println("*** 채식메뉴 ***");
        System.out.println(veggieMenu.get(true));   //꺼내겠다.
        System.out.println("*** 일반메뉴 ***");
        System.out.println(veggieMenu.get(false));  //꺼내겠다.

        PrintUtil.printLine();

        // 요리 종류(타입)별로 메뉴를 나누어보자
        Map<Dish.Type, List<Dish>> menuByType = MENU_LIST.stream()  // 리스트로 만들어서 반환해줌
                .collect(Collectors.groupingBy(d -> d.getType()));// command + B

        System.out.println("*** 육류 메뉴 ***");
        System.out.println(menuByType.get(Dish.Type.MEAT));

        PrintUtil.printLine();

        //종류별로 나눈 메뉴를 kcal 기준으로 한 번 더 그룹화
        Map<Dish.Type, Map<String, List<Dish>>> detiledMenu
                = MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::getType,// 1차 분류: 타입
                        Collectors.groupingBy(d -> {    // 2차 분류: 칼로리
                            if (d.getCalories() > 500) return "고칼로리";
                            else return "저칼로리";
                        })
                ));

        System.out.println("고기의 저칼로리" + detiledMenu.get(Dish.Type.MEAT).get("저칼로리"));
        System.out.println("OTHER의 고칼로리: " + detiledMenu.get(Dish.Type.OTHER).get("고칼로리"));

        PrintUtil.printLine();
        // 종류별 요리 갯수
        Map<Dish.Type, Long> dishCount = MENU_LIST.stream()
                // 그룹별로 분류해줘~ 내가 최종적으로 얻고자 하는 값은 그룹으로 분류했을 때 그 그룹의 각 개수를 세어서 반환해줘
                .collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));

        System.out.println(dishCount);

        PrintUtil.printLine();
        //종류별 요리 총 칼로리
        Map<Dish.Type, Integer> totalCalByType = MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.summingInt(Dish::getCalories)));// 그룹에서 얻은 타입을 써밍인트로 알려줘 칼로리를

        System.out.println(totalCalByType);

        PrintUtil.printLine();
        Map<Dish.Type, IntSummaryStatistics> calStatus = MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.summarizingInt(Dish::getCalories)));// 칼로리 기준 요약정리
        // 요리 종류별 통계 꾸러미가 리턴 됨(갯수, 합계, 최저, 평균, 최고)
        System.out.println(calStatus);


    }
}
