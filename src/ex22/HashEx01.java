package ex22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashEx01 {
    public static void main(String[] args) {
        // 1. 순차적으로 데이터를 저장하고 싶을 때
        List<Integer> arr1 = new ArrayList<>(); // 0, 1, 2
        arr1.add(1);
        arr1.add(2);
        System.out.println(arr1); // toString() 메서드가 호출됨.

        // 2. 데이터의 중복을 피하고 싶을 때
        Set<String> arr2 = new HashSet<>();
        arr2.add("안녕1");
        arr2.add("안녕2");
        arr2.add("안녕2");
        System.out.println(arr2);

        // 3. 키값으로 데이터를 검색하고 싶을 때
        Map<String, String> arr3 = new HashMap<>();
        arr3.put("name", "황재민");
        arr3.put("gender", "남");
        arr3.put("phone", "0103333");

        System.out.println(arr3.get("name"));
        System.out.println(arr1.get(0));
        System.out.println(arr3.get("phone"));
    }
}
