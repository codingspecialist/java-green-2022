package ex11;

// 1. start 메서드에서 name을 출력해보세요!!
// 2. start 메서드에서 name 값을 변경해서 출력해보세요!!
class 애완동물 {
    void sound() {
    }

    // 무효화됨.
    void printName() {

    }

    // 무효화됨.
    void changeName() {

    }
}

class 강아지 extends 애완동물 {

    String name = "강아지";

    void sound() {
        System.out.println("멍멍");
    }
}

class 고양이 extends 애완동물 {

    String name = "고양이";
    int hp = 100;

    void printName() {
        System.out.println(name);
    }

    void changeName() {
        name = "변경된 고양이";
    }

    void sound() {
        System.out.println("야옹");
    }
}

public class ExtendsEx03 {

    static void start(애완동물 u1) {
        u1.sound();
        // System.out.println(u1.name);
        u1.printName();
        u1.changeName();
        u1.printName();
        System.out.println("==============");
    }

    public static void main(String[] args) {
        애완동물 cat = new 고양이(); // 고양이(printName), 애완동물(printName)
        start(cat);

        애완동물 dog = new 강아지(); // 강아지(XXXXX), 애완동물(printName)
        start(dog);
    }
}
