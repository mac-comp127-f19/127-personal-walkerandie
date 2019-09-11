package basicjava;

import java.util.Scanner;

public class Hypotenuse {

    public static double calculateHypotenuse (double side1, double side2) {
        double side3 = (side1 * side1) + (side2 * side2);
        return (double) Math.sqrt(side3);
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first side length: ");
        double side1 = in.nextDouble();
        System.out.println("Enter the second side length: ");
        double side2 = in.nextDouble();
        System.out.println("Your hypotenuse length is:"+ (calculateHypotenuse(side1, side2)));


    }


}
