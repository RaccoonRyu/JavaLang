package JavaProgrammingIntro.ch09;

class Npc { // 클래스 : 객체를 추상화 해놓은 것

    // 클래스 : 객체와 관련된 데이터와 처리 동작을 한데 모은 코드 뭉치
    // 추상화 : 객체와 관련된 데이터(필드)와 처리 동작(메서드)을 추려내는 과정

    // 필드 : 데이터
    String name;
    int hp;

    // 메서드 : 동작
    void say() {
        System.out.println("안녕하세요.");
    }
}

public class ch_9_0_class {
    public static void main(String[] args) {
        // new 키워드를 통해 위에서 작성한 클래스 사용위해 객체 생성(인스턴스화)
        // 객체는 클래스로 구현한 것을 메모리에 탑재해 메모리 주소를 부여한 것
        // 이 때 클래스 타입의 참조 변수는 스택, 생성된 객체는 힙에 적재됨
        Npc npc = new Npc(); // 클래스타입 변수 = 객체 생성 생성자 순 작성

        // 메서드 say() 호출
        npc.say();

        // dot(.)을 사용하여 필드 접근
        // 객체 멤버 변수에 직접 접근
        npc.name = "JH";
        npc.hp = 77;

        System.out.println(npc.name + " : " + npc.hp);

    }
}
