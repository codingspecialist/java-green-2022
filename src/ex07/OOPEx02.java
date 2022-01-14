package ex07;

class Doctor {
    String name = "홍길동";
    int sal = 5000;
}

public class OOPEx02 {
    public static void main(String[] args) {
        Doctor dd = new Doctor();
        System.out.println(dd.name);
        System.out.println(dd.sal);
    }
}
