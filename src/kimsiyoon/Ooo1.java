package kimsiyoon;

class Mom {
	public void face() {
		System.out.println("엄마가 나올까");
	}
}

class Me extends Mom{
	public void face() {
		System.out.println("내가 나올까");
	}	
}

public class Ooo1 {	
	public static void main(String[] args) {
		Me m = new Me();
		m.face();
	}

}
