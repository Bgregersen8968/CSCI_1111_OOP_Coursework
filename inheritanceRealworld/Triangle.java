package inheritanceRealworld;

import java.util.Scanner;

public class Triangle extends GeometricObject {
	double side1;
	double side2;
	double side3;

	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(double side1, double side2, double side3, String color) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		//setColor(color);
		//setFilled(filled);
	}
	
	public double getside1() {
		return side1;
	}

	public double getside2() {
		return side2;
	}

	public double getside3() {
		return side3;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getArea(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double Area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return Area;
	}

	public double getPerimeter(double side1, double side2, double side3) {
		double perimeter = (side1 + side2 + side3);
		return perimeter;
	}

	public String sideDisplay() {
		return "The lengths of each side are as follows: \nside 1 = " + side1 + "\nside 2 = " + side2 + "\nside 3 = "
				+ side3;
	}
}
