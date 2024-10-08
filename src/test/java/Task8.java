public class Task8 {
    public static void main (String[] args) {
        int[] ricxvebi = {3, 5, 7, 9, 11};

        int jami = 0;
        for (int ricxvi : ricxvebi) {
            jami += ricxvi;
        }
        System.out.println("Sum of the numbers is " + jami + ".");


        int max = ricxvebi[0];
        for (int ricxvi : ricxvebi) {
            if (ricxvi > max) {
                max = ricxvi;
            }
        }
        System.out.println("The max number is " + max + ".");
    }
}
