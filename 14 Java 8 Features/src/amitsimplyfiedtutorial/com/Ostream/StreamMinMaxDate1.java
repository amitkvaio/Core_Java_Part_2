package amitsimplyfiedtutorial.com.Ostream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMinMaxDate1 {
	public static void main(String[] args) {
		LocalDate start = LocalDate.now();
		
		System.out.println("Start->"+start);
		
		LocalDate end = LocalDate.now().plusMonths(1).with(TemporalAdjusters.lastDayOfMonth());
		
		System.out.println("End->"+end);
		List<LocalDate> dates = Stream.iterate(start, date -> date.plusDays(1))
		                        .limit(ChronoUnit.DAYS.between(start, end))
		                        .collect(Collectors.toList());
		 
		// Get Min or Max Date
		LocalDate maxDate = dates.stream().max( Comparator.comparing( LocalDate::toEpochDay ) ).get();
		LocalDate minDate = dates.stream().min( Comparator.comparing( LocalDate::toEpochDay ) ).get();
		 
		System.out.println("maxDate = " + maxDate);
		System.out.println("minDate = " + minDate);
	}
}
/*
	To get max or min date from a stream of dates, you can use Comparator.comparing( LocalDate::toEpochDay ) 
		comparator. toEpochDay() function simply increment count of 
		days for a date where day 0 is for 1970-01-01.
*/
