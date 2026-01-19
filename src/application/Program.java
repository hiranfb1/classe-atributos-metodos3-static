package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double C = Calculator.circumference(radius);
		double V = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", C);
		System.out.printf("Volume: %.2f%n", V);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();
	}
}