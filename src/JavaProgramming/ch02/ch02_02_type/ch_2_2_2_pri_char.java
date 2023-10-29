package JavaProgramming.ch02.ch02_02_type;

public class ch_2_2_2_pri_char {
    public static void main(String[] args) {
        char c1 = 'A'; // 문자형에는 하나의 문자만을 표현할 수 있다.
        char c2 = '\u0041'; // 특정 문자에 해당하는 유니코드를 입력하여 초기화할 수 있다.
        // \t(탭)과 \n(새줄) 삽입 (아스키코드의 특수 문자 표현)
        System.out.println("문자 출력 : " + c1 + '\t' + c2 + '\n');

        int i = c1 + 1; // 문자는 아스키코드로 연결된 정수형 숫자이므로 일반적인 정수처럼 연산할 수 있다.
        System.out.println(i);
        System.out.println((char) i);
    }
}
