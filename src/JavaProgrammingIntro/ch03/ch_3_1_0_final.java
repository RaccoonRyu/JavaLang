package JavaProgrammingIntro.ch03;

public class ch_3_1_0_final {
    public static void main(String[] args) {
        final int MAX_NUM = 100; // 선언과 동시에 초기화
        final int MIN_NUM; // 선언만

        MIN_NUM = 60; // 나중에 초기화. 상수이므로 단 한번만 가능하다

        // final 상수를 사용하는 이유
        int myScore = 40;

        if(myScore < MIN_NUM) { // final을 사용하면 이전에 초기화된 60이란 값이 다른 값의 대입으로 바뀌지 않기 때문
            System.out.println("당신의 등급은 F입니다.");
        }
    }
}
