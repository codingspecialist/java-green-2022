package ex11;

// 하나의 자바 파일에 두개의 public class 가 있을 수 없다. import 때문에!!
class 엘리스 {
    private int 목마름; // 0 ~ 100

    엘리스(int 목마름) {
        this.목마름 = 목마름;
    }

    public void 물마시기() {
        // 손대지마!!
        목마름 = 목마름 - 20;
    }

    public int 갈증확인하기() {
        return 목마름;
    }

}

public class AccessEx05 {

    public static void main(String[] args) {
        엘리스 e1 = new 엘리스(100);

        // 자바는 기본자료형과 문자를 더하면 결합이 되고 문자열 타입으로 변환된다.
        System.out.println("엘리스의 갈증지수 : " + e1.갈증확인하기());
        e1.물마시기();
        System.out.println("엘리스의 갈증지수 : " + e1.갈증확인하기());

        // 신입
        e1.물마시기();
        e1.물마시기();
        System.out.println("엘리스의 갈증지수 : " + e1.갈증확인하기());
    }
}
