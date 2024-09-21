package JavaProgrammingIntro.ch09;

class Calc {
    int add(int a, int b) {
        return a+b;
    }

    int add(int a) {
        return a+1;
    }

    double add(double a, double b) {
        return a+b;
    }
}

public class ch_9_1_overloading {
    public static void main(String[] args) {
        // 오버로딩 : 하나의 클래스 내에 매개변수 개수나 자료형은 다르지만 같은 메서드를 여러개 정의하는 것
        // 동일하거나 유사한 일을 수행하는 메서드가 전달받는 매개변수에 따라 각기 다른 연산을 하는 경우 유용함
        Calc calc = new Calc();

        // Calc 클래스의 모든 메서드명이 add()로 동일
        // 하지만 매개변수 개수나 자료형은 다르다.
        int intRtn1 = calc.add(3, 9); // 12 반환 (int형 매개변수 두 개)
        int intRtn2 = calc.add(3); // 4 반환 (int형 매개변수 한 개)
        double dbRtn1 = calc.add(3.0, 9.0); // 12.0 반환 (double형 매개변수 두 개)

        System.out.println("intRtn1 = " + intRtn1);
        System.out.println("intRtn2 = " + intRtn2);
        System.out.println("dbRtn1 = " + dbRtn1);

        // Java에서는 메서드명과 매개변수까지 합쳐서 메서드를 구분
        // 따라서 다른 매개변수를 가진 같은 이름의 메서드를 사용할 수 있다.
    }
}
