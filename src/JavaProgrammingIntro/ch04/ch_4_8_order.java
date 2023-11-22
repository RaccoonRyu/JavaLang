package JavaProgrammingIntro.ch04;

public class ch_4_8_order {
    public static void main(String[] args) {
        System.out.println(); // 내용 없는 println()을 이용한 줄바꿈
        System.out.print("\n"); // 개행 없는 print() 안의 내용으로 특수 문자를 이용한 줄바꿈
        System.out.println("--------------------");

        int num = 5;

        System.out.print(num + '\n'); // 기본 자료형끼리는 산술 연산되므로 줄바꿈 없이 5 + 10 = 15가 출력된다
                                      // int + char 이므로 산술 연산의 결과가 int로 자동 형변환 된다. 5 + '\n'(10) = 15
        System.out.println("--------------------");
        System.out.print(num + "\n"); // int(기본) + String(참조)이므로 String으로 형변환 후 더하기가 실행됨
                                      // 따라서 "5\n"이 되므로, 숫자 5를 화면에 보여주고 줄바꿈(개행 특수문자 \n)한다.
        System.out.println("3 >= 2 : " + (3 >= 2)); // 괄호안의 비교연산을 먼저 수행하고 앞 문자열과 합쳐서 출력
        //System.out.println("3 >= 2 : " + 3 >= 2); // 괄호를 풀면 앞 문자열과 숫자 3이 합쳐지므로 비교가 불가하므로 에러 발생
    }
}
