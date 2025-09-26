package etc.stream;

import oop.static_.utils.PrintUtil;

import java.util.Comparator;
import java.util.List;

import static etc.stream.Menu.MENU_LIST;
import static java.util.Comparator.*;

public class Sorting {
    public static void main(String[] args) {

        // 요구사항 : 육류 요리 중, kcal가 낮은 순으로 정렬해주세요. (기본이 내림차순)
        List<Dish> lowKcalMeats = MENU_LIST.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT) // d에서 type을 꺼냈더니 그 타입이 MEAT임?
                .sorted(comparing(Dish::getCalories))    // Comparator import static 해서 생략
                .toList();
        lowKcalMeats.forEach(System.out::println);

        // 메뉴 이름들 내림차순 - zxy순
        MENU_LIST.stream()
                .sorted(comparing(Dish::getName).reversed())
                .forEach(System.out::println);

        PrintUtil.printLine();

        // 300 칼로리 이상인 요리 중에 칼로리가 낮은 Top3 요리 필터링

        MENU_LIST.stream()
                .filter(d -> d.getCalories() <= 300)
                // 칼로리 오름차순으로 정렬 해줘 근데, 칼로리가 같다면 이름 오름차순으로 해줘
                .sorted(comparing(Dish::getCalories).thenComparing(Dish::getName))
                .limit(3)
                .forEach(System.out::println);



    }
}
