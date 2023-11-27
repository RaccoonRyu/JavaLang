package JavaProgrammingIntro.ch05;

import java.util.Scanner; // Scanner 클래스 임포트

public class ch_5_1_Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        System.out.println("숫자를 1 2 3 이렇게 입력하고 엔터를 입력하세요."); // 입력 대기

        int num1 = sc.nextInt(); // 입력 대기
        int num2 = sc.nextInt();
        int num3 = sc.nextInt(); // 여러 숫자 입력 시 버퍼에 내용 넣고 입력한 내용을 공백 혹은 탭으로 구분하여 변수에 대입

        System.out.println("숫자를 1 입력하고 엔터를 입력하세요.");
        int num4 = sc.nextInt();
        System.out.println("숫자를 2 입력하고 엔터를 입력하세요.");
        int num5 = sc.nextInt();
        System.out.println("숫자를 3 입력하고 엔터를 입력하세요.");
        int num6 = sc.nextInt();

        System.out.printf("%d %d %d %d %d %d", num1, num2, num3, num4, num5, num6);
    }
}
