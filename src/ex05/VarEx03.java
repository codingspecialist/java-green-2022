package ex05;

public class VarEx03 {
    public static void main(String[] args) {
        int n1 = 10; // 4Byte
        long n2 = 20; // 8Byte
        double n3 = 30.1; // 8Byte
        boolean n4 = true; // or false 1bit

        double t1 = n1; // 묵시적 형변환
        int t2 = (int) n3; // 명시적 형변환
        System.out.println(t1);
        System.out.println(t2);

        long t3 = n1;
        int t4 = (int) n2;
    }
}
