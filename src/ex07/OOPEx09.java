package ex07;

class Person3 {
    String name;
    int height;
    int weight;

    Person3(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class OOPEx09 {
    public static void main(String[] args) {
        Person3 s1 = new Person3("홍길동", 170, 70);
        Person3 s2 = new Person3("임꺽정", 150, 200);
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
