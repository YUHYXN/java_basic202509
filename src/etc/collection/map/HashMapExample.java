package etc.collection.map;

import oop.static_.utils.PrintUtil;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        /*
        # Map은 Key와 value의 쌍으로 이루어진 객체를 저장하는 자료구조입니다.
        - Key는 중복을 허용하지 않으며, value는 중복을 허용합니다.
        - Key를 통해 value를 참조하는 방식이다. (인덱스 x)
        HashMap<Key, Value> map = new HashMap<>();
         */

        // Map은 key와 value의 쌍을 이루기 때문에 멀티 제네릭을 선언한다.
        Map<String, String> map = new HashMap<>();
        
        // Map에 데이터를 추가
        map.put("멍멍이", "강아지");
        map.put("야옹이", "김춘식");
        map.put("방방이", "박방봉");
        System.out.println("map = " + map);

        // key를 중복 사용하는 경우 기존 key의 맵핑된 value가 수정된다.
        map.put("멍멍이", "김춘식"); // key가 중복되면 value가 수정된다.
        map.put("방방이", "강아지"); // key가 중복되면 value가 수정된다.
        System.out.println("map = " + map);

        // key의 존재 유무 확인
        // value 얻기 : get(key);
        String nick = "방방이";
        if(map.containsKey(nick)){
            System.out.printf("별명이 %s인 학생의 이름인 %s입니다.\n", nick, map.get(nick));
        }else {
            System.out.println("그런 별명 또 없습니다.");
        }

        // Map에서 key들만 추출하는 메서드 : keySet()
        // 모든 key를 set에 담아서 반환합니다 -> 향상된 for문 사용 가능.
        for (String k : map.keySet()) {
            System.out.printf("key: %s, valueL %s\n", k, map.get(k));
        }

        PrintUtil.printLine();

        // entrySet() 메서드는 key와 value를 하나의 묶음(Ma.Entry)으로 취급하고,
        // 그 묶음들을 set으로 담아서 전달한다.
        for(Map.Entry<String, String>entry : map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key: %s, value: %s\n", key, value);
        }

        // Map의 객체를 삭제: remove(key)
        map.remove("야옹이");
        System.out.println("map = " + map);
//        map.clear(); // Map 비우기

        // collections의 메서드는 collection 인터페이스 타입을 전달 받기 때문에 Map은 사용이 힘들다.
//        Collections.addAll(map, "1","2","3","4","5"); // error/

    }
}
