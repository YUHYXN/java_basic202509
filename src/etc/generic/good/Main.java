package etc.generic.good;

import java.util.List;

// Calculator에 들어갈 제네릭 타입은 Number나 그를 상속받은 자식 클래스만 가능.
class Calculator<T extends  Number>{    // T에 들어올 수 있는 것은 Number와 그 자손들만 가능으로 타입 제한

    private final T number;

    public Calculator(T number){
        this.number = number;
    }

    public void calcDouble(){
        System.out.println(number.doubleValue());   // Number의 메서드 사용 가능
    }

}

public class Main {

    // 리턴 타입 앞에 <T>를 작성해야 제네릭 메서드로 인식 된다.
    public static <T> void printArray(T[] inputArray){
        for (T t : inputArray){
            System.out.println(t);
        }
    }

    // 1. Upper Bounded Wildcards (상한 제한) 와일드카드를 사용할 때 리턴 타입 앞에 제네릭을 작성 안 해도 된다.
    // 전달되는 매개값에 제네릭 타입을 제한하고 싶을 때 사용한다.
    // 전달된 리스트에는 새로운 요소 추가는 불가하다(어떤 타입인지 알 수가 없어서, null 만 넣을 수 있음 새로운 타입 불가)
    public static double sumOfList(List<? extends Number> list){
        // 위에랑 다르게 얘는 리스트타입으로 결정난 것임, 리스트를 보낼 때 리스트가 넘버를 상속한 어쩌고 보장받기 위한 ㅇㅇ
        double sum = 0.0;
        for (Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }

    // 2. Lower Bounded Wildcards (하한 제한)
    // Integer이거나, Integer의 부모(Number, Object)의 리스트만 받을 수 있다.
    // 타입이 세가지로 정해져있어서 새로운 요소 추가 가능
    public static void addNumbersToList(List<? super Integer> list, int count){
        for (int i = 0; i < count; i++) {
            list.add(i + 1);
        }
    }

    // 3. Unbounded Wildcards (제한 없는 와일드카드)
    // 어떤 타입이든 상관없다. -> 모든 타입 가능 -> Object 타입으로 처리되니까 주의!!
    // 새로운 요소 추가 불가(타입을 알 수 없음)
    public static void printList(List<?> list){

    }


    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setObj("안녕 강유현!");
        int length = box.getObj().length();

        Box<Person> pBox = new Box<>(); // Person 객체만 담는다.
        pBox.setObj(new Person());
        String name = pBox.getObj().getName();
    }
}
