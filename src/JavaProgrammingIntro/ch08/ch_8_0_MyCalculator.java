package JavaProgrammingIntro.ch08;

import java.util.Scanner; // 입력 처리를 위해 Scanner 클래스를 import한다.
public class ch_8_0_MyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 처리를 위한 Scanner 클래스 생성

        while(true) {
            showMenu(); // 메뉴 출력을 위한 함수 실행

            //int num = sc.nextInt(); // 메뉴에 사용할 숫자 입력받기(As-IS)
            char myChar = sc.nextLine().charAt(0); // 새로운 메뉴 숫자 입력 코드 (유효성 검사 추가)
            if(!checkNum(myChar)) {
                System.out.println("숫자가 아닌 문자를 입력했습니다.");
                continue; // 입력한 문자가 숫자가 아닌 경우 메뉴 출력을 반복한다.
            }

            int num = myChar - '0';
            if (num == 0) // 숫자 0 입력시 반복문 종료
            {
                break;
            } else {
                if (num > 4)
                {
                    System.out.println("메뉴를 잘못 선택했습니다.");
                    continue; // 입력 받은 값이 0이 아니지만 메뉴에 해당하는 숫자가 아닌 경우 다시 메뉴 출력
                }
                // 추후 더하기, 빼기, 곱하기, 나누기 실행 코드를 작성할 위치
                System.out.println("첫 번째 숫자");
                int num1 = sc.nextInt();

                System.out.println("두 번째 숫자");
                int num2 = sc.nextInt();

                if(num == 1) addNum(num1, num2);
                if(num == 2) minusNum(num1, num2);
                if(num == 3) multiplyNum(num1, num2);
                if(num == 4) divideNum(num1, num2);
            }
        }
        System.out.println("계산기를 종료합니다."); // 계산기 종료 메시지 (반복문 종료)
    }

    public static void showMenu() // 사용자에게 보여줄 메뉴를 메서드로 작성
    {
        System.out.println("메뉴를 선택하세요.");
        System.out.println("1.더하기");
        System.out.println("2.빼기");
        System.out.println("3.곱하기");
        System.out.println("4.나누기");
        System.out.println("0.끝내기");
    }

    // 사칙연산 기능을 메서드로 작성하여 추가
    public static void addNum(int num1, int num2) // 더하기
    {
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
    public static void minusNum(int num1, int num2) // 빼기
    {
        int result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
    }
    public static void multiplyNum(int num1, int num2) // 곱하기
    {
        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
    }
    public static void divideNum(int num1, int num2) // 나누기
    {
        int result1 = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result1);
        int result2 = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + result2);
    }

    // 상술한 메서드에서 사용할 변수의 유효성을 검사하는 메서드
    // char형 데이터를 매개변수로 받아 0~9 사이의 숫자인지 확인하고, 숫자인 경우 true 반환하는 메서드
    public static boolean checkNum(char ch) {
        if(ch >= '0' && ch <= '9') {
            return true;
        } else {
            return false;
        }
    }
}
