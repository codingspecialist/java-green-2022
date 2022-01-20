package stringex.practice;

public class Test2 {
    public static void main(String[] args) {

        int num = 1;

        for (int i = 0; i < 10; i++) {
            String strNum = String.format("%010d", num);
            System.out.println(strNum);
            num++;
        }

    }
}
