package Sample;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Curr {
	public static void main(String[] args) {
		Currency inr = Currency.getInstance("INR");
		Currency usd = Currency.getInstance("USD");
		
		System.out.println("INR Code: " + inr.getCurrencyCode());
		System.out.println("USD Symbol: " + usd.getSymbol());
		
		BigDecimal amount = new BigDecimal("12500.75");
		
	}
}
