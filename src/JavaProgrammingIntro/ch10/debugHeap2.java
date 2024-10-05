package JavaProgrammingIntro.ch10;

public class debugHeap2 {
    public static void main(String[] args) {
        // 디버깅을 통한 힙 영역 객체 참조
        // 힙 영역에 dho 객체 생성 및 스택 영역에 해당 객체를 참조하는 변수 dho1 생성
        debugHeapOuter dho1 = new debugHeapOuter();
        dho1.num = 10;

        // 기 생성된 객체의 참조 변수를 대입 사용하면 객체가 새로 생성되는지 기존 객체를 재사용하는지 확인
        // 기존의 dho 객체를 새로운 참조 변수 dho2에 대입
        debugHeapOuter dho2 = dho1;

        // 디버깅 시 dho2에도 dho1이 참조하고 있던 기존 객체의 id값이 똑같이 들어감을 확인
        System.out.println("dho1.num : " + dho1.num);
        System.out.println("dho2.num : " + dho2.num);
        System.out.println("------------------------");
        // 따라서 대입 연산은 기존 변수의 값을 새로운 변수의 값으로 대입하기 때문에
        // 힙 영역에 새로운 객체를 만드는 것이 아니라 기존 객체를 참조하여 재사용함을 확인할 수 있다.
        // 즉, 힙 영역에 기 생성된 객체를 가리키는 변수만 하나 더 늘어난 것이다.

        // 같은 객체를 참조하는지 확인하기 위해 dho2의 멤버 변수 값 변경
        dho2.num = 20;

        // 디버깅 시 dho1, dho2의 멤버 변수가 함께 변경되어 같은 객체를 참조함을 확인 가능 (dho1.num = dho2.num = 20)
        System.out.println("dho1.num : " + dho1.num);
        System.out.println("dho2.num : " + dho2.num);

    }
}
