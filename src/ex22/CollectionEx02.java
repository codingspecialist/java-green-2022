package ex22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionEx02 {
    public static void main(String[] args) {
        // 제네릭에는 기본자료형을 담을 수 없다. Wrapper 클래스 필요!!
        Set<Integer> datas = new HashSet<>();
        datas.add(10);
        datas.add(20);
        datas.add(20);
        datas.add(30);
        datas.add(40);

        datas.remove(10);

        System.out.println(datas.size());
        System.out.println(datas);

        Iterator<Integer> its = datas.iterator();
        while (its.hasNext()) {
            System.out.println(its.next());
        }
    }
}
