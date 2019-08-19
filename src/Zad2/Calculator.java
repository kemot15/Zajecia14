package Zad2;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int qtyNum = 3;
        ArrayList<Double> arrayList = getNumbers(qtyNum);
        showList(arrayList);
        System.out.println(getSum(arrayList));
        System.out.println(getMultiply(arrayList));
        showMax(arrayList);

    }

    private static ArrayList<Double> getNumbers (int qtyNumbrs)
    {
        ArrayList<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj " + qtyNumbrs +" liczb");
        for (int i = 0; i < qtyNumbrs; i++) {
            list.add(scanner.nextDouble());
        }
        return list;
    }

    private static double getSum (ArrayList<Double> list){
        double result = 0;
        int i =0;
        for (Double num: list) {
            if(i%2==0)
            result +=num;
            i++;
        }
        return result;
    }

    private static double getMultiply (ArrayList<Double> list){
        double result = 0;
        int i =0;
        for (Double num: list) {
            if(i%2!=0)
                result +=num;
            i++;
        }
        return result;
    }

    private static void showList (ArrayList<Double> list){
        int size = list.size();
        for (Double num : list) {
            System.out.println(list.get(size-1));
            size--;
        }
    }

    private static void showMax (ArrayList<Double> list){
        double max = 0;
        for (int i = 0; i < list.size() ; i++) {
            if (max<list.get(i))
                max = list.get(i);

        }
        //System.out.println(Collection<list>.max);
        System.out.println(max);

    }
}



//    Stwórz listę, która będzie przechowywała liczby typu Double. Wprowadź od użytkownika 10 liczb i zapisz je w liście.
//    Wyświetl na ekranie:
//
//        elementy listy w kolejności odwrotnej niż kolejność w jakiej zostały dodane
//        sumę elementów na parzystych indeksach listy
//        iloczyn elementów na nieparzystych indeksach listy
//        największy element zapisany w liście