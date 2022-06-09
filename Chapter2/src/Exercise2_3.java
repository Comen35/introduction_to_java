import java.util.Scanner;

public class Exercise2_3 {
    final static double FEET = 0.305;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet, meter;

        System.out.print("Enter a value for feet: ");
        feet = input.nextDouble();

        meter = feet * FEET;

        System.out.println(feet + " feet is " + meter + " meters");

        input.close();

    }
}
