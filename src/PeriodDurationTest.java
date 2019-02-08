import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDurationTest {

	public static void main(String[] args) {
		// Toujours notre 25 D�cembre 2018 a 13H37
		LocalDateTime ldt = LocalDateTime.of(2018, Month.DECEMBER, 25, 13, 37, 0);
		LocalDateTime ldt2 = ldt.plus(3, ChronoUnit.YEARS);
		LocalDateTime ldt3 = ldt.minusMinutes(1337);

		Period p = Period.between(ldt.toLocalDate(), ldt2.toLocalDate());
		Duration d = Duration.between(ldt.toLocalTime(), ldt3.toLocalTime());
		System.out.println("P�riode : " + p);
		System.out.println("Dur�e : " + d.getSeconds());
		System.out.println("Ecart en jour : " + ChronoUnit.DAYS.between(ldt, ldt2));

	}
}