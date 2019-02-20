package kimsiyoon;

class Mom {
	//메소드명,매개변수,리턴타입 이 같아야함
	//부모 class 에서 정의한 메소드를 자식 class에서 변경할수 있음.
	public void face() {
		System.out.println("엄마 얼굴");
	}
}

class Me extends Mom{
	 public void face() {
		System.out.println("내 얼굴");
	}	
}

public class Ooo1 {	
	public static void main(String[] args) {
		Me m = new Me();
		m.face();
	}


}
