package choiinkyung;

public class H2Work {
//오버로딩 : 같은 이름의 메소드 여러개를 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술


	public int plus(int x, int y) {
		return x + y;
	}

	public int plus(int x, int y, int z) {
		return x + y + z;
	}

	public String plus(String x, String y) {
		return x + y;
	}

//	public int plus(int i, int f) {
//		return i + f;
//	}

	public static void main(String args[]) {
		H2Work h2 = new H2Work();
		System.out.println(h2.plus(2, 4));
		System.out.println(h2.plus(2, 4, 32));
		System.out.println(h2.plus("숙", "제"));
	}
}
