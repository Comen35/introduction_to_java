import java.util.Scanner;

public class ConvertorCelsiusToFahrenheit {
    public ConvertorCelsiusToFahrenheit() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celcius: ");
        double celsius = input.nextDouble();
        double fahrenheit = 1.8 * celsius + 32.0;
        System.out.println("" + celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
