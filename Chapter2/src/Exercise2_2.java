import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radiusOfCylinder, lengthOfCylinder;
        double pi = Math.PI, area, volume;

        System.out.print("Enter radius of the cylinder: ");
        radiusOfCylinder = input.nextDouble();
        System.out.print("Enter length of the cylinder: ");
        lengthOfCylinder = input.nextDouble();

        area = radiusOfCylinder * radiusOfCylinder * pi;
        volume = area * lengthOfCylinder;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

        input.close();



    }
}
