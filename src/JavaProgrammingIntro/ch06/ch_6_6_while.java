package JavaProgrammingIntro.ch06;

public class ch_6_6_while {
    public static void main(String[] args) {
        int num = 0;
        int cnt = 0;

        while((num++) < 100) {
            // if(((num % 5) != 0) || ((num % 7) != 0))
            // continue; // 5와 7의 배수가 아니면 아래 로직을 생략

            if((num % 5) != 0)
                continue;
            if((num % 7) != 0)
                continue;

            cnt++; // 5와 7의 배수이면 해당 코드 포함 아래까지 실행
            System.out.println(num);
        }

        System.out.println("count : " + cnt);
    }
}
