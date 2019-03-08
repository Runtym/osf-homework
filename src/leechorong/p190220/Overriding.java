package leechorong.p190220;

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


//[ 오버라이딩 ]
//
//1. 클래스간 상속이 전제됨.
//2. 같은 메소드명이어야 하며, 메소드의 데이터타입까지 일치해야함.
//3. 파라미터의 갯수, 데이터타입, 순서가 완전히 동일해야 함.
//
//-> 같은 메소드명이라도 호출시 자식 클래스의 메소드가 오버라이딩 되어 실행됨.
//	 상위 클래스의 메소드를 하위 클래스가 재정의해서 사용.