package leesoobin;

public class Pikachu extends Raichu{
	String name;
	int age;
	
	Pikachu(){
		this("야생의 피카츄");
	}
	Pikachu(String name) {
		this(name,2019);
	}
	Pikachu(String name,int age) {
		this.name="이름은" + name;
		this.age= age;
	}
	
	void get() {
		System.out.println(name+"을 획득하였습니다. 획득년도는:"+age);
	}
	
	public void evolution() {
		System.out.println("라이츄로 진화합니다.");
	}
}
