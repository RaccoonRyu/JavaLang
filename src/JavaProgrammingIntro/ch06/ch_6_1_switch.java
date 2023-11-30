package JavaProgrammingIntro.ch06;

public class ch_6_1_switch {
    public static void main(String[] args) {
        int n = 4;

        switch(n % 3) // 조건식에 연산식을 넣어줄 수 있다. (물론 그냥 변수만 넣어줄 수 있음.)
        {
            case 1:
                System.out.println("나머지가 1");
                break;

            case 2:
                System.out.println("나머지가 2");
                break;

            default:
                System.out.println("나머지가 0");
        }
    }
}
