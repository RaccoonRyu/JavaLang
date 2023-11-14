package JavaProgrammingIntro.ch03;

public class ch_3_1_1_TypeChange {
    public static void main(String[] args) {
        int num = 1;
        byte num2 = 1;
        byte num3 = 127;
        // byte num4 = 128; // byte의 크기보다 큰 값을 초기화하므로 에러 발생

        short num5 = 1;
        // num2 = num5; // 타입이 다르면 기존에 초기화된 변수 안의 값이 크거나 작을 수 있으므로 에러 발생
        num2 = (byte) num5; // 명시적으로 형변환하여 변수 안의 값을 알고있으니 문제없이 대입
    }
}
