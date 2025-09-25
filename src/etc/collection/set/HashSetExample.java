package etc.collection.set;

import oop.static_.utils.PrintUtil;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        /*
		 # Set
		 - 집합을 구현해 놓은 인터페이스
		 - 요소로 같은 값이 들어오는 것을 허용하지 않는다.

		 # Hash
		 - 어떤 값을 넣었을 때 전혀 예측하지 못할 값이 생성되어야 하는 알고리즘
		 - 예측할 수 없는 값을 이용하기 때문에 정렬이 불가능.
		 - 생성된 값으로 원래 값을 찾는 것도 불가능에 가깝다.
		 - 다시 원래 값으로 돌아갈 수 없는 단방향성 알고리즘
		 - 속도가 빠르고 보안성이 뛰어난 알고리즘. 객체의 주소값을 할당하거나
		  암호화 알고리즘에서 많이 사용됩니다.
		*/

        Set<String> set = new HashSet<>();
        
        // 객체를 저장: add(객체)
        set.add("Java");
        set.add("Spring");
        set.add("Python");
        set.add("JavaScript");
        Collections.addAll(set, "MySql","Java");
        System.out.println("set = " + set); // 난 중복 객체를 추가하지 않아 하면서 추가 안함 || 순서 보장 안됨
        
        // set의 크기를 확인 : size();
        int size = set.size();
        System.out.println("size = " + size);

        /*
		 - set은 인덱스가 없기 때문에 메서드를 이용해서 객체를 얻는게 아니라
		  반복자 (Iterator)를 통해서 요소를 하나씩 꺼내 보셔야 합니다.
		  반복자 객체는 set 인터페이스가 제공하는 iterator()를 호출하여
		  얻어옵니다.
		 */
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
            // 잘 나옴 | 내부 로직은 이렇게 돌아감
        }

        PrintUtil.printLine();

        // forEach문 (향상된 for문)을 사용해서 반복문을 순회할 때
        // 리스트의 크기를 마음대로 늘이거나 줄이면 안 된다(없다). -> 조회용도
        // 향상된 for문은 반복문을 시작할 때 구조적으로 컬렉션의 크기 및 사용 가능한 요소를 항상 파악하기 때문에 값의 변경이 일어나면 예외 발생되도록 설계
        for(String s : set){
            System.out.println(s);
            // 향상for문도 잘 나온다 | 얘가 더 편하다.
        }

        // set에서 데이터 삭제 : remove(객체)
        set.remove("JavaScript");
        System.out.println("set = " + set);

        List<String> convertedList = new ArrayList<>(set);

        convertedList.add(1,"JavaScript");
        convertedList.add(2,"Docker");
        convertedList.add(3,"Spring");
        System.out.println("convertedList = " + convertedList);

        Set<String> convertedSet = new HashSet<>(convertedList);
        System.out.println("convertedSet = " + convertedSet);

    }
}
