package oops;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class exampl5 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2025, 8, 4);
		System.out.println("Date: " + date); 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Formatted: " + date.format(formatter)); 
    }
}
