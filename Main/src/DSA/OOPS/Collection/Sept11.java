package DSA.OOPS.Collection;

import java.util.*;

public class Sept11 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(1,58);

        list2.add(300);
        list2.add(38);
        list2.add(33);
        list.addAll(list2);
//        list2.add(39);
        System.out.println("list:"+list);
//        list.remove("5");
        list.remove(Integer.valueOf(5));
        System.out.println("list:"+list.size());
        System.out.println("list:"+list);
        System.out.println("list2"+list2);

    }

}
