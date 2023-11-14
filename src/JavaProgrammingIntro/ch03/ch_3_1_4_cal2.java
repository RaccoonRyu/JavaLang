package JavaProgrammingIntro.ch03;

public class ch_3_1_4_cal2 {
    public static void main(String[] args) {
        int num31 = 1;
        int num32 = 2;
        int result3 = num31 + num32; // int + int 이므로 int형 변수에 대입 가능

        long num41 = 1;
        long num42 = 2;
        long result4 = num41 + num42; // long + long 이므로 long형 변수에 대입 가능

        long result5 = num31 + num41; // int + long 이므로 int가 long으로 자동 형변환되어 long형 변수에 대입 가능

        float num61 = 1.0f; // float형 초기화시 값 끝에 f나 F 붙이기!
        float num62 = 2.0f;
        float result6 = num61 + num62; // float + float 이므로 float형 변수에 대입 가능

        double num71 = 1.0;
        double num72 = 2.0;
        double result7 = num71 + num72; // double + double 이므로 double형 변수에 대입 가능

        double result8 = num61 + num71; // float + double 이므로 float이 double로 자동 형변환되어 double형 변수에 대입 가능
    }
}
