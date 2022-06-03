package chapter001Exercises;

import java.util.Scanner;

public class Exercise_1_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double convertMileToKilometer = 24 * 1.6;
        int timeInSeconds = (60 * 60) + (40 * 60) + 35;


        double result = ((60 * 60) * convertMileToKilometer) / timeInSeconds;

        System.out.println("The average speed in kilometers per hour : " + result);



    }
}
