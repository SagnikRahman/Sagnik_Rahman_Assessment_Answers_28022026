package date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DatesAndTimeDemo {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(64);
		
		System.out.println(today);
		System.out.println(futureDate);
		
		if(futureDate.isAfter(today)) {
			System.out.println("Future date is valid");
		}
		
		Period period = Period.between(today, futureDate);
		System.out.println("Days between dates: " + period.getDays());
		
		LocalDateTime currentTimestamp = LocalDateTime.now();
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		System.out.println("Formatted Date: " + today.format(dateFormatter));
		System.out.println("Formatted Date-Time: " + currentTimestamp.format(dateTimeFormatter));
		
		System.out.println("Original Date still unchanged: " + today);

		
	}
}
