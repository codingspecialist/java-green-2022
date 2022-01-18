package ex20;

public class LibEx01 {

    public static void main(String[] args) {
        double num = 10.5;
        double result = Math.abs(-10.0);
        double result2 = Math.ceil(num);
        double result3 = Math.floor(num);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("=================");
        double a = 1234.56789;
        System.out.println(Math.round(a));
    }
}
