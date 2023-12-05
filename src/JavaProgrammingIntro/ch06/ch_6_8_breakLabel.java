package JavaProgrammingIntro.ch06;

public class ch_6_8_breakLabel {
    public static void main(String[] args) {
        int sum = 0;

        myExit: while (true) // 무한 반복
            {
                for (int i=0; i<100; i++) // 큰 의미 없지만 반복문 속의 반복문을 위해 작성
                {
                    sum = sum + i;
                    if (sum > 2000)
                    {
                        System.out.printf("%d : %d\n", i, sum);
                        break myExit; // 반복문에 붙은 레이블을 사용하여 레이블에 해당하는 반복문까지 빠져나온다.
                }
            }
        }
    }
}
