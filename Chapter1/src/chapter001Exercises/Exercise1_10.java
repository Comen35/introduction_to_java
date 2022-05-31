package chapter001Exercises;
/*  Assume that a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the average speed in miles per hour. */
public class Exercise1_10 {
    public static void main(String[] args) {
        double average_speed_in_miles_per_hour = ((14 / 1.6) * 60 * 60) / ((45 * 60) + 30);
        System.out.println("The average speed in miles per hour : " + average_speed_in_miles_per_hour);
        
    }
}
