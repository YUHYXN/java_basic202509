package etc.api.lang.string;

import java.util.Arrays;

public class StringMethod {

    public static void main(String[] args) {

        // 문자열을 스트링에 접근 str에 넣어두기 가능
        String str = "Hello Java";
        // 문자도 하나의 char[]이라고 생각해도 됨 단일문자의 배열과 인덱스가 존재
        // 쌍따옴표 안에 있는 건 글자던 공백이던 개수에 포함 된다.

        // charAt(index): 문자열 인덱스에 따른 단일 문자를 반환.
        char c = str.charAt(4); // 4번 인덱스는 o 이다.
        System.out.println("4번 인덱스 = " + c);

        // subString(begin, end): 문자열을 범위를 지정해서 부분 추출. || 정말 많이 쓴다. ************
        String ss1 = str.substring(1, 5); // 1번 이상 5번 미만. *** 주의 1번부터 4번까지 된다는 뜻 예시로는 ello 까지 됨
        System.out.println("ss1 = " + ss1);

        String ss2 = str.substring(6); // 6번부터 끝까지 추출.
        System.out.println("ss2 = " + ss2);

        // length(): 문자열의 총 길이 반환.
        int len = str.length();
        System.out.println("len = " + len);

        // indexOf(str): 해당 문자가 있는 인덱스를 반환
        // 해당 문자가 존재하지 않는다면 -1을 리턴.
        int idx1 = str.indexOf("l"); // 앞에서부터 탐색해서 어딘지 알려줌
        System.out.println("idx1 = " + idx1);

        int idx2 = str.lastIndexOf("l"); // 뒤에서부터 탐색해서 어딘지 알려줌
        System.out.println("idx2 = " + idx2);

        // 여러 문자를 전달하면 시작 인덱스를 알려줍니다.
        int idx3 = str.indexOf("Java");
        System.out.println("idx3 = " + idx3);

        String str2 = "HeLLo WoRLd";
        String lower = str2.toLowerCase(); // 일괄 소문자 변경
        System.out.println("lower = " + lower);
        String upper = str2.toUpperCase(); // 일괄 대문자 변경
        System.out.println("upper = " + upper);

        // trim(): 문자열의 앞, 뒤 공백을 제거.
        String name = "                홍길동                   ";
        System.out.println(name.trim() + "님 안녕하세요~!");

        // replace(old, new): 기존 문자열 내부의 old값을 모두 찾아서 new 문자열로 일괄 변경
        String java = "자바는 재밌습니다. 자바 커피는 맛있습니다.";
        System.out.println(java.replace("자바", "java"));
        System.out.println(java.replace("습니", ""));

        // split(구분자): 문자열을 구분자로 구분하여 분할.
        // 분할된 문자들은 String 배열에 담겨서 리턴.
        String phone = "010-1234-5678";
        String[] numbers = phone.split("-");
        System.out.println(Arrays.toString(numbers));

        String pet = "멍멍이, 야옹이, 짹짹이";
        String[] pets = pet.split(", ");
        System.out.println(Arrays.toString(pets));

        System.out.println("------------------------------------------------");

        // 문자열을 정수/실수 변환
        String s1 = "100";  // 얘는 정수처럼 생긴 문자열
        String s2 = "3.14"; // 실수처럼 생긴 문자열
        System.out.println(s1 + s2);    // 그러니까 문자열을 더한거니까 1003.14
        // 문자열 정수|실수로 못바꾸나? 바로 아래로
        // 순수한 정수 or 실수가 아니라면 예외가 발생합니다.
        int i = Integer.parseInt(s1);   // 문자열 s1을 정수로 변환해줘
        double d = Double.parseDouble(s2);  // 문자열 s2를 실수로 변환해줘
        System.out.println(i + d);  // 103.14

        // 기본 타입을 문자열로 변경
        String s = String.valueOf(i);
        System.out.println("s = " + s);


    }

}
