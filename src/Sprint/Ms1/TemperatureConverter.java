package Sprint.Ms1;

public class TemperatureConverter {
    public static void main(String[] args) {
        //온도 변환 프로그램을 작성하세요. 섭씨 25도를 화씨와 켈빈으로 변환하여 출력하세요.
        //화씨 = 섭씨 * 9/5 + 32
        //켈빈 = 섭씨 + 273.15
        //형변환을 적절히 사용하여 정확한 실수 계산이 되도록 하세요.

        //출력예시
        //섭씨: 25
        //화씨: 77.0
        //켈빈: 298.15

        int celsius = 25;

        // 화씨 변환 (정확한 실수 계산)
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        // 켈빈 변환
        double kelvin = celsius + 273.15;
        //결과 출력
        System.out.println("섭씨: " + celsius);
        System.out.println("화씨: " + fahrenheit);
        System.out.println("켈빈: " + kelvin);

        //9.0, 5.0을 사용하여 자동으로 double 계산이 되도록 했습니다
        //또는 (double)celsius로 명시적 형변환을 사용할 수 있습니다
        //정수끼리 나눗셈하면 소수점이 버려지므로 주의해야 합니다
        //실제 변환 공식을 정확히 구현했습니다
    }
}
