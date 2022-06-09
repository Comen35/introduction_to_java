import java.util.Scanner;

public class Exercise2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sumOfDigits = 0;

        System.out.print("Enter an integer between 0 and 1000: ");
        number = input.nextInt();

        while (number > 10) {

            sumOfDigits += number % 10;
            number = number / 10;
        }
        sumOfDigits += number;

        System.out.println("The sum of the digits is " + sumOfDigits);

        input.close();
    }
}
