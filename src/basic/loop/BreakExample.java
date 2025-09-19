package basic.loop;

public class BreakExample {
    public static void main(String[] args) {

        // fori + tab 하면 for 문을 빠르게 만들 수 있다.
        for (int i = 1; i <= 10 ; i++) {    // i가 10이랑 같거나 작으면
            if (i == 5) {   // i가 5랑 같으면
                break;      // 반복문 종료 (탈출)
            }
            // if(i == 5) continue; // i가 5랑 같으면 아래 코드 실행하지 않고 다음 반복으로 넘어감
            // continue는 반복문에서만 사용 가능
            // break는 반복문, switch문에서 사용 가능
            // if(i == 5) break; {}을 생략이 가능함 (한 줄일 때), 단 코드의 가독성을 해치지 않는 선에서만.
            // 만약 두 줄일 때, 괄호 무조건 쳐야함 break; 전에 뭘 출력해야하면 무조건 {} 열어야함
            System.out.print(i + " "); // i 뒤에 공백 붙어서 띄어서 보여짐

        }

        System.out.println("\n=====================================================");
        // \n을 입력하면 줄이 바뀜

        outer: for (int i=0; i<=2; i++) {
            for (int j=0; j<=i; j++) {
                if (i == j) break outer;  // 이 break는 안쪽 for문만 탈출 근데 for문 이름을 정해주고, 레이블링 해주면 지정 됨
                System.out.println(i + "-" + j);
            }
        }
    }
}
