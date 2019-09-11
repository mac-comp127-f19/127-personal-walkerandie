package basicjava;

import java.util.Scanner;

public class OddEven {
    public static boolean isOdd (int x) {
        return (x % 2 != 0);
    }
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type a number.");
        int x = in.nextInt();
        if (isOdd(x)) {
            System.out.println("Wow, that's odd!");
        }

    }
}
