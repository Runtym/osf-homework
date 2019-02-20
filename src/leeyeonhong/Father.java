package leeyeonhong;

class Father {

	public String papa() {
		return "아임 유어 파더";
	}
}

class Son extends Father { // 1. 상속
	
	
	public String papa() { //2. 메서드명, 파라메터의 갯수, 데이터타입, 순서가 동일.
		return "아임 유어 아들"; // 3. 리턴 타입 동일
	}

	public static void main(String[] args) {

		Son s = new Son();
		
		System.out.println(s.papa());
	}
}

