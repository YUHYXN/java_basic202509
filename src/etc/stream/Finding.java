package etc.stream;

import oop.static_.utils.PrintUtil;

import java.util.Comparator;

import static etc.stream.Menu.MENU_LIST;

public class Finding {

    public static void main(String[] args) {

        //  메뉴 목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 존재하는가??
        boolean flag1 = MENU_LIST.stream()
                .anyMatch(d -> d.isVegetarian());// 요구사항에 1개라도 맞는다면 true || 아니라면 false
        System.out.println("flag1 = " + flag1);

        PrintUtil.printLine();

        // 메뉴 목록 중 칼로리가 100 이하 인 요리가 하나라도 존재하나요? (1개라도 일치하는지)
        boolean flag2 = MENU_LIST.stream()
                .anyMatch(d -> d.getCalories() <= 100);
        System.out.println("flag2 = " + flag2);

        PrintUtil.printLine();

        // 음식 중에 모든  요리가 1000kcal 미만인가요? (전부 일치하는지)
        boolean flag3 = MENU_LIST.stream()
                .allMatch(d -> d.getCalories() <= 1000);// 전부 일치하는지
        System.out.println("flag3 = " + flag3);

        PrintUtil.printLine();

        // 음식 중에 모든  요리가 1000kcal 미만이 아닌가요? (전부 불일치하는지)
        boolean flag4 = MENU_LIST.stream()
                .noneMatch(d -> d.getCalories() <= 1000);// 전부 불일치하는지
        System.out.println("flag4 = " + flag4);

        PrintUtil.printLine();

        // 음식 중에서 칼로리가 제일 낮은 애는 누구인가요?
        Dish dish = MENU_LIST.stream()
                .min(Comparator.comparing(d -> d.getCalories()))
                .get();
        System.out.println("dish = " + dish);


    }


}
