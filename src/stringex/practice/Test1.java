package stringex.practice;

public class Test1 {
    public static void main(String[] args) {
        String str1 = "A"; // 65
        String str2 = "B"; // 66
        // 기준값 str1이 str2보다 크면 1
        // 기준값 str1이 str2보다 작으면 -1
        // 기준값 str1이 str2과 동일하면 0
        // 아스키값으로 크기 비교
        int compareTo = str1.compareTo(str2);
        System.out.println(compareTo);
    }
}
