package ex00;

class Cal {
    static int add(int a1, int a2) {
        return a1 + a2;
    }

    static int multi(int a1, int a2) {
        return a1 * a2;
    }
}

public class MethEx02 {
    public static void main(String[] args) {
        int r1 = Cal.add(20, 50);
        System.out.println(r1);
        int r2 = Cal.multi(r1, 10);
        System.out.println(r2);
    }
}
