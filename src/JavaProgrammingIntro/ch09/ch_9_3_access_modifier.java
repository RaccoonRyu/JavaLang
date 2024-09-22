package JavaProgrammingIntro.ch09;

class Student1 {
    String name; // 아무컷도 표시하지 않으면 디폴트. 같은 패키지 내에서만 접근 가능
    int age;
}

class Student2 {
    public String name; // 외부 클래스 어디에서나 접근 가능
    private int age; // 변수/메서드에 private을 적용하면 클래스 외부-내부로의 접근을 제한(정보 은닉화)

    // this 지시어
    // - 인스턴스 자기 자신을 가리키는 키워드
    // - 클래스가 인스턴스화 된 후 자기 자신의 메모리 주소를 가리키고, 해당 인스턴스(현재 객체)를 참조하는 데 사용된다.
    // - 생성자에서 다른 생성자를 호출하거나 인스턴스 자신의 주소를 반환할 때 사용한다.
    public Student2(String name, int age) {
        // 여기서는 클래스의 멤버 변수(this가 붙은 변수)와 매개변수를 구분하는데 사용한다.
        this.name = name;
        this.age = age;
    }

    // getter, setter
    // - private으로 멤버 변수 접근을 제한하더라도 해당 멤버 변수 값을 사용하는 메서드를 제공
    // - 프로그램 의도에 맞게 멤버 변수의 값을 사용하도록 유도할 수 있음
    public int getAge() { // getter : private 멤버 변수 값을 가져오는 메서드
        return this.age;
        // getter를 사용하는 이점 : 변수의 값을 바로 전달하지 않고 가공하여 전달할 수 있음
    }

    public void setAge(int age) { // setter : private 멤버 변수 값을 대입하는 메서드
        if (age < 0 || age > 150) { // 유효성 검사
            System.out.println("적절한 나이를 입력해주세요.");
            this.age = 0;
            return;
        }
        this.age = age;
        // setter를 사용하는 이점 : 변수에 값 대입 시 부적절한 값의 대입을 방지할 수 있음
    }
}

public class ch_9_3_access_modifier {
    public static void main(String[] args) {
        // 접근 제한자
        // 변수나 메서드에 접근 제한자를 지정하여 해당 부분의 접근을 제한할 수 있음
        Student1 student1 = new Student1();
        student1.name = "홍길동";
        student1.age = -20; // 여기까지 멤버 변수 직접 접근

        Student2 student2 = new Student2("전우치", 20);
        student2.name = "손오공";
        //student2.age = -10; // age는 private으로 접근 제한되어 error
        student2.setAge(-10); // setter 사용하여 접근 (부적절한 나이 set)
        int age = student2.getAge();
        System.out.println(student2.name+"의 나이는 "+age+"살 입니다."); // 손오공, 0살(유효성 검사에서 부적절 처리 후) 출력
    }
}
