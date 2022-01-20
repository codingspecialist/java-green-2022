package ex22;

import java.util.Random;

public class CollectionEx03 {
    public static void main(String[] args) {
        Random r = new Random();

        // HashSet 생성

        while (true) {
            int n = r.nextInt(45) + 1; // 2 = 0~1
            System.out.println(n);
            // HashSet 에 n값을 add해서 저장
            // HashSet 데이터 크기가 6이되면 break
        }
        // HashSet 데이터 출력!!
    }
}
