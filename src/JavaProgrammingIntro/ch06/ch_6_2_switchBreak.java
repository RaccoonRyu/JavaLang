package JavaProgrammingIntro.ch06;

public class ch_6_2_switchBreak {
    public static void main(String[] args) {

            int n = 6;

            switch(n % 7) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("주중"); // case 1 ~ 5까지 break문을 없애 "주중"이 출력되도록 함
                                               // 이렇게 하면 한번에 여러 개의 값을 묶어서 처리할 수 있다.
                    break;
                case 6:
                    default:
                    System.out.println("주말");
            }
    }
}
