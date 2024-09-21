package JavaProgrammingIntro.ch09;

class Book {

    // 필드
    String title;
    int price;
    int num = 0;

    // 아무 기능이 없는 디폴트 생성자
    Book() {

        // 디폴트 생성자에 아래처럼 기능을 부여할 수 있다.
        // 객체가 생성될 때 변수에 값을 대입하여 초기화
        title = "자바 프로그래밍";
        price = 30000;

    } // 해당 코드처럼 별도로 작성하지 않아도 자동 생성됨

    Book(String t, int p) { // 생성자 오버로딩
        // 생성자 오버로딩을 통해 클래스의 객체 변수가 생성될 때 다양한 방식으로 변숫값 초기화 가능
        title = t;
        price = p;
    }

    void print() { // 멤버 변수의 값을 출력해주는 메서드
        System.out.println("제목 : " + title);
        System.out.println("가격 : " + price);
        System.out.println("주문 수량 : " + num);
        System.out.println("합계 금액 : " + price * num);
    }
}

public class ch_9_2_constructor {
    public static void main(String[] args) {
        // 생성자 : 객체 생성을 할 때만 호출하는 메서드
        // new 연산자가 객체의 생성자를 이용하여 객체를 생성한다.
        // 생성자 명은 클래스명과 동일하며 메서드이지만 반환형이 없는 형태이다.

        // 디폴트 생성자 : 클래스 정의 시 생성자를 기술하지 않으면 자동으로 생성되는 매개변수가 없는 생성자
        // 생성자명이 클래스명과 동일하며 반환형이 없음
        // 또한 매개변수가 없으며 특별히 수행하는 기능도 없다.
        // 이러한 특성 때문에 프로그래머가 굳이 정의하지 않아도 컴파일러가 클래스명을 보고 자동 생성한다.
        // 따라서 보통 클래스 정의 시 생략하는 경우가 많다.

        Book dfBook = new Book(); // 디폴트 생성자 사용하여 객체 생성
        dfBook.print();

        Book ovBook = new Book("자바 디자인 패턴", 35000); // 오버로딩된 생성자 사용하여 객체 생성
        ovBook.num = 10;
        ovBook.print();

        // 주의점 : 매개변수가 있는 생성자를 오버로딩해서 만들면 디폴트 생성자는 자동으로 생성되지 않음
        // 따라서 생성자를 오버로딩해서 만들고 디폴트 생성자는 만들지 않았을 때 디폴트 생성자로 객체를 생성하면 에러 발생
        // 이 때는 디폴트 생성자에 아무 기능이 없더라도 꼭 명시적으로 작성해주어야 한다.

    }
}
