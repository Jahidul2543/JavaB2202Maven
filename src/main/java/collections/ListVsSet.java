package collections;

import java.util.HashSet;
import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(100);
        hashSet.add(200);
        hashSet.add(300);
        System.out.println(hashSet);
        // Set does not allow duplicate
        hashSet.forEach(e -> System.out.println("HashSet Elements: " + e));

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(101);
        //list.forEach(e -> System.out.println("List Elements: " + e));
        // Simply print list items
        for ( Integer i : list) {
            System.out.println(i);
        }

        Set<Integer> hashSet1 = new HashSet<>();
        // Get value from the list and Insert same values into the hashSet1
        //list.forEach(e -> hashSet1.add(e));
        for ( Integer i : list) {  //
            hashSet1.add(i);
        }
        // Get value out of the set
        hashSet1.forEach(e -> System.out.println("Set Elements: " + e));

        List<Integer> list2 = new ArrayList<>();
        for ( Integer i : hashSet1) {
            list2.add(i);
        }
        list2.forEach(e -> System.out.println("List2 with unique values: " + e));
    }
}

/**
 * List of Students id where there are number of duplicate id's available.
 * Remove duplicate id's and create a list with only unique values
 * 1. Create a set
 * 2. Store all values from the list to newly created set
 * 3. Now I have set with unique values, lets store all the values form the set in
 * a new list named list2
 * 4. Consume the list2 values ~ Print list two values to show absense of duplicate values
 *
 *
 *
 * */