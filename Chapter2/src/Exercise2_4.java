import java.util.Scanner;

public class Exercise2_4 {
    final static double POUND = 0.454;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pounds, kilograms;

        System.out.print("Enter a number in pounds: ");
        pounds = input.nextDouble();

        kilograms = pounds * POUND;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms");

        input.close();
    }
}
