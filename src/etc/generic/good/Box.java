package etc.generic.good;

public class Box<T> {   // 제네릭은 박스 객체가 생성될 때 정해진다.
    private T obj;

    public T getObj(){
        return obj;
    }

    public void setObj(T obj){
        this.obj = obj;
    }
}
