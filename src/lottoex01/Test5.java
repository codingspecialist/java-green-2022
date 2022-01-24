package lottoex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Test5 {
    public static void main(String[] args) {
        // 5. 로또 세트(HashSet) 5개를 ArrayList에 담기
        // Mock
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        HashSet<Integer> h3 = new HashSet<>();
        HashSet<Integer> h4 = new HashSet<>();
        HashSet<Integer> h5 = new HashSet<>();

        // 테스트
        ArrayList<HashSet<Integer>> list = new ArrayList<>();
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);

        // 눈으로 확인
        System.out.println(list);

        // 검증
        if (list.size() == 5) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
