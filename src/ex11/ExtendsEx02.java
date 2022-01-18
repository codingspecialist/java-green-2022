package ex11;

class 동물 {
    String getName() {
        return "";
    }

    void setHp(int hp) {

    }

    int getHp() {
        return 0;
    }

    int getAttack() {
        return 0;
    }
}

class 늑대 extends 동물 {
    String name = "늑대";
    int hp = 100;
    int attack = 20;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }
}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }
}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }
}

public class ExtendsEx02 {

    static void attack(동물 unit1, 동물 unit2) {
        // unit1(곰)이 unit2(호랑이)를 공격하고 있습니다.
        System.out.println(unit1.getName() + "이 " + unit2.getName() + "을 공격하고 있습니다.");
        unit2.setHp(unit2.getHp() - unit1.getAttack());
        System.out.println(unit2.getName() + "의 hp : " + unit2.getHp());
    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();
        동물 wolf = new 늑대();

        attack(lion, tiger);
        attack(lion, bear);
        attack(tiger, bear);

        attack(wolf, lion);
    }
}
