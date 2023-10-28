package JavaProgramming.ch02.ch02_01_variable;

public class ch_2_1_1_variable_naming {
    public static void main(String[] args) {
        // int 3number; // 변수 선언은 숫자로 시작할 수 없음
        // int number@; // 선언시 _, $ 이외의 특수문자는 사용 불가능
        // int goto; // 선언시 예약어는 사용 불가능
        
        String userName = "Andy";
        String addr3 = "서울"; // 선언시 숫자는 첫 글자만 아니면 사용 가능
        boolean gotoHome = false; // 선언시 예약어가 포함되는 것은 상관 없음
        double OS_VERSION = 5.0; // 선언시 상수는 모두 대문자를 사용하고, 단어의 연결에는 _(언더바) 를 사용함을 권장
    }
}
