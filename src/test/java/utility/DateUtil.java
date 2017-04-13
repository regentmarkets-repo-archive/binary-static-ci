package utility;

import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import java.text.SimpleDateFormat;

// utility class to make date values
public class DateUtil {
	
	// date format about 24 hours according to self exclusion page 
	public static final SimpleDateFormat hour24Format = new SimpleDateFormat("HH:mm");
	
	// create date that is 6 weeks later from today
	public static String getSixWeekLaterDate(){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.WEEK_OF_MONTH, 6);
		cal.add(Calendar.DAY_OF_MONTH, 1);
		return makeDate(cal);
	}
	
	// create date that is 6 months lesser from today
	public static String getSixMonthLesserDate(){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 6);
		cal.add(Calendar.DAY_OF_MONTH, -1);
		return makeDate(cal);
	}
	
	// create date that is 5 years later from today
	public static String getFiveYearLaterDate(){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 5);
		cal.add(Calendar.DAY_OF_MONTH, 5);
		return makeDate(cal);
	}
	
	// create date that is yesterday's date
	public static String getYesterdayDate(){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, -1);
		return makeDate(cal);
	}
	
	// create today's date
	public static String getTodayDate(){
		Calendar cal = Calendar.getInstance();
		return makeDate(cal);
	}
	
	// create current time
	public static String getCurrentTime(){
		return makeTime(Calendar.getInstance().getTime());
	}
	
	// create time that is 5 minutes ago
	public static String getFiveMinutesAgoTime(){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, -5);
		return makeTime(cal.getTime());
	}
	
	// Follow the date format used in binary static exclusion page
	// format : DD MMM, YYYY
	private static String makeDate(Calendar cal){
		return (cal.get(Calendar.DAY_OF_MONTH) + " " + cal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault()) + ", " + cal.get(Calendar.YEAR));
	}
	
	// Follow the time format used in binary static exclusion page
	// format : HH:mm
	private static String makeTime(Date date){
		return hour24Format.format(date);
	}
}
