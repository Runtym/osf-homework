package goodongheun;
class Dog{
	public String name;
	public int age;
	//info 메서드
	public void info() {
		System.out.println("개의 이름은 " + name + "님이고 나이는 " + age + "살입니다.");
	}
}
class Job extends Dog{
	//Dog클래스를 상속받음
	String job;
	public void info() {
		//Dog클래스에 있는 info()메서드를 재정의
		super.info();
		System.out.println("개의 직업은 " + job + "입니다.");
	}
}
public class Overriding {
	public static void main(String[] args) {
		Job job = new Job();
		//Job 객체생성
		job.name = "개색";
		job.age = 20;
		job.job = "먹방BJ";
		//변수 설정
		job.info();
		//호출
	}

}
//Job Class클래스에서 Dog클래스를 상속받아 Dog클래스에 있는 info()를 재정의
//메인메서드에서 Job 객체를 생성하고 호출하였기 때문에 Job클래스의 내용이 실행됨
