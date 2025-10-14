package ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;   // 문자열을 토큰화시켜서 쪼개주는 클래스

public class QueueSol1 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringTokenizer : 구분자를 기준으로 문자열을 분할해주는 객체
        // Integer.parseInt 문자열로 된 정수를 실제 뭐로 바꿔준다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");// 공백을 기준으로 문자열을 쪼갠다.
        int N = Integer.parseInt(st.nextToken());   // 왕자 수 (큐의 크기)
        int K = Integer.parseInt(st.nextToken());   // K번째 왕자 제거

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++){
            queue.add(i);   // 왕자들을 큐에 넣자.
        }

        while (queue.size() > 1){   // 큐에 왕자가 한 명 남을 때까지 반복문 돌리겠다.
            for (int i = 1; i < K; i++){
                queue.offer(queue.poll()); // 맨 앞에 있는 애를 꺼내서 맨 뒤로 넣어준다.
            }
            queue.poll();  // K번째 왕자 제거
        }
        System.out.println(queue.poll()); // 마지막 남은 왕자 출력
        br.close();

    }
}
