package choiinkyung.p20190220;

//Car 를 상속받는 Bus 클래스 
public class Bus extends Car {


	public void run() {
//부모의 메소드가 없어지는게 X 
// super.run();
		System.out.println("Bus의 run 메소드");
	}


	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();		
	}
}
