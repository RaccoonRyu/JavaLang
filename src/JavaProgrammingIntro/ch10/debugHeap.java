package JavaProgrammingIntro.ch10;

public class debugHeap {
    public static void main(String[] args) {
        // 객체 변수가 스택, 힙 영역에서 처리됨을 확인하는 예제
        // 힙 영역에 debugHeapOuter 클래스형의 객체를 생성
        // 이후 해당 객체를 참조하는 참조 변수들(dho1, dho2)은 참조에 사용할 id를 갖고 스택 영역에 생성됨
        debugHeapOuter dho1 = new debugHeapOuter();
        debugHeapOuter dho2 = new debugHeapOuter();

        dho1.num = 10;
        dho2.num = 20; // 각 dho 객체의 멤버 변수에 값 대입

        System.out.println(dho1.num);
        System.out.println(dho2.num); // 각 dho 객체의 멤버 변수 값 정상 출력

        dho1 = null;
        dho2 = null; // 각 dho 객체 참조 변수에 null 대입하여 참조 관계 끊기

        // 추후 참조 관계가 끊어진 힙 영역의 객체는 해당 객체를 아무것도 참조하지 않음을 가비지 컬렉터가 확인하여 제거 표시함
    }
}
