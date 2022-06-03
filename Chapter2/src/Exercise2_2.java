import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radiusOfCylinder, lengthOfCylinder;
        double pi = Math.PI, area, volume;

        System.out.print("Enter radius and length of a cylinder: ");
        radiusOfCylinder = input.nextDouble();
        lengthOfCylinder = input.nextDouble();

        area = radiusOfCylinder * radiusOfCylinder * pi;
        volume = area * lengthOfCylinder;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);



    }
}
