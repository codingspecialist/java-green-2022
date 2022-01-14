package ex07;

class 질럿 {
    String name = "질럿";
    int hp = 100;
    int attack = 10;
}

public class OOPEx05 {
    public static void main(String[] args) {
        질럿 z1 = new 질럿();
        질럿 z2 = new 질럿();
        질럿 z3 = new 질럿();

        z1.hp = 50;
        z2.hp = 70;
        z3.hp = 1;

        System.out.println("질럿1의 hp는 " + z1.hp);
        System.out.println("질럿2의 hp는 " + z2.hp);
        System.out.println("질럿3의 hp는 " + z3.hp);
    }
}
