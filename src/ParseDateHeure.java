import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;

public class ParseDateHeure {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.parse("2018-01-01T01:33:00");
		List<ZoneId> lzi = Arrays.asList(ZoneId.of("Europe/Paris"), ZoneId.of("Asia/Tokyo"),
				ZoneId.of("America/Anchorage"));

		lzi.stream().forEach((x) -> {
			System.out.println(x + " : \t" + ldt.atZone(x).toInstant());
		});

	}

}
