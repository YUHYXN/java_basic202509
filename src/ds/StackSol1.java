package ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class StackSol1 {

    public static void main(String[] args) throws IOException { // 코테에서는 메인에 throws IOException 많이 붙임 ㅇㅇ

        // 자바 입력: Scanner는 속도가 좀 느려.
        // 좀 더 빠른 입력을 위해서는 BufferedReader를 사용한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 코테에서는 try/catch 잘 안씀 여기서 예외가 발생하지 않는다는 가정 하에 하는 것임

        /*
        Stack 객체를 사용해도 되지만, ArrayDeque을 주로 많이 사용합니다.
        1. 상속 구조로 인한 오버헤드 발생
        2. 불필요한 동기화 방지
        3. 확장성 문제 (Vector는 배열이 가득차면 무조건 크기를 두배씩 늘림. ArrayDeque은 필요할 때마다 늘림)
         */

        Deque<Character> stack = new ArrayDeque<>();

        // str.toCharArray() -> 문자열을 char 배열로 변환
        for (Character c : str.toCharArray()) {
            if (c == '(') { // 만약 저게 열리는 괄호라면
                stack.push(c);  // 여는 괄호는 스택에 넣어준다.
            }else{
                // stack이 비었는데 pop을 하면 에러가 난다 그래서 물어볼 것이다.
                if (stack.isEmpty()){
                    System.out.println("NO");
                    return; // main 메서드를 종료시킨다.
                }
                stack.pop();    // 닫는 괄호일 경우, 스택에서 여는 괄호를 하나 꺼내(pop)준다.
            }
        }

        // 모든 처리가 완료된 후에 스택이 비어있지 않다면 짝이 맞지 않다는 뜻.
        // 올바른 괄호라면 짝이 맞기 때문에 스택이 비어있어야 한다.
        if (stack.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        br.close();
    }
}
