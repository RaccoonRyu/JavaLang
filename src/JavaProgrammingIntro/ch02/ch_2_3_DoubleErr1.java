package JavaProgrammingIntro.ch02;

public class ch_2_3_DoubleErr1 {
    public static void main(String[] args) {
        double num1 = 1.0000001;
        System.out.println(num1);
        double num2 = 2.0000001;

        System.out.println(num2);
        double result = num1 + num2;
        System.out.println(result); // 계산시 예상된 3.0000002가 출력될 줄 알았으나 다른 값이 출력됨. 이처럼 실수의 연산은 오차가 발생한다.
    }
}
