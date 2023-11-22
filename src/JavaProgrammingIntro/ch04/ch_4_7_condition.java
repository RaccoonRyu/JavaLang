package JavaProgrammingIntro.ch04;

public class ch_4_7_condition {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 100;
        
        int big = (num1 > num2) ? num1 : num2; // 조건식 false 이므로 num2가 대입됨
        System.out.println("큰 수 : " + big);
        
        int diff = (num1 > num2) ? (num1 - num2) : (num2 - num1); // 조건식이 false 이므로 num2 - num1이 대입됨
        System.out.println("두 수의 차 : " + diff);
    }
}
