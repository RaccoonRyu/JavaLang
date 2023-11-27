package JavaProgrammingIntro.ch05;

public class ch_5_0_printf {
    public static void main(String[] args) {
        String name = "Hong Gil Dong"; // 글자들을 저장할 때 사용하는 자료형 String
        int age = 20;
        double height = 175.5;

        System.out.printf("%s의 나이는 %d이고, 키는 %f입니다.\n", name, age, height); // printf()가 줄바꿈을 하지 않기 때문에 '\n' 특수문자 사용
        System.out.printf("%s의 나이는 %d이고, 키는 %.2f입니다.\n", name, age, height); // 실수를 출력하면 너무 길게 출력되기 때문에 소수점 아래 두 자리까지만 출력
    }
}
