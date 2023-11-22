package JavaProgrammingIntro.ch04;

public class ch_4_5_logical {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 22;
        boolean result;

        result = (num1 > 1) && (num1 < 10); // and 논리 연산
        System.out.println("1 초과 10 미만인가? " + result);

        result = ((num2 % 2) == 0) || ((num2 % 3) == 0); // or 논리 연산
        System.out.println("2 또는 3의 배수인가? " + result);
    }
}
