package etc.stream.comparator;

import oop.static_.utils.PrintUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 15, 79));
        studentList.add(new Student("오로라핑", 18, 98));
        studentList.add(new Student("대길이", 30, 40));
        studentList.add(new Student("춘식이", 7, 20));

        // 리스트를 나이 순으로 오름차 정렬 (작은 숫자가 앞으로)
        // o1에는 홍길동이, o2에는 오로라핑이 들어온다. 15 - 18 이 된다 = -3이 된다. 음수니까 자리를 바꾸지 않는다.
        // +가 나온다면 앞의 수가 더 크다는 뜻이고, -가 나오면 앞의 수가 더 작다는 뜻이다.
        // 그 다음엔 o1에는 오로라핑이, o2에는 대길이가 들어온다. 18 - 30 = -12 음수니까 자리를 바꾸지 않는다.
        studentList.sort((o1, o2) ->  o1.getAge() - o2.getAge());   // 이건 sort 메서드가 비교하는 방식이다.
        System.out.println(studentList);

        PrintUtil.printLine();
        // name 을 '가,나,다' 순으로 정렬
        // o1의 네임을 잡아서 비교해라 (o2의 네임을 잡아서)
        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(studentList);

        PrintUtil.printLine();
        // 성적을 오름차 정렬
        // Comparator.comparing(비교할 기준이 되는 필드가 뭐야?)
        studentList.sort(Comparator.comparing(Student::getScore));  //  난 학생들의 점수로 비교할거야.
        System.out.println("성적 오름차순 = " + studentList);

        PrintUtil.printLine();
        // 성적 내림차 정렬
        studentList.sort(Comparator.comparing(Student::getScore).reversed());
        System.out.println("성적 내림차순 = " + studentList);

        PrintUtil.printLine();
        // 나이 오름차 정렬
        studentList.sort(Comparator.comparing(Student::getAge));
        System.out.println("나이 오름차순 = " + studentList);

        PrintUtil.printLine();
        // 나이 내림차 정렬
        studentList.sort(Comparator.comparing(Student::getAge).reversed());
        System.out.println("나이 내림차순 = " + studentList);

        PrintUtil.printLine();
        // 이름 오름차 정렬
        studentList.sort(Comparator.comparing(Student::getName));
        System.out.println("이름 오름차순 = " + studentList);

        PrintUtil.printLine();
        // 이름 내림차 정렬
        studentList.sort(Comparator.comparing(Student::getName).reversed());
        System.out.println("이름 내림차순 = " + studentList);





    }
}
