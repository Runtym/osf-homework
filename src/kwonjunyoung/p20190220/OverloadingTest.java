package kwonjunyoung.p20190220;

class Dog2 {
	public void bark() {
		System.out.println("어흥!");
	}

	// Overloading Method
	public void bark(int num) { // 같은 Method 이지만 다른 Parameter
		for (int i = 0; i < num; i++) {
			System.out.println("월월!");
		}
	}
}

public class OverloadingTest {
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.bark();
		d.bark(3);

	}
}
