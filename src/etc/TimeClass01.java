package etc;               // 날짜를 얻어오는 기능

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeClass01 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		SimpleDateFormat si = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		// java.text.SimpleDateFormat 기능
		String s = si.format(time);
		System.out.println(s);
		
		System.out.println("========================");
		
		Date date = new Date();
		//java.util.Date 기능
		System.out.println(date);
		System.out.println(si.format(date));
		
		
	}
}
