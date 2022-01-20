package stringex;

import java.util.Scanner;

class 이체내역 {
    private String sender; // 보내는 분
    private int senderNumber; // 보내는 분의 계좌번호
    private String receiver; // 받는 분
    private int receiverNumber; // 받는 분의 계좌번호
    private int money;

    public 이체내역(String sender, int senderNumber, String receiver, int receiverNumber, int money) {
        this.sender = sender;
        this.senderNumber = senderNumber;
        this.receiver = receiver;
        this.receiverNumber = receiverNumber;
        this.money = money;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public int getSenderNumber() {
        return senderNumber;
    }

    public void setSenderNumber(int senderNumber) {
        this.senderNumber = senderNumber;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public int getReceiverNumber() {
        return receiverNumber;
    }

    public void setReceiverNumber(int receiverNumber) {
        this.receiverNumber = receiverNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

// 송신자:계좌번호:수신자:계좌번호:금액
public class StringEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();
        System.out.println("전송된 데이터 : " + data);

        String[] tokens = data.split(":");

        // for (int i = 0; i < tokens.length; i++) {
        // System.out.println(tokens[i]);
        // }

        String sender = tokens[0];
        int senderNumber = Integer.parseInt(tokens[1]);
        String receiver = tokens[2];
        int receiverNumber = Integer.parseInt(tokens[3]);
        int money = Integer.parseInt(tokens[4]);

        이체내역 doc1 = new 이체내역(
                sender,
                senderNumber,
                receiver,
                receiverNumber,
                money);

        System.out.println(doc1.getReceiver() + "가 " + doc1.getMoney() + "을 받았습니다.");
    }
}
