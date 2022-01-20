package lotto;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        // 6. 2개의 List 데이터 비교하기

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7); // 3번지가 다르구나
        list1.add(15);
        list1.add(20);

        list2.add(1);
        list2.add(3);
        list2.add(5);
        list2.add(7); // 3번지가 다르구나
        list2.add(15);
        list2.add(21);

        // 출력해보자
        System.out.println(list1);
        System.out.println(list2);

        // 눈으로 보니 같은 데이터이니까 맞네!!
        // 컴퓨터로 동일한지 판단하는 알고리즘 필요!!

        // 각 lotto 들은 6개의 데이터를 정렬해서 가지고 있으니까 하나씩 비교하려면
        // for문이 6번 돌아야 한다.

        // 여기 for문 돌기전에 check할 수 있는 변수를 하나 만들자.
        boolean failCheck = false;
        for (int i = 0; i < 6; i++) {
            // for문 안에서 같은 index끼리 비교하면 될것 같다.
            // 이제 로또 당첨된 건 간단할 듯하다. 다른게 하나라도 있으면 꽝, 그게 아니면 당첨
            if (list1.get(i) != list2.get(i)) {
                failCheck = true; // 하나라도 틀린게 나오면 꽝이니까 true로 변경해주자.
                System.out.println("로또 꽝입니다.");
                // 하나라도 틀렸으면 꽝이니까 당연히 break로 반복문 for 빠져나가자.
                break;
            }
        }

        // 그런데 동일하면 아무런 메시지가 없다. 이걸 해결해야 할듯.
        if (failCheck == false) {
            System.out.println("로또 당첨되었습니다.");
        }

        // 잘된다!! ㅎ 테스트 끝
    }
}
