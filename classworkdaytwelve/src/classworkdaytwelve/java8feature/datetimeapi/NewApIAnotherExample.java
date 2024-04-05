package classworkdaytwelve.java8feature.datetimeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class NewApIAnotherExample {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();//date1 representing current date
        LocalDate date2 = LocalDate.of(2020, 3, 22);//date2 is referring to 22-03-22
        System.out.println("***********************************************");
        //Getting total number of days between two dates	
        long noOfDays = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(noOfDays);
        //Getting total number of days between two dates
        long  epochDay1= date1.toEpochDay();
        long  epochDay2= date2.toEpochDay();
        long numOfDays =epochDay1 - epochDay2;
        System.out.println(numOfDays);
        System.out.println("******************Usage of Period class present in java.time package*****************************");
        checkingPeriod(date1, date2);;

 
        LocalTime time1 = LocalTime.now();
        Duration sixHours = Duration.ofHours(6);

        LocalTime time2= LocalTime.now(ZoneId.of("America/New_York"));
        //LocalTime time2 = time1.plus(sixHours);
        System.out.println(time1);
        System.out.println(time2);
        checkDuration(time1, time2);
		
	}

	private static void checkDuration(LocalTime time1, LocalTime time2) {
		Duration gap = Duration.between(time1, time2);
		System.out.println("Duration gap between time1 and time time2 "+gap);
        System.out.println(gap.toHours());
		
	}

	private static void checkingPeriod(LocalDate date1, LocalDate date2) {
		Period gap = Period.between(date1, date2);
        System.out.println("Gap between dates is a period of "+gap);
        System.out.println(gap.toTotalMonths());
		
	}

}
