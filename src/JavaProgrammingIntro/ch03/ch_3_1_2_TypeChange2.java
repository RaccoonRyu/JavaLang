package JavaProgrammingIntro.ch03;

public class ch_3_1_2_TypeChange2 {
    public static void main(String[] args) {
        int num = 2147483647;
        // int num2 = 2147483648; // int의 크기보다 큰 값을 초기화하므로 에러 발생
        // long num3 = 2147483648; // 에러 발생. long일 경우 숫자 뒤에 L을 붙여 long형으로 형변환함을 알려야함.
        long num4 = 2147483648L; // 정상 초기화

        // float num5 = 1.0; // float형 초기화시 숫자 뒤에 f를 붙여야하므로 붙이지 않으면 에러 발생
        float num6 = 1.0F;
        
        double num7 = 30; // int -> double로 자동 형변환되므로 정상 초기화
    }
}
