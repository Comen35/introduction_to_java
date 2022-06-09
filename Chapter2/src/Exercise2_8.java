import java.util.Scanner;

public class Exercise2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int timeZone = input.nextInt();



        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour =((totalHours % 24) + timeZone);

        if(currentHour >= 24){
            currentHour =((totalHours % 24) + timeZone) % 24;
        }
        

        System.out.println("The current time is " + currentHour + ":" + currentMinutes + ":" +currentSecond);



    }
}
