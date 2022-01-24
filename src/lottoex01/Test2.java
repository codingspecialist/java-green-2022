package lottoex01;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 2. Scanner로 금액 입력받아서 횟수 정하기 ex) 5000 -> 5회
        // Mock
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        int count = (int) money / 1000;

        // 눈으로 체크
        System.out.println("받은 금액 : " + money);
        System.out.println("로또 횟수 : " + count);

        // 검증
        if (count == 5) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
