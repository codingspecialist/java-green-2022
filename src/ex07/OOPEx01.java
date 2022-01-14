package ex07;

class Car {
    int speed = 90;
}

public class OOPEx01 {

    public static void main(String[] args) {
        // new는 heap에 할당해라는 키워드
        // Car 클래스가 가지고 있는 static이 아닌 모든 것들이 heap에 뜬다.
        Car s1 = new Car();
        System.out.println(s1.speed);

        Car s2 = new Car();
        System.out.println(s2.speed);

        new Car();
    }
}
