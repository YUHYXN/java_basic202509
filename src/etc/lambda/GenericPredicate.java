package etc.lambda;

@FunctionalInterface
public interface GenericPredicate<T> {  // 제네릭 인터페이스 람다 T타입

    boolean test(T t);
}
