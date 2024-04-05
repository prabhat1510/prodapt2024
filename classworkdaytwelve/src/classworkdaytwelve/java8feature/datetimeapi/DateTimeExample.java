package classworkdaytwelve.java8feature.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeExample {

	public static void main(String[] args) {
		Date date = new Date();// Created an object of Date class which referred by date variable
		System.out.println(date);

		// Deprected constructor so we should not use it.
		Date dt = new Date(2021, 1, 28);
		System.out.println(dt);

		LocalDate localDate = LocalDate.of(2021, 02, 28);
		System.out.println(localDate);

		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);

		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);

		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);

		LocalTime currentTimeWithZone = LocalTime.now(ZoneId.systemDefault());
		System.out.println(currentTimeWithZone);

		LocalTime currTimeWithZone = LocalTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(currTimeWithZone);

		LocalTime currTimeWithZoneLondon = LocalTime.now(ZoneId.of("Europe/London"));
		System.out.println(currTimeWithZoneLondon);

		LocalDateTime currentDateTimeNY = LocalDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(currentDateTimeNY);

		// MM- month dd- date yyyy year
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String currDateinText = currentDate.format(dtf);
		System.out.println(currDateinText);
		System.out.println("********************************************");
		// Date and Time formatting
		DateTimeFormatter dttf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String currDateTimeinText = currentDateTimeNY.format(dttf);
		System.out.println(currDateTimeinText);

		System.out.println("********************************************");
		String textDate = "2024-04-05";
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		LocalDate datetime = LocalDate.parse(textDate, df);
		System.out.println(datetime);

		String inputString = "2023-01-25";
		DateTimeFormatter parser = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate datee = LocalDate.parse(inputString, parser);
		System.out.println(datee);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
		String outputString = datee.format(formatter);
		System.out.println(outputString);
		System.out.println("*************************************************");
		// Print some specified date
		LocalDate date2 = LocalDate.of(1947, 8, 15);
		System.out.println(date2);

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(date2.format(formatter1));

		System.out.println(date2.isLeapYear());

		int month = date2.getDayOfMonth();
		System.out.println(month);
		int year = date2.getYear();
		System.out.println(year);
		LocalDate dt1 = LocalDate.now();
		System.out.println("*************************************************");
		System.out.println("Day of week for 15-08-1947-- " + date2.getDayOfWeek());
		System.out.println("Day of year for 15-08-1947-- " + date2.getDayOfYear());
		System.out.println("Month value for 15-08-1947-- " + date2.getMonthValue());
		System.out.println("Date after " + date2 + "----" + date2.isAfter(dt1));
		System.out.println("Date before " + date2 + "----" + date2.isBefore(dt1));
	}

}
