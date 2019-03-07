package kwonjunyoung.p20190220;

// Overriding의 예

class Dog {
	public void bark() {
		System.out.println("왈왈");
	}
}

class Jindo extends Dog {
	public void run() {
		System.out.println("헥헥");
	}

	public void bark() {
		System.out.println("어흥");
	}

}

public class OverridingTest {
	public static void main(String[] args) {
		Dog d = new Jindo();
		d.bark();
	}
}
