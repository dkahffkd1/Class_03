package constructor;
class TestClass01{
	//default 생성자란 public Testcalss01 처럼 클래스만 있는 상태	

	public TestClass01() { // 반환 타입이 필요 없음 (void 생략)
		System.out.println("생성자 실행");
	}
		public void test() {
		System.out.println("test 호출");	
		}
}
public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		//t.test();// main 생성 -> 객체 생성 -> 클래스
		
	}
}
