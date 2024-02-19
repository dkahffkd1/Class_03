package etc;

/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;*/ //- >  import java.util.*;을 사용하면 util내의 모든값을 사용 할 수 있음
import java.util.*;
import constructor.TestClass05;

//import com.care.abc.Date;

public class MainClass {
	public static void main(String[] args) {
		/*Date d = new Date();
		d.aaa();
		d.bbb();
		d.ccc();
		*/
		TestClass05 lo = new TestClass05();
		lo.setId("Aaa");
		Scanner sc;
		ArrayList arr;
		HashSet hs;
		HashMap map;
		
		java.util.Date date;
		com.care.test.Date d = new Date();
		com.care.abc.Date dd = new com.care.abc.Date();//com.care.abc.Date는 위치 표기
	}
}
