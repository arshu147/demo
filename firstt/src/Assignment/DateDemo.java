package Assignment;

import java.time.LocalDate;
import java.time.Month;

public class DateDemo {
	public static void main(String[] args) {
		//		Calendar c = new GregorianCalendar();
		//		c.add(Calendar.DATE, 50);
		//		Date addDays = DateUtils.addDays(new Date(), 50);
		//		System.out.println(addDays);
				String[] date = getDate(15);
				System.out.println(getMonth(date[1]));
//				System.out.println(plusDays.toString());
//				getDate(15);
//				SimpleDateFormat s = new SimpleDateFormat();
				
		//		Calendar cal = Calendar.getInstance();
		//		cal.add(Calendar.DATE, 50);
		//		String mon = cal.getTime().toString().substring(4,7);
		//		System.out.println(cal.getTime());
		//		System.out.println(new SimpleDateFormat("MMM").format(cal.getTime()));
		//		System.out.println(new SimpleDateFormat("0D").format(cal.getTime()));
		//		Calendar cl = Calendar.getInstance();
		//		String displayName = cl.getDisplayName(Calendar.DAY_OF_MONTH, Calendar.LONG, Locale.ENGLISH);
		//		System.out.println(displayName);
		//		LocalDate date = LocalDate.now().plusDays(50);
		//		System.out.println(date.toString());
		//		System.out.println(date.getMonth().toString().toLowerCase().replace(oldChar, newChar));

	}
	public static String[] getDate(int n) {
		String[] date = LocalDate.now().plusDays(n).toString().split("-",3);
		return date;
	}
	public static String getMonth(String month) {
		String mon = Month.of(Integer.parseInt(month)).name();
		String replace = mon.replaceAll(mon.substring(1), "").concat(mon.substring(1, mon.length()).toLowerCase());
		return replace;
	}
}
