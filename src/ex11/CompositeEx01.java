package ex11;

class 엔진 {
    int power = 5000;
}

// has 관계를 만드는 법 = 콤포지션
// 생성자로 주입 받기
class 소나타 {

    // has 관계 => 소나타는 엔진에 의존적이다.
    // 구체적인 것에 의존하고 있는 강한 결합
    // 추상적인 것에 의존하고 있는 느슨한 결합 (코드 수정이 필요없다.)
    엔진 engine;

    소나타(엔진 engine) {
        this.engine = engine;
    }

}

public class CompositeEx01 {
    public static void main(String[] args) {
        엔진 e = new 엔진();
        소나타 s = new 소나타(e);
        System.out.println(s.engine.power);
    }
}
