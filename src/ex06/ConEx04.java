package ex06;

public class ConEx04 {
    public static void main(String[] args) {
        // A, B, C, D, F 까지 표현!!
        // else if(조건) => 그게 아니라 이것이라면
        int point = 81;
        if (point >= 90) {
            System.out.println("A학점");
        } else if (point >= 80) { // point 가 89 ~ 80 사이라면?
            System.out.println("B학점");
        } else if (point >= 70) {
            System.out.println("C학점");
        } else if (point >= 60) {
            System.out.println("D학점");
        } else { // 왜 else를 사용해야 할까? 고민!!
            System.out.println("F학점");
        }
    } // 메인 끝

}
