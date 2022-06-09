import java.util.Scanner;

public class Exercise2_7 {
    final static int MINUTES_IN_A_YEAR = 365 * 24 * 60;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutes, years, days;

        System.out.print("Enter the number of minutes: ");
        minutes = input.nextInt();

        years = minutes / MINUTES_IN_A_YEAR;
        days = (minutes % MINUTES_IN_A_YEAR) / (24 * 60);

        System.out.println(minutes + " minutes is approximately " + years + "years and " + days + " days");
        


    }
}
