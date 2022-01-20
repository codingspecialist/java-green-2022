package lotto;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 2. Scanner로 금액 입력받아서 횟수 정하기
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println("받은 금액 : " + money);
        System.out.println("로또 횟수 : " + money / 1000);
        // 테스트 끝
    }
}
