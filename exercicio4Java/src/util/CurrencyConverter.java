package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double paidReais(double price, double amount) {
		return amount * price * (1.0 + IOF);
	}
}
