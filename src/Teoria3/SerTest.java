package Teoria3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SerTest {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(3); //nie bedzie dodany bo set jest unikatowy

        Set<Integer> treeSet = new TreeSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(3);

        int size = integerSet.size();
        System.out.println(size);

        boolean contains = integerSet.contains(2);
        System.out.println(contains);

        System.out.println(integerSet);
    }
}
