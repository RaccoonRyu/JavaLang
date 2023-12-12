package JavaProgrammingIntro.ch07;

public class ch_7_2_VariableScope {
    public static void main(String[] args) {
        boolean myState = true;
        int num1 = 11;

        if (myState)
        {
            //int num1 = 22; // 같은 영역에서는 같은 이름의 변수가 존재할 수 없기 때문에 에러 발생
            num1++;
            System.out.println(num1);
        }

        {
            int num2 = 33;
            num2++;
            System.out.println(num2);
        }
        //System.out.println(num2); // num2 는 15~19행 사이에 선언된 변수이므로 해당 영역에서 사용 불가하여 에러 발생

        for (int i=0; i<3; i++)
        {
           System.out.println(i);
        }

        //System.out.println(i); // i는 for문 안에서만 사용할 수 있는 변수이기 때문에 에러 발생
    }
}
