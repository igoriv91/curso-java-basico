package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		show("Valores de x:");

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		Triangle x = new Triangle(a,b,c);
		
		show("Valores de y:");

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		Triangle y = new Triangle(a,b,c);

		double areaX = x.area();
		double areaY = y.area();

		show("Area de x: " + areaX);
		show("Area de y: " + areaY);
		
		sc.close();
	}

	public static void show(String valor) {
		System.out.println(valor);
	}
}
