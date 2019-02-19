package lee.cho.rong;

public class Overriding {

	void test2() {
		System.out.println("오버라이딩 실패.");
	}
}

class Overriding2 extends Overriding {

	void test2() {
		System.out.println("오버라이딩 실패.");
	}
}

class Overriding3 extends Overriding2 {
	
	void test2() {
		System.out.println("오버라이딩 성공.");
	}

	public static void main(String[] args) {
		Overriding3 o3 = new Overriding3();
		o3.test2();
	}
}
