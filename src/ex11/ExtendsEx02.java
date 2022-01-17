package ex11;

class 동물 {

}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;
}

public class ExtendsEx02 {

    // 오버라이딩 = 무효화하다 -> 아래로 타고 내려가는 기법
    // 사자 -> 호랑이 공격
    static void attack(동물 unit1, 동물 unit2) {
        // System.out.println(unit2.name + "가 공격당하고 있습니다.");
        // unit2.hp = unit2.hp - unit1.attack;
        // System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();

        attack(lion, tiger);
        attack(lion, bear);
    }
}
