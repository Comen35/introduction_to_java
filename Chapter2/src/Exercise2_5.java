import java.util.Scanner;

public class Exercise2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double subtotal, gratuity, total = 0;
        int gratuity_rate;

        System.out.print("Enter the subtotal: ");
        subtotal = input.nextDouble();

        System.out.print("Enter the gratuity rate: ");
        gratuity_rate = input.nextInt();

        gratuity = ( subtotal * gratuity_rate ) / 100;
        total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
        input.close();
    }
}
