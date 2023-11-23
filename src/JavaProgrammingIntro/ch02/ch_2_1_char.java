package JavaProgrammingIntro.ch02;

public class ch_2_1_char {
    public static void main(String[] args) {
        // 아래 4개의 코드는 각 변수에 'A'를 다양한 형식으로 초기화했다.
        char ch1 = 'A'; // 자바가 인코딩을 한다.
        char ch2 = 65; // 10진수로 직접 문자의 값을 넣어준다.
        char ch3 = 0x41; // 16진수로 직접 문자의 값을 넣어준다.
        char ch4 = 0b0000000001000001; // 2진수로 직접 문자의 값을 넣어준다.

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
    }
}
