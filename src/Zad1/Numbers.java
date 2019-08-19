package Zad1;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        String line = scanner.nextLine();
        int result= 0;
        while ( !"stop".equals(line)){
            try {
                Integer num1 = Integer.valueOf(line);
                result+=num1;

            }
            catch (NumberFormatException e){
                System.out.println("to nie liczba");
            }
            line = scanner.nextLine();
        }
        System.out.println("Wynik:" + result);
    }
}
//    Wczytaj od użytkownika dwie liczby w postaci Stringów.
//        Przekształć te liczby do postaci obiektów typu Integer.
//        Dokonaj autounboxingu i przypisz liczby do zmiennych typu int.
//        Dodaj liczby i wyświetl je na ekranie.
//
//        * Zmodyfikuj powyższy program tak, aby wczytywać od użytkownika napisy tak dłogo, aż wpisze "STOP".
//        Na koniec wyświetl sumę wszystkich podanych przez użytkownika liczb.