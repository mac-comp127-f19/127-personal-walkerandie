package basicjava;

import java.util.Scanner;

public class TimeConverter {

    public static int inSeconds (int hours, int mins, int secs) {
        return ((hours * 3600) + (mins * 60) + secs);
    }

    public static void main (String [] args) {



        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of hours:");
        int hours = in.nextInt();

        System.out.println("Enter the amount of minutes:");
        int mins = in.nextInt();

        System.out.println("Enter the amount of seconds:");
        int secs = in.nextInt();

        System.out.println("Your time in seconds is: " + inSeconds(hours, mins, secs));





    }
}
