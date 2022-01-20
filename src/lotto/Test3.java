package lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        // 3. HashSet으로 로또 번호 받기
        Random r = new Random();
        HashSet<Integer> lottos = new HashSet<>();

        while (true) {
            int num = r.nextInt(45) + 1;
            lottos.add(num);

            if (lottos.size() == 6) {
                break;
            }
        }

        System.out.println(lottos);
        // 테스트 끝
    }
}
