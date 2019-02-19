package lee.cho.rong;

public class Overriding {

	void test2() {	}
}

class Overriding2 extends Overriding {

	void test2() {	}
}

class Overriding3 extends Overriding2 {
	
	void test2() {	}

	public static void main(String[] args) {
		Overriding3 o3 = new Overriding3();
		o3.test2();
	}
}
