package JavaProgrammingIntro.ch06;

public class ch_6_4_for {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++) {
            System.out.print((2 * i) + " ");
        }
        System.out.println();

        // 한 줄만 실행하면 중괄호 생략 가능
        for(int i = 2; i < 10; i++)
            System.out.print((3 * i)+ " ");
        System.out.println();

        // 같은 줄에 한 줄로 작성 가능. 실행 문장의 끝은 세미콜론(;)으로 구분
        // 댜만 반적인 작성 방법은 아니다.
        for(int i = 2; i < 10; i++) System.out.println((4 * 1)+ " ");

        System.out.println();

        // 의도치 않은 결과
        for(int i = 2; i < 10; i++)
            System.out.println((5 * i)+" ");
        System.out.println();
    }
}
