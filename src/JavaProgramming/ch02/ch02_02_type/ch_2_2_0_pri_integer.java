package JavaProgramming.ch02.ch02_02_type;

public class ch_2_2_0_pri_integer {
    public static void main(String[] args) {
        byte b1 = -128;
        // byte b2 = 128;
        // 바이트는 -128 ~ 127 까지의 수를 할당 가능하므로 형변환 처리 불가 오류를 발생시킨다.
        System.out.println(b1);

        int i1 = 15; // 10진수 정수 리터럴
        int i2 = 0b1111; // 2진수 정수 리터럴
        int i3 = 017; // 8진수 정수 리터럴
        int i4 = 0xf; // 16진수 정수 리터럴
        System.out.println(i1 + ", " + i2 + ", " + i3 + ", " + i4);

        int i5 = 1_000_000_000; // 언더바(_)를 사용해 큰 수를 표현할 때 천 단위로 끊을 수 있다.
        System.out.println(i5);

        // long l1 = 10000000000;
        // long 타입 표현 시 정수 리터럴 뒤에 L 혹은 l을 붙이지 않으면 오류가 발생한다.
        long l2 = 10000000000L; // long 타입이므로 숫자 뒤에 L을 붙여 초기화 한다.
        System.out.println(l2);
    }
}
