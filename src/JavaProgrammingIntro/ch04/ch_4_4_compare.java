package JavaProgrammingIntro.ch04;

public class ch_4_4_compare {
    public static void main(String[] args) {
        System.out.println("2 >= 1 : " + (2 >= 1));
        System.out.println("2 <= 1 : " + (2 <= 1));
        
        // 1.0과 1은 실수와 정수인데도 결과가 T/F -> 따라서 비교 연산 시에도 형변환이 일어남을 알 수 있음
        System.out.println("1.0 == 1 : " + (1.0 == 1));
        System.out.println("1.0 != 1 : " + (1.0 != 1));
    }
}
