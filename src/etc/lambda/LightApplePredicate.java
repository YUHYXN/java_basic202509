package etc.lambda;

public class LightApplePredicate implements ApplePredicate {

    // 이걸 filterAppleByWeight 메서드에 전달해줄거야 그럼 filterAppleByWeight 메서드는 LightApplePredicate의 test 메서드를 호출할거야
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() <= 100;
    }
}
