package Teoria2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TabProblem {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        List<Integer> list1 = List.of(2,3,45); // nie mozna do tego dodawac
        //List
        list.add(5);
        list.add(5);
//        list.add("sdsdf");
        //System.out.println(list.toString());
        int sum = 0;

       // getSum(list, sum);
        LinkedList<Integer> linkList = new LinkedList<>();
        linkList.add(3);

//        int[] number = new int[3];
//        number[0] = 5;
//        number[1] = 10;
//        number[2] = 15;
//
//        int[] biggerTab = new int[10];
//
//        System.arraycopy(number, 0, biggerTab, 0,number.length);
//        biggerTab[3] = 20;
//        System.out.println(Arrays.toString(biggerTab));


    }

    private static void getSum(ArrayList<Integer> list, int sum) {
        for (Integer i: list) {
//            System.out.println(i);
            sum +=i;
        }
    }
}
