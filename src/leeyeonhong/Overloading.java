package leeyeonhong;

public class Overloading {
	public int one(int a, int b) { // 1. 메소드명이 같아야한다.
		System.out.println(a + b);
		return 0;
	}

	public int one(int a, int b, int c) { // 2. 파라메터의 개수나 타입이 달라야 한다
		System.out.println(a + b + c);
		return 0;
	}

	public int one(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
		return 0;
	}

	public static void main(String[] args) {
		Overloading ov = new Overloading();
		ov.one(1,2);
		ov.one(1,2,3);
		ov.one(1,2,3,4);
	}
}
