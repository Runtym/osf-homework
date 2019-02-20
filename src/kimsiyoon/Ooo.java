package kimsiyoon;

public class Ooo {
	//같은 클래스에서 같은 메소드이름을 사용.
	//매개변수 타입, 개수 다르게 해서 이용
	static void oo() {
		System.out.println("매개변수 없음");
	}
	
	static void oo(int i) {
		System.out.println("매개변수 데이터타입 int");
	}
	
	void oo(String s) {
		System.out.println("매개변수 데이터타입 String");
	}
	
	void oo(int i,String s) {
		System.out.println("매개변수 int / String");
	}
	
	public static void main(String[] args) {
		
		oo();
		oo(1);
		
		Ooo oh = new Ooo();
		oh.oo("아");
		oh.oo(1,"아");
				
	}

}
