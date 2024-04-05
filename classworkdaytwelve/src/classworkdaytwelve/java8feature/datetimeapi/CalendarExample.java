package classworkdaytwelve.java8feature.datetimeapi;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        //getTimeInMillis gives the ms elapsed since January 1 1970
        System.out.println(cal.getTimeInMillis());
        System.out.println(cal.getTimeZone());
        
        cal.add(Calendar.DATE,5);
        Date date = cal.getTime();
        System.out.println("5 days later : "+date);
        cal.add(Calendar.MONTH,5);
        System.out.println("5 month later : "+cal.getTime());
        cal.add(Calendar.YEAR,5);
        System.out.println("5 year later : "+cal.getTime());

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        
        //Date to LocalDate and vice versa
        Date dt = cal.getTime();
        //We should never use Date methods as they are deprecated
       // LocalDate lDate = LocalDate.of(dt.getYear(), dt.getDay(), dt.getMonth());
        LocalDate lDate = LocalDate.of(cal.get(Calendar.YEAR), 
        		cal.get(Calendar.MONTH), cal.get(Calendar.DATE));
        System.out.println(lDate);
	}
}
