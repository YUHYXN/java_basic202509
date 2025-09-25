package etc.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();

        // fori 단축키로 펼치기 가능
        for (int i = 0; i < 1000000 ; i++) {
            array.add(i);
            linked.add(i);
        }
        long start, end;
        // 배열리스트에서 데이터 제거 array
        start = System.currentTimeMillis();
        for (int i = 0; i < array.size() ; i++) {
//            array.remove(0);    // 72491ms
            array.get(i);   // 2ms
        }

        end = System.currentTimeMillis();

        System.out.printf("배열리스트의 소요시간: %dms\n", end - start);


        // 연결리스트에서 데이터 제거 linked
        start = System.currentTimeMillis();
        for (int i = 0; i < linked.size() ; i++) {
//            linked.remove(0);   // 27ms
            linked.get(i);  // 5분 지나도 끝나지 않음 강제종료함
        }

        end = System.currentTimeMillis();

        System.out.printf("연결리스트의 소요시간: %dms\n", end - start);
    }
}
