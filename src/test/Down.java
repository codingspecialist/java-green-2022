package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class 강아지 extends Object {
    @Override
    public String toString() {
        return "안녕";
    }
}

class HelloList extends ArrayList<Integer> {
    @Override
    public String toString() {
        return "메롱";
    }
}

public class Down {
    public static void main(String[] args) {

        // ArrayList, List, Object
        List<Integer> list = new HelloList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());
    }
}
