/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
    public static void main(String[] args) {

        int x, y, sumxy;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        sumxy = x + y;

        System.out.println(x + "+" + y + "=" + sumxy);

    }
}
