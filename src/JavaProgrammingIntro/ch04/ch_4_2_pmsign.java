package JavaProgrammingIntro.ch04;

public class ch_4_2_pmsign {
    public static void main(String[] args) {
        short num1 = 5;
        System.out.println(+num1); // 결과적으로 불필요한 + 연산 (원래도 + 부호)
        System.out.println(-num1); // 부호를 바꿔서 얻은 결과를 출력
        System.out.println(num1); // num1값은 변하지 않음

        short num2 = 7;
        short num3 = (short)(+num2); // 형변환하지 않으면 오류 발생.
                                     // + 연산자가 연산을 일으키므로 int로 형변환된다. 따라서 short에 대입시 강제 형변환 필요
        short num4 = (short)(-num2); // 형변환하지 않으면 오류 발생
                                     // - 연산자가 연산을 일으키므로 int로 형변환된다. 따라서 short에 대입시 강제 형변환 필요
        System.out.println(num3);
        System.out.println(num4);
    }
}
