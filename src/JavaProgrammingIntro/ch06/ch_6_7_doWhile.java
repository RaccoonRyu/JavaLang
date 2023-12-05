package JavaProgrammingIntro.ch06;

public class ch_6_7_doWhile {
    public static void main(String[] args) {
        int num = 0;
        int count = 0;

        do
        {
            num++;

            if( (num % 5) != 0 )
                continue;
            if( (num % 7) != 0 )
                continue;

            count++; // 5와 7의 배수인 경우에만 실행
            System.out.println(num); // 5와 7의 배수인 경우에만 실행
            } while(num < 100); // do-while문은 while 조건식 검사 후에 세미콜론(;) 붙음에 유의!

        System.out.println("count: " + count);

        }
}
