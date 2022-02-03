package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		// double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle X: ");
		x.A = sc.nextDouble();
		x.B = sc.nextDouble();
		x.C = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.A = sc.nextDouble();
		y.B = sc.nextDouble();
		y.C = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triagle X area: %.4f%n", areaX);
		System.out.printf("Triagle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area X: ");
		} else {
			System.out.println("Larger area Y: ");
		}
		
		sc.close();

	}

}
