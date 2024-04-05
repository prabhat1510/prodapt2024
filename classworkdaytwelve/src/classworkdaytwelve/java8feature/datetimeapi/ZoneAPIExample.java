package classworkdaytwelve.java8feature.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneAPIExample {

	public static void main(String[] args) {
		
		ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println(currentZone);
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");

        // We use withZoneSameInstant() -- which returns a copy of current date-time
        // with a different time-zone, retaining the instant
        ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
        System.out.println("tokyo time zone is " + tokyoZone);
        System.out.println("tokyo time is " + tokyoZone.getZone());
        
        LocalDate tokyoDate = tokyoZone.toLocalDate();
        System.out.println(tokyoDate);
        
        LocalDateTime tokyoDateTime = tokyoZone.toLocalDateTime();
        System.out.println(tokyoDateTime);
        
        LocalTime tokyoTime = tokyoZone.toLocalTime();
        System.out.println(tokyoTime);
	}

}
