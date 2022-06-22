import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmm");
		Date date = new Date();  
	    String strDate= format.format(date);  
	    System.out.println(strDate);  
	}
}
