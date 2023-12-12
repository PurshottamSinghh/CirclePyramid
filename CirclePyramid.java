package aD;

import java.util.Scanner;

public class CirclePyramid {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Choose a shape: ");
		System.out.println("1. Circle");
		System.out.println("2. Pyramid");
		System.out.print("Enter your choice: ");
		
		int choice = scnr.nextInt();
		if (choice == 1)
		{
			System.out.print("Enter the radius of the circle: ");
			double r = scnr.nextDouble();
			calculateCircle(r);
		}
		else if (choice == 2)
		{
			System.out.print("Enter the length of the pyramid base: ");
			double l = scnr.nextDouble();
			System.out.print("Enter the width of the pyramid base: ");
			double w = scnr.nextDouble();
			System.out.print("Enter the height of the pyramid: ");
			double h = scnr.nextDouble();
			calculatePyramid(l, w, h);
		}
		else
		{
			System.out.println("Error");
		}
			
		}
	public static void calculateCircle(double r)
	{
		double area = Math.PI * Math.pow(r, 2);
		double circum = 2 * Math.PI * r;
		System.out.println("Circle Area: " + area);
		System.out.println("Circle Circumference: " + circum);
	}
	public static void calculatePyramid(double l, double w, double h)
	{
		double baseArea = l * w;
		double volume = (l * w * h) / 3;
		System.out.println("Pyramid Base Area: " + baseArea);
		System.out.println("Pyramid Volume: " + volume);
	}

	

}
