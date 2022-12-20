package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListVsSet2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(101);

        HashSet<Integer> set = new HashSet<>(list1);
        //set.forEach(e -> System.out.println("Set values: " + e));
        List<Integer> list2 = new ArrayList<>(set);

        list2.forEach(e -> System.out.println("List2 values: " + e));

    }
}
