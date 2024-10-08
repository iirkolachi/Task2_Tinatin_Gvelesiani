public class Task9 {
    public static void main (String[] args) {
        int a = 12;
        int a2 = a * 2 - 5;
        System.out.println(a2);
        System.out.println(shedareba(a));
    }
    public static boolean shedareba(int a) {
        return a > 15 && a < 20;
    }
}
/* რადგან პირობაში გამოტანის ბრძანება იყო, გამოვიყენე return. ეს მეორე ვარიანტი, ბეჭდვის ბრძანებით:
boolean shedareba = a > 15 && a < 20;
System.out.println(shedareba);
 */