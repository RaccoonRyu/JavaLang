package JavaProgrammingIntro.ch10;

public class debugStack {
    public static void main(String[] args) {
        // 매개변수, 지역변수가 스택 영역에서 어떻게 처리되는지 확인하는 예제
        // 중단점(Breakpoint)을 사용하여 스택 영역 내 변수 처리 확인
        // 앱을 debug 모드로 실행하면 제일 먼저 main() 메서드에 대한 프레임이 스택에 쌓이고
        // main()의 매개변수 arg가 스택 영역에 생성됨을 확인 가능

        // 이후 선언한 지역변수 또한 프레임 안에 생성
        int num1 = 10;
        int num2 = 20;
        adder(num1, num2);
        System.out.println("----------------");
    }

    // main() 내에서 adder 호출 시 adder() 메서드에 대한 프레임이 스택에 쌓이고
    // adder()의 지역변수인 n1, n2가 스택 영역에 생성됨
    public static int adder(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
    // adder() 메서드의 진행이 끝나면 main() 메서드가 다시 실행되고
    // adder() 관련 프레임은 스택 영역에서 삭제
}
