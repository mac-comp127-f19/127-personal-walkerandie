package basicjava;

import java.util.Scanner;

public class Practice {
    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a positive integer.");

        int num = in.nextInt();

        System.out.println(Math.random() * num + 1);


    }
}
