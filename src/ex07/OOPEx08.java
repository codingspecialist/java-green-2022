package ex07;

class Person2 {
    String name;
    int height;
    int weight;

    Person2(String d1, int d2, int d3) {
        name = d1;
        height = d2;
        weight = d3;
    }
}

public class OOPEx08 {
    public static void main(String[] args) {
        Person2 s1 = new Person2("홍길동", 170, 70);
        Person2 s2 = new Person2("임꺽정", 150, 200);
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
