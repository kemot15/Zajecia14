package Teoria1;


public class demo1 {
    public static void main(String[] args) {
        Integer first = Integer.valueOf(5);
        Integer second = Integer.valueOf("5");
        Integer a = new Integer(7);
        Integer b = new Integer("7");

        System.out.println(first == second);
        System.out.println(first.equals(second));

        System.out.println(a == b);
        System.out.println(a.equals(b));

        Integer c = 5;
        System.out.println(c.toString()); //obiekt - mozna np wywolac toString
        int d  = c;
        System.out.println(d);
    }
}
