package stringex;

public class StringEx02 {
    public static void main(String[] args) {
        String s1 = new String("고구마");
        String s2 = new String("고구마");
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);

        if (s1 == s2) {
            System.out.println("같은 문자열이에요.");
        } else {
            System.out.println("다른 문자열이에요.");
        }

        String s3 = "감자";
        String s4 = "감자";

        if (s3 == s4) {
            System.out.println("같은 문자열이에요.");
        } else {
            System.out.println("다른 문자열이에요.");
        }

        if (s1.equals(s2)) {
            System.out.println("같은 문자열이에요.");
        } else {
            System.out.println("다른 문자열이에요.");
        }
    }
}
