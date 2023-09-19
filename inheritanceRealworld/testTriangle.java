package inheritanceRealworld;

import java.util.Scanner;
public class testTriangle extends Triangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("please enter 3 sides of a triangle.");
		System.out.print("Side 1: ");
		double side1 = in.nextDouble();
		System.out.print("Side 2: ");
		double side2 = in.nextDouble();
		System.out.print("side 3: ");
		double side3 = in.nextDouble();
		System.out.print("Is the triangle filled? Enter true for yes or false for no: ");
		boolean isFilled = in.nextBoolean();
		System.out.print("what color is the triangle?: ");
		String color = in.next(); 
		
		
		Triangle myTriangle = new Triangle(side1, side2, side3 );
		myTriangle.setColor(color);
		myTriangle.setFilled(isFilled);
		myTriangle.setSide1(side1);
		myTriangle.setSide2(side2);
		myTriangle.setSide3(side3);
		System.out.println("This triangle was " + myTriangle.createDate());
		System.out.println(myTriangle.sideDisplay());
		System.out.println("The area of the triangle is: " + myTriangle.getArea(side1, side2, side3));
		System.out.println("The perimeter of the triangle is: " + myTriangle.getPerimeter(side1, side2, side3));
		System.out.println("Is the triangle filled? " + myTriangle.getFilled());
		System.out.println("The color of the triangle is: " + myTriangle.getColor());
		}
}

