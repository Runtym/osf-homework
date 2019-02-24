package goodongheun;

class OverloadingTest {
	//이름이 Overloading1인 메서드
	void Overloading1() {
		
	}
	//매개변수 int형이 2개인 Overloading1 메서드
	void Overloading1(int a, int b) {
		System.out.println("매개변수 :" + a + "," + b);
	}
	//매개변수 String형이 한 개인 Overloading1 메서드
	void Overloading1(String c) {
		System.out.println("매개변수 :" + c);
	}

}
public class Overloading{
	public static void main(String[] args) {
	
		//OverloadingTest 객체 생성
		OverloadingTest ot = new OverloadingTest();
		
		//매개변수가 없는 Overloading1() 호출
		ot.Overloading1();
		
		//매개변수가 int형 두개인 Overloading1() 호출
		ot.Overloading1(20,80);
		
		//매개변수가 String 한개인 Overloading1() 호출
		ot.Overloading1("오버로딩");
	}
}
//이름이 Overloading1인 메서드가 3개가있음 각각 매개변수의 유형과 개수가 다름