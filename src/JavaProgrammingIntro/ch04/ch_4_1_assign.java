package JavaProgrammingIntro.ch04;

public class ch_4_1_assign {
    public static void main(String[] args) {
        short num = 10;
        num += 77L; // 사람의 강제 형변환 필요하지 않음 (short + long 이므로 long 자동 형변환)
        System.out.println(num);

        num = (short)(num + 77L); // 형변환 필요 (더하는 시점에는 short을 long으로 형변환하기 때문에 short형에 대입 불가)
        System.out.println(num);
    }
}
