package ex07;

/**
 * 문법
 * 클래스 내부 변수는 (상태)는 선언만 한다.
 */

class 사람 {
    String name;
    int height;
    int weight;
}

public class OOPEx06 {
    public static void main(String[] args) {
        사람 s1 = new 사람();
        s1.name = "홍길동";
        s1.height = 50;
        s1.weight = 5;

        사람 s2 = new 사람();
        s2.name = "장보고";
        s2.height = 100;
        s2.weight = 8;

        사람 s3 = new 사람();
        s3.name = "임꺽정";
        s3.height = 70;
        s3.weight = 10;
    }
}
