package ex06;

public class ForEx02 {
    // 2의 32승을 출력하시오.
    public static void main(String[] args) {
        long result = 1;
        for (int i = 1; i < 32 + 1; i = i + 1) {
            System.out.println(i);

            // 연산!!
            result = result * 2;
        }
        // 여기서 출력!!
        System.out.println(result);
    }

}
