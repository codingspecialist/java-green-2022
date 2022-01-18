package ex11.p2;

public class AccessEx03 {

    // 아무것도 적지 않으면 default => 같은 패키지에서는 찾을 수 있다.
    void m3() {
        System.out.println("AccessEx03의 m3 메서드입니다.");
    }

    // 같은 클래스 내부에서만 찾을 수 있다.
    private void m4() {
        System.out.println("AccessEx03의 m4 메서드입니다.");
    }

    // private는 통로를 통해서만 호출할 수 있다.
    public void 통로() {
        m4();
    }
}
