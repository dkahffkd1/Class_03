package etc; // Sleep 기능

import java.util.Date;

public class SleepClass01 {
	public static void main(String[] args) {
		for(int i = 0 ; i<5;i++) {
			System.out.println(i+ ":" + new Date());
			
			try {
				Thread.sleep(2000); // 1/1000초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("시작");
		long start = System.currentTimeMillis();// <-- 현재 시간을 초단위로 뽑아줌
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		long end = System.currentTimeMillis();
		System.out.println("종료");
		System.out.println("사용 시간 : "+ (end - start) / 1000 );
		
		}
	}
