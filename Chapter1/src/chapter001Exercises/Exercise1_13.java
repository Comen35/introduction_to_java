package chapter001Exercises;

import java.util.Scanner;

public class Exercise1_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, d, e, f, x = 0, y = 0;

        System.out.println("************************************");
        System.out.println("*           ax + by = e            *");
        System.out.println("*           cx + dy = f            *");
        System.out.println("************************************");

        System.out.print("Enter a : ");
        a = input.nextDouble();
        System.out.print("Enter b : ");
        b = input.nextDouble();
        System.out.print("Enter c : ");
        c = input.nextDouble();
        System.out.print("Enter d : ");
        d = input.nextDouble();
        System.out.print("Enter e : ");
        e = input.nextDouble();
        System.out.print("Enter f : ");
        f = input.nextDouble();

        if((a * d - b * c) != 0){
            x = (e * d - b * f) / (a * d - b * c);
            y = (a * f - e* c) / (a * d - b * c);
        }

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
