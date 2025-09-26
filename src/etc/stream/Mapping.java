package etc.stream;

// map : 리스트에서 원하는 데이터만 추출
// original : [ {}, {}, {}, {}, {} ]
// filter   : [ {}, {}, {} ]
// map      : [ "", "", "", "", "" ]

import oop.static_.utils.PrintUtil;

import java.util.Arrays;
import java.util.List;

import static etc.stream.Menu.MENU_LIST;

public class Mapping {

    public static void main(String[] args) {

        // 요리 이름만 출력
        // toList() : 자바 16부터 쓸 수 있음. 불변 리스트 -> 수정 안된다.
        // collect(Collectors.toList()) : 자바 8부터 있었다. 가변 리스트 -> 수정 가능
        MENU_LIST.stream()
                .map(d -> d.getName())  // dish의 이름 건져올리기 = getName()
                .toList()
                .forEach(System.out::println);


        PrintUtil.printLine();

//        List<Integer> browser = List.of("safari", "chrome", "edge", "opera", "firefox");
//
//        //문자열의 길이만 추출해봐
//        List<Integer> list = browser.stream()
//                .map(b -> b.length())   // browser를 받아서 length를 꺼내줄게 | String에 length를 일괄적용하여 리턴해주겠다.
//                .toList();
//        System.out.println("List = " + List);

        PrintUtil.printLine();

        // 메뉴 목록에서 메뉴 이름과 칼로리만 추출해서 새로운 객체로 포장해서 받고 싶다.
        List<SimpleDish> simpleDishes = MENU_LIST.stream()
                .map(d -> new SimpleDish(d))
                .toList();

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요. -> DishDetail이라는 객체로 맵핑
            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER는 기타라고 저장
         */

        MENU_LIST.stream()
                .filter(d -> d.getCalories() > 500) // 500칼로리 이상 필터링
                .map(d -> new DishDetail(d)) // DishDetail 객체로 맵
                .toList()
                .forEach(System.out::println);

        PrintUtil.printLine();
        // 메뉴 목록에 있는 요리들의 총 칼로리 구하기
        int sum = MENU_LIST.stream()
                .mapToInt(d -> d.getCalories()) // IntStream
                .sum();
        System.out.println("sum = " + sum);

        // 육류메뉴의 평균 칼로리 구하기
        double meatAvgCal = MENU_LIST.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .mapToInt(d -> d.getCalories())
                .average()
                .getAsDouble();

        System.out.printf("meatAvgCal = %.2f\n", meatAvgCal);

        PrintUtil.printLine();

        // 모든 요리 이름에 포함된 알파벳 중복 없이 추출
        // flatMap : map처럼 변환을 하긴 하는데, 그 결과는 반드시 stream 이어야 한다.
        // 여러개의 stream을 하나의 stream으로 합쳐준다.
        List<String> stringList = MENU_LIST.stream()
                .map(d -> d.getName().split(""))
                .flatMap(arr ->  Arrays.stream(arr))// 배열을 받으면 그걸 스트림으로 변환해주는 애 | 여러개의 stream을 하나의 stream으로 합쳐줬다.
                // 컨베이어 벨트가 있다면, 여러 상자들에서 내용물만 꺼내서 하나의 상자로 포장해주는 역할이라고 보면된다. -> flatMap
//                .flatMap(arr -> Arrays::stream)// 메서드 참조식
//                .filter(s -> !s.isBlank()) // 빈문자열 제거(공백이 아니라면) ! 가 있음
                .distinct() // 중복제거
                .toList();
        System.out.println("stringList = " + stringList);

        PrintUtil.printLine();

        // peek() : stream()의 중간에 처리과정을 들여다볼 수 있는 메서드
        List<String> stringList1 = MENU_LIST.stream()
                .filter(d -> d.getCalories() > 300)
                .peek(d -> System.out.println("필터링 후: " + d.getName()))
                .map(Dish::getName) // 람다식
                .peek(System.out::println)
                .limit(3) // 3개만 보임
                .toList();

        System.out.println("stringList1 = " + stringList1);


    }

}
