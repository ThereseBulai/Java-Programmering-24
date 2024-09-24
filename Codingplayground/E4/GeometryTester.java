
package Codingplayground.E4;
import java.util.Scanner;

import Codingplayground.E4.Circle; 
import Codingplayground.E4.Rectangle; 

public class GeometryTester {

   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    

    Circle circle = new Circle();
    System.out.print("enter circle radius");
    circle.setRadius(scanner.nextDouble());
    System.out.println("The area of a circle of radius " + circle.getRadius() + " is: " + String.format("%.2f", circle.comArea()));
    System.out.println("The circumference of a circle of radius " + circle.getRadius() + " is: " + String.format("%.2f", circle.comCircumference()));



    Rectangle rectangle = new Rectangle();
    System.out.println("Enter height for rectangle:");
    rectangle.setA(scanner.nextDouble());
    System.out.println("Enter rectangle width:");
    rectangle.setB(scanner.nextDouble());

    System.out.println("The area of a rectangle with height " + rectangle.getA() + " and width " + rectangle.getB() + " is: " + String.format("%.2f", rectangle.comArea()));
    System.out.println("The perimeter of a rectangle with height " + rectangle.getA() + " and width " + rectangle.getB() + " is: " + String.format("%.2f", rectangle.comPeremiter()));
   }         

}

