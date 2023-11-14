package JavaProgrammingIntro.ch03;

public class ch_3_1_3_cal1 {
    public static void main(String[] args) {
        byte num11 = 1;
        byte num12 = 2;
        // byte result1 = num11 + num12; // byte -> int로 형변환 후 더하기 연산을 하게 되므로 byte형 변수에 대입하지 못해 에러 발생

        short num21 = 1;
        short num22 = 2;
        // short result21 = num21 + num22; // short -> int로 형변환 후 더하기 연산을 하게 되므로 short형 변수에 대입하지 못해 에러 발생

        short result22 = (short)(num21 + num22); // int 연산 결과를 short로 강제 형변환하므로 에러 발생하지 않음
    }
}
