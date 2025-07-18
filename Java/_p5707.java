package LuoGu;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Scanner;

public class _p5707 {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		int v = scanner.nextInt();
		
		Main(s, v);
	}
	public static void Main(int s,int v) {
		Calendar dataCalendar = Calendar.getInstance();
		dataCalendar.set(2025, Calendar.APRIL,4,8,0,0);
		int min = s%v == 0 ? s/v:s/v+1;
		dataCalendar.add(Calendar.MINUTE, -min-10);
		SimpleDateFormat format = new SimpleDateFormat("hh:mm");
		System.out.println(format.format(dataCalendar.getTime()));
	}
}
