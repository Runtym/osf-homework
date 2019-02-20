package kimsiyoon;

public class Ooo {
	
	static void oo() {
		System.out.println("매개변수 없음");
	}
	
	static void oo(int i) {
		System.out.println("매개변수 데이터타입 int");
	}
	
	static void oo(String s) {
		System.out.println("매개변수 데이터타입 String");
	}
	
	static void oo(int i,String s) {
		System.out.println("매개변수 int / String");
	}
	
	public static void main(String[] args) {
		oo();
		oo(1);
		oo("아");
		oo(1,"아");
				
	}

}
