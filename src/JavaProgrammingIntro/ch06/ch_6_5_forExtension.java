package JavaProgrammingIntro.ch06;

public class ch_6_5_forExtension {
    public static void main(String[] args) {
       // 2의 배수를 출력하는 프로그램
       // for문의 일부 요소를 생략하여 작성한다.

       int i = 0;
       for( ; i < 10; i++) { // 초기식 생략
           if(i % 2 == 0) System.out.print(i + " ");
       }
       System.out.println();

       i = 0;
       for( ; i < 10; ) { // 초기식, 증감식 생략
           if(i % 2 == 0)
               System.out.print(i + " ");
           i++; // 증감식을 별도로 사용
       }
       System.out.println();

       for(int j = 0; j < 10; j=j+2) { // 증감식 대신 연산 수식
           System.out.print(j + " ");
       }
       System.out.println();
    }
}
