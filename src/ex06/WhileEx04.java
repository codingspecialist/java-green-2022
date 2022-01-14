package ex06;

import java.util.Scanner;

public class WhileEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 2680;
        int restMoney = money;

        while (true) {
            int coin = sc.nextInt(); // 500, 100, 50, 10

            // 남은 동전 출력하는 로직
            System.out.println(coin + "원 =============");
            System.out.println(restMoney / coin + "개");
            restMoney = restMoney % coin; // 180원

            // if문 break;
            if (coin == 10) {
                break;
            }
        }
    }
}
