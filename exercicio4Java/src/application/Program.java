package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is dollar price? ");
		double dollarPrice = sc.nextDouble();

		System.out.print("how many dollars will be bought? ");
		double amount = sc.nextDouble();

		double result = CurrencyConverter.paidReais(amount, dollarPrice);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);

		sc.close();
	}

}
