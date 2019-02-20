package leekyutaek;

class Mother {
	Mother() {

	}

	void work() {
		System.out.println("안녕하세요.");
	}

}

class Father extends Mother {
	Father() {

	}

	void work() {
		System.out.println("내가 첫번째야.");
	}

}

public class OverRiding extends Father {
	OverRiding() {

	}

	void work() {
		System.out.println("나는 두번째야. 그래도 내가 나올거야!");
	}

	public static void main(String[] args) {

		OverRiding ov = new OverRiding();
		ov.work();

	}

}
