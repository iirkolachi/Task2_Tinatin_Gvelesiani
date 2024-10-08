import java.util.Arrays;
import java.util.OptionalInt;

public class Task8 {
    public static void main(String[] args) {
        int[] ricxvebi = new int[5];
        ricxvebi[0] = 3;
        ricxvebi[1] = 5;
        ricxvebi[2] = 7;
        ricxvebi[3] = 9;
        ricxvebi[4] = 11;

        int jami = ricxvebi[0] + ricxvebi[1] + ricxvebi[2] + ricxvebi[3] + ricxvebi[4];
        System.out.println("Sum of the numbers is " + jami + ".");

        OptionalInt max = Arrays.stream(ricxvebi).max();
        int maxRicxvi = max.getAsInt();
        System.out.println("The max number is " + maxRicxvi + ".");
    }
}
/* მეორე ვარიანტი ციკლებით:
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
*/
