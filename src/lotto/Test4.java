package lotto;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        // 4. HashSet으로 로또 번호 순서대로 정렬하기
        Random r = new Random();
        HashSet<Integer> lottos = new HashSet<>();

        while (true) {
            int num = r.nextInt(45) + 1;
            lottos.add(num);

            if (lottos.size() == 6) {
                break;
            }
        }

        List<Integer> lottoList = new LinkedList<>(lottos);
        Collections.sort(lottoList);

        System.out.println(lottoList);
        // 테스트 끝
    }
}
