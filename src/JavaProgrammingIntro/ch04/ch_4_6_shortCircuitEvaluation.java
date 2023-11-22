package JavaProgrammingIntro.ch04;

public class ch_4_6_shortCircuitEvaluation {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        boolean result;
        
        result = ((x = x + 1) < 0) && ((y = y + 1) > 0); // 앞의 x = x + 1 조건절이 false이므로 뒤의 조건절 연산 없이 false 대입
        
        System.out.println("result = " + result);
        System.out.println("x = " + x);
        System.out.println("y = " + y + '\n');
        
        result = ((x = x + 1) > 0) || ((y = y + 1) > 0); // 앞의 x = x + 1 조건절이 true 이므로 뒤의 조건절 연산 없이 true 대입
        
        System.out.println("result = " + result);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
