/**
 * Java class Problem1 calculates the sum of the first 100 numbers higher than 0.
 *
 * @author Victor
 */

public class Problem1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++)
            sum += i;
        System.out.println(sum);
    }
}
