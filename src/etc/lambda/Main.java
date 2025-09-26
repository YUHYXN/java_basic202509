package etc.lambda;

import oop.static_.utils.PrintUtil;

import java.util.List;

import static etc.lambda.Color.*;

public class Main {

    // 요구사항에 맞는 사과만 골라내보자
    public static void main(String[] args) {
        // 사과 바구니 생성
        // List.of -> 고정형 리스트 생성 (Arrays.asList와 유사)
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println("========== 녹색 사과만 필터링 ==========");
        List<Apple> greenApples = FilterApple.filterGreenApple(appleBasket);
        for (Apple apple : greenApples) {
            System.out.println(greenApples);
        }

        System.out.println("========== 원하는 조건의 사과만 필터링 ==========");
        List<Apple> redApples = FilterApple.filterAppleByColor(appleBasket, RED);
        for (Apple apple : redApples) {
            if (apple.getColor() == RED)
                System.out.println(apple);
        }

        PrintUtil.printLine();

        List<Apple> lightApple = FilterApple.filterApple(appleBasket, new LightApplePredicate());
        for (Apple apple : lightApple) {
            System.out.println(apple);
        }

        PrintUtil.printLine();

        // 빨강 또는 노랑 사과만 필터링
        //클래스 또만들기 귀찮음
        // 메서드 호출할 때, 이름 없는 클래스를 즉석애서 만들어서 보내면 안되나? -> 익명 클래스!
        List<Apple> apples = FilterApple.filterApple(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED || apple.getColor() == YELLOW;
            }
        });

        for (Apple apple : apples){
            System.out.println(apple);
        }

        PrintUtil.printLine();

        // 녹색이면서 100g 이하인 사과만 필터링
        // 우리는 이제 익명 클래스를 통하여 새 클래스 파일 생성 없이 즉석에서 보낼 수 있다.
        // 근데 어차피 인터페이스에 추상 메서드 하나이다.
        // 그럼 굳이 이름을 언급할 필요가 없다 -> 람다식 쓰자 라는 생각의 흐름이라는 수업내용
        List<Apple> apples2 = FilterApple.filterApple(appleBasket,
                (apple) -> apple.getColor() == GREEN && apple.getWeight() <= 100);
        for (Apple apple : apples2) {
            System.out.println(apple);
        }

        // 색이 빨강 혹은 초록이면서, 무게는 150g 미만이어야한다. (람다식)
        List<Apple> apples3 = FilterApple.filterApple(appleBasket,
                (apple) -> apple.getColor() == RED
                        || apple.getColor() == GREEN
                        && apple.getWeight() < 150);
        for (Apple apple : apples3){
            System.out.println(apple);
        }

        PrintUtil.printLine();

        // 이제 여러가지 타입의 객체를 필터링 해본다.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filter1 = FilterApple.filter(numbers, (n) -> n % 2 == 0);
        System.out.println(filter1);

        // 세글자 이상 음식만 고르기
        List<String> foods = List.of("짜장면", "짬뽕", "탕수육", "꿔바로우", "삼겹살", "소고기", "소곱창", "피자", "치킨");
        List<String> filter2 = FilterApple.filter(foods, (f) -> f.length() >= 3);
        System.out.println(filter2);

        PrintUtil.printLine();

        // 사과 색상 리스트만 뽑아봐
        List<Color> colorList = MappingApple.mappingAppleByColor(appleBasket);
        System.out.println("ColorList: " + colorList);

        PrintUtil.printLine();
        // 사과 무게 리스트
        List<Integer> map1 = MappingApple.map(appleBasket, new GenericFunction<Apple, Integer>() {
            @Override
            public Integer apply(Apple apple) {
                return apple.getWeight();
            }
        });

        PrintUtil.printLine();
        //숫자 리스트를 주면 각 숫자의 제곱을 맵핑해주는 메서드
        List<Object> map2 = MappingApple.map(numbers, n -> n * n);
        System.out.println("map2 = " + map2);

        PrintUtil.printLine();
        // 음식리스트를 주면 첫 글자만 뽑아와
        // subString(0,1) -> substring(0) -> charAt(0)
        List<Character> map3 = MappingApple.map(foods, f -> f.charAt(0));
        System.out.println("map3 = " + map3);




    }
}
