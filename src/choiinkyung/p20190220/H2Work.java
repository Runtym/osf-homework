package choiinkyung.p20190220;

public class H2Work {
//오버로딩 : 매개변수의 수, 타입이 다른 경우 동일한 이름으로 메소드를 여러개 정의 할 수 있다.


	public int plus(int x, int y) {
		return x + y;
	}

	public int plus(int x, int y, int z) {
		return x + y + z;
	}

	public String plus(String x, String y) {
		return x + y;
	}


	public static void main(String args[]) {
		H2Work h2 = new H2Work();
		System.out.println(h2.plus(2, 4));
		System.out.println(h2.plus(2, 4, 32));
		System.out.println(h2.plus("숙", "제"));
	}
}
