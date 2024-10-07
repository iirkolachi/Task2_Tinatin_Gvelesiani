public class Task5 {
    public static void main (String[] args) {
        int x = 10;
        int y = 14;

        boolean shedareba = x > y;
        System.out.println(shedareba);

        boolean toloba = x == y;
        System.out.println(toloba);

        boolean naklebiAnToli = x <= y;
        System.out.println(naklebiAnToli);


        boolean shedareba2 = x > y || x <= y;
        System.out.println(shedareba2);

        boolean shedareba3 = y == x && y > x;
        System.out.println(shedareba3);

        boolean shedareba4 = !(x > y || x == y);
        System.out.println(shedareba4);
    }
}
