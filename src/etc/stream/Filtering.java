package etc.stream;

// import 함으로서 Menu.MENU_LIST를 바로 사용할 수 있게 된다.
import oop.static_.utils.PrintUtil;

import java.util.List;

import static etc.stream.Menu.*;

public class Filtering {
    public static void main(String[] args) {

        // 요리 메뉴 중 채식 주의자가 먹을 수 있는 요리만 필터링
        List<Dish> dishList = MENU_LIST.stream()
                .filter(Dish::isVegetarian) // 채식 요리만 필터링
                .toList();

        for (Dish dish : dishList){
            System.out.println(dish);
        }





        dishList.forEach(d -> System.out.println(d));


        PrintUtil.printLine();
        // 메뉴 목록 중에 육류이면서 600kcal 미만인 요리를 필터링해서 출력
        MENU_LIST.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT && d.getCalories() < 600)
                .toList()
                .forEach(dish -> System.out.println());


        PrintUtil.printLine();

        // 요리이름 네글자 필터링
        MENU_LIST.stream().filter(dish -> dish.getName().length() == 4)
                .toList()
                .forEach(dish -> System.out.println(dish));
//                .forEach(System::println); // 람다식 표현

        PrintUtil.printLine();
        // 칼로리가 300kcal보다 큰 요리 중에 앞에 3개만 필터링
        MENU_LIST.stream().filter(dish -> dish.getCalories() > 300)
                .limit(3)   // 앞에서 3개만추출
                .toList()
                .forEach(d -> System.out.println(d));


        PrintUtil.printLine();

        List<Integer> numbers = List.of(1, 2, 1, 3, 6, 2, 1, 4, 6, 2, 8, 6, 8, 9);
        // 리스트에서 짝수만 필터링 (중복은 제거해서)
        numbers.stream()
                .filter(n -> n % 2 == 0)    // 짝수만 필터링
                .distinct() // 중복제거
                .toList()
                .forEach(n -> System.out.println(n));

    }
}
