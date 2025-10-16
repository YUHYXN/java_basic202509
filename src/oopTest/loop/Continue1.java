package oopTest.loop;

public class Continue1 {
    public static void main(String[] args) {

        int i = 1;

        while(i <= 5){
            if (i == 3){
                i++;
                continue; // continue 만나면 아래 코드 실행 안하고 다시 조건문으로 올라감
            }
            // 위에서 컨티뉴가 되서 여기가 아예 무시되고 조건식으로 다시 감
            // 그렇게 계속 더해질 때 i가 3이 되면 컨티뉴 만나서 아래 코드 무시되고 다시 조건식으로 올라감
            // 그래서 3은 출력이 안됨
            // 6이 되면 조건식에서 false가 되서 while문 종료
            System.out.println(i);
            i++;
        }
    }
}
