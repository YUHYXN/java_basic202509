package etc.api.lang.string;

public class StrBuilderExample {

    public static void main(String[] args) {

        // str의 객체가 계속 생성된다.
        String str = "Hello";
        System.out.println(str.hashCode());
        // 찍어보면 주소가 계속 바뀌고 객체가 계속 생성됨
        str = "Hello world!";
        System.out.println(str.hashCode());

        str = "Hello~!";
        System.out.println(str.hashCode());

        System.out.println("=========================================");

        // 위 문제의 해결방법은 이것이다. StringBuilder로 부르고 sb만 찍으면 됨
        // 터미널 찍어보면 문자가 바뀌어도 주소는 유지가됨 (객체가 계속 생성되지 않아 메모리가 불필요하게 쓰이지 않음)
        // StringBuilder: 문자열을 더하고, 변경하고, 삭제하는 등의 작업에 최적화된 클래스
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        System.out.println("sb의 주소값 = " + sb.hashCode());

        // 문자열을 맨 끝에 추가하는 메서드: append(문자열)
        sb.append(" world");
        System.out.println(sb);
        System.out.println("sb의 주소값 = " + sb.hashCode());

        // 문자열을 특정 인덱스에 삽입하는 메서드: insert(인덱스, 문자열)
        // 심지어 문자열 중간에도 삽입 가능;;
        sb.insert(6, "my ");
        System.out.println(sb);
        System.out.println("sb의 주소값 = " + sb.hashCode());

        // 특정 인덱스 범위의 문자열을 교체하는 메서드: replace(begin, end, 문자열)
        sb.replace(6, 8, "your");
        System.out.println(sb);

        // 문자열 내의 특정 단어를 삭제하는 메서드 delete(begin, end)
        sb.delete(6, 11);
        System.out.println(sb);
        System.out.println("sb의 주소값 = " + sb.hashCode());

        // 문자열을 역순으로 배치
        sb.reverse();
        System.out.println(sb);



    }

}
