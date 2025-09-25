package etc.collection.list;

// 자동으로 붙음
import oop.static_.utils.PrintUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {


//        String[] arr = new String[20];    기존 배열

        // ArrayList 컬렉션 생성
        // <> -> 제네릭 문법 이라고 한다 (Type의 형식을 지정하여 Type 안정성을 꾀하기 위한 문법)
        // <> 안에 기본형 타입은 올 수 없다. (int, char, double 등등)
        // 대신 기본형 타입의 Wrapper 클래스는 올 수 있다. (Integer, Character, Double 등등)
        // <>을 빼고 사용하면 오브젝트 타입으로 지정된다 (모든 타입을 다 담을 수 있지만, Type 안정성이 떨어진다).
        // 값을 담을 땐 .get() 메서드
        // nick.add(); 하면 ()안에 잘 보면 String이 들어가야 한다고 나옴
        // nick.get(); 하면 String이 반환된다고 나옴
        // 인터페이스 타입으로 변수를 선언하는 것이 (일반적이다)좋다. (ArrayList -> List)
        ArrayList<String> nick = new ArrayList<>(); // Opt + Enter 지역변수 선언

        // add(객체): 리스트에 객체를 추가하는 메서드 (맨 뒤에 추가)
        nick.add("봉심이");
        String str = "제로";
        nick.add(str);
        nick.add("야옹이");
        nick.add("봉자");
        nick.add("제로"); // 중복 허용 (기존 값 참조) = true 나옴 맨 마지막에 들어감

        System.out.println("nick =" + nick);

        // add(인덱스, 객체): 지정한 인덱스에 객체를 추가하는 메서드 (기존 값 뒤로 밀림)
        //오버로딩임 매개변수를 뭐로 주냐에 따라 전혀 다른게 호출 됨
        nick.add(3, "백호");
        System.out.println("nick =" + nick);    // 3번 인덱스에 백호가 들어가고 봉자가 4번 인덱으로 한 칸 뒤로 밀림

        // get(인덱스): 리스트 내부의 객체를 참조하는 메서드
//        String string = nick[3];
        String name = nick.get(3); // 3번 인덱스에 있는 객체를 반환(참조 | 확인) ||
        System.out.println("name = " + name);
        System.out.println("nick의 크기: " + nick.size());

        PrintUtil.printLine();

        // set(인덱스, 수정할 객체): 리스트 내부 객체 수정
        nick.set(2, "제로");
        System.out.println("nick =" + nick);

        PrintUtil.printLine();

        // 리스트 반복문 처리 (인덱스로 잡아주면 쉽다)

        for (int i = 0; i < nick.size(); i++){ // int i는 0이고 i 는 nick의 크기보다 작아질 때까지 1씩 증가한다.
            System.out.println(nick.get(i));    // i번째 인덱스에 있는 객체를 반환(참조 | 확인)
        }


        for(String s : nick){   // 이게 편하다고 이것만 쓰는게 아니라, 일반 for문도 써야할 때가 있다.
            System.out.println(s);  // 향상된 for문은 처음부터 끝까지 다 돌아야한다. 무조건
        }

        PrintUtil.printLine();

        // contains(객체): 리스트 내부에 해당 객체가 있는지 확인하는 메서드 (존재유무 파악)
        System.out.println(nick.contains("봉심이")); // true
        System.out.println(nick.contains("스커")); // false

        PrintUtil.printLine();

        // indexOf(객체): 리스트 내부에 해당 객체의 인덱스를 반환하는 메서드 (앞에서부터 탐색)
        // contains는 있다 없다는 판별하지만, indexOf는 특정 객체의 인덱스 탐색, 없으면 -1 리턴
        int idx = nick.indexOf("개구리");
        System.out.println("idx = " + idx);   // -1

        PrintUtil.printLine();
        
        // remove(객체 or 인덱스): 리스트 내부의 인덱스or객체를 삭제하는 메서드
        nick.remove("제로");  
        nick.remove(4); // 4번 인덱스 삭제
        System.out.println("nick = " + nick);

        PrintUtil.printLine();

        // clear(): 리스트 내부의 모든 객체를 삭제하는 메서드
        nick.clear();
        System.out.println("nick = " + nick);

        // isEmpty(): 리스트가 비어있는지 확인하는 메서드
        System.out.println(nick.isEmpty()); // 0

        PrintUtil.printLine();

        // lastIndexOf(객체): 리스트 내부에 해당 객체의 인덱스를 반환하는 메서드 (뒤에서부터 탐색)

        PrintUtil.printLine();
        /*
          #컬렉션 객체들은 Collections의 기능을 사용할 수 있다.
          collections는 컬렉션 객체들의 부가 기능등을 제공한다.
         */
        // 제네릭 문법엔 객체 타입을 써야한다 (int는 기본 타입이라 안됨 = 포장해서 Integer) wrapper 클래스
        // int는 Integer, long은 Long, double 은 Double, char는 Character, boolean은 Boolean
        List<Integer> score =  new ArrayList<>();
        score.add(90);

        /*
        collections.addAll: 이미 만들어진 컬렉션에 여러 요소를 추가하는 메서드
        *
        Arrays.asList: 불변 리스트이므로, add, remove 같은 변경 작업을 지원하지 않음 하지만 set, get, size 같은 읽기/변경 작업은 가능 | null 요소 허용
        *
        List.of: 불변 리스트이므로, add, remove, set 등과 같은 변경 작업을 지원하지 않음 | null 요소 허용 안 함
         */
        List<Integer> integersList0 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);// 1~10까지의 숫자를 담은 리스트를 반환해줌 - 값을 담은 새로은 리스트
        List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);// 배열을 리스트로 바꿔줌 (배열을 리스트로 바꿔주는 메서드) - 값을 담은 새로은 리스트
        Collections.addAll(score, 1,2,3,4,5,6,7,8,9,10); // 기본의 리스트에 값을 채워줌 배열을 리스트로 바꿔주는 메서드) - 반환을 안 함

        System.out.println(score);

        // 컬렉션 내의 객체의 개수 구하기
        System.out.println("100점 학생 수: " + Collections.frequency(score, 100) + "명" );

        // 최대값/최소값
        System.out.println("최대값: " + Collections.max(score));
        System.out.println("최소값: " + Collections.min(score));

        // 정렬(오름차순)
        Collections.sort(score);
        System.out.println("score = " + score);

        // 단순 역순 배치
//        Collections.reverse(score); // 단순 역순 배치임 정렬은 아님 (정렬x)
//        System.out.println("score = " + score);

        // 정렬(내림차순)
        Collections.sort(score, Collections.reverseOrder());    // score.sort(Collections.reverseOrder()); 로 작성 가능
        System.out.println("score = " + score);

        // swap(리스트, i, j) 두 요소의 위치를 교체해줌
        Collections.swap(score,3,7);
        System.out.println("score = " + score);

        // 리스트 내의 요소를 무작위로 섞기 | 랜덤
        Collections.shuffle(score);
        System.out.println("score = " + score);

        // 원하는 객체로 컬렉션을 전부 초기화
        Collections.fill(score,78); // score 리스트의 모든 요소를 78로 채운다.
        System.out.println("score = " + score);




    }
}
