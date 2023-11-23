package JavaProgrammingIntro.ch02;

public class ch_2_4_DoubleErr2 {
    public static void main(String[] args) {
        double dNum = 0.0;

        for (int i=0; i<1000; i=i+1)
        {
            dNum = dNum + 0.1; // 0.1을 1000번 더함
        }
        System.out.println(dNum); // 총합 100을 예상했으나 이번에도 실수형 연산에서 생기는 오차로 인해 다른 값이 출력된다.
    }
}
