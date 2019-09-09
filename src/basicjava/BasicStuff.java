package basicjava;

public class BasicStuff {
    public static void main (String [] args) {
        double age0 = 18;

        double age1 = 19;

        System.out.println("We are " + age0 + " and " + age1 + " years old!");

        double sumOfAges = age0 + age1;

        System.out.println("The sum of our ages is " + sumOfAges + " !");

        System.out.println("The sum of our ages is " + (age0 + age1) + " !");

        System.out.println(6/3);

        System.out.println((double) 6/4);

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);

        System.out.println("Days in 1600 hours: " + ((double) 1600/24));

        System.out.println("Weeks in 1600 hours: " + ((double) 1600/168));

        System.out.println("Hours in 1600 hours: 1600");

        double h = 10;
        double r = 4;
        double combo = (h * h) + (r * r);

        System.out.println("Volume = " +  ((double) 1/3 * Math.PI * r * r * h));

        System.out.println("Surface area = " + (double) Math.PI * r * (r + ((double) Math.sqrt(combo))));




    }
}
