package JavaProgrammingIntro.ch06;

public class ch_6_3_switchString {
    public static void main(String[] args) {
        String name = "홍길동";

        switch(name) // 조건식에 문자열(값 이나 변수) 사용
        {
            case "홍길동":
                System.out.println("제 이름은 홍길동입니다.");
                break;
            case "전우치":
                System.out.println("제 이름은 전우치입니다.");
                break;
            case "손오공":
                System.out.println("제 이름은 손오공입니다.");
                break;
            default:
                System.out.println("같은 이름이 없습니다.");
        }
    }
}
