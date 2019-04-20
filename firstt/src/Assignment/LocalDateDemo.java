package Assignment;

import java.time.LocalDate;

public class LocalDateDemo {
	public static void main(String[] args) {
		LocalDate dateNow = LocalDate.now().plusDays(50);
		System.out.println(dateNow);
	}
}
