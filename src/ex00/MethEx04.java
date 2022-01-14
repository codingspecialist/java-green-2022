package ex00;

// 오버로딩 = over-loading = 과적재

class 사자 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰 {
    String name = "곰";
    int hp = 100;
    int attack = 50;
}

public class MethEx04 {

    // 사자 -> 호랑이 공격
    static void attackLionToTiger(사자 unit1, 호랑이 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 호랑이 -> 사자 공격
    static void attackTigerToLion(호랑이 unit1, 사자 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 호랑이 -> 곰
    static void attackTigerToBear(호랑이 unit1, 곰 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 사자 -> 곰
    static void attackLionToBear(사자 unit1, 곰 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 곰 -> 호랑이
    static void attackBearToTiger(곰 unit1, 호랑이 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    // 곰 -> 사자
    static void attackBearToLion(곰 unit1, 사자 unit2) {
        System.out.println(unit2.name + "가 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp : " + unit2.hp);
    }

    public static void main(String[] args) {
        사자 lion1 = new 사자();
        호랑이 tiger1 = new 호랑이();
        곰 bear1 = new 곰();

        // 호랑이 -> 사자 공격
        attackTigerToLion(tiger1, lion1);
        // 호랑이 -> 곰
        attackTigerToBear(tiger1, bear1);
        // 사자 -> 곰
        attackLionToBear(lion1, bear1);
        // 사자 -> 호랑이
        attackLionToTiger(lion1, tiger1);
        // 곰 -> 호랑이
        attackBearToTiger(bear1, tiger1);
        // 곰 -> 사자
        attackBearToLion(bear1, lion1);
    }
}
