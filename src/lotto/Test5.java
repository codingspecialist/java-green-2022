package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        // 5. HashSet 로또 번호 5개 세트를 ArrayList에 저장하기
        Random r = new Random();

        ArrayList<List<Integer>> buyLottos = new ArrayList<>();

        // 5바퀴 돌리자.
        // 왜 한번밖에 안나오지? 아!! lottos가 한번만 new 되서 그렇쿠낭!!
        for (int i = 0; i < 5; i++) {

            // 실행이 안된다. 버그다. 터미널 끄고 다시 켜보자.
            // 이제 lottos를 ArrayList에 저장만 하면 되겠다.
            HashSet<Integer> lottos = new HashSet<>(); // 5번 new 하자!

            // for안에 while을 옮겼다.
            while (true) {
                int num = r.nextInt(45) + 1;
                lottos.add(num);

                if (lottos.size() == 6) {
                    break;
                }
            }

            List<Integer> lottoList = new LinkedList<>(lottos);
            Collections.sort(lottoList);

            // 이건 로또 번호 한세트이다. 이게 5개 필요하다.
            // 아맞다. 정렬한다고 List<Integer> 이 타입으로 변경했었지?
            buyLottos.add(lottoList);

        } // end of for문

        // 이제 잘 담겼는지 출력해보자.
        for (int i = 0; i < buyLottos.size(); i++) {
            System.out.println(buyLottos.get(i));
        }

        // 와우 잘 담김.
        // 테스트 끝!
    }
}
