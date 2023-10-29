package JavaProgramming.ch02.ch02_02_type;

public class ch_2_2_1_pri_float_double {
    public static void main(String[] args) {
        // float f1 = 3.14;
        // float 타입 변수에 실수를 할당할 때에는 실수값 뒤에 f 또는 F를 추가해야하므로 오류 발생
        float f2 = 3.14f;

        double d1 = 3.14;
        System.out.println(d1);

        double d2 = 3.14e2; // 지수를 표현하기 위해 e를 사용할 수 있다.
        System.out.println(d2);

        double d3 = 3.14e-2; // 지수를 표현하기 위해 e를 사용할 수 있다.
        System.out.println(d3);

        // 출력 결과의 유효 숫자 비교
        float f3 = 0.1234567890123456789f;
        double d4 = 0.1234567890123456789;
        System.out.println(f3);
        System.out.println(d4);
    }
}
