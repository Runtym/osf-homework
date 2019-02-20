package inhwason;
// 상위 클래스가 가지고 있는 메소드를 하위 클래스에서 재정의해 사용하는 것
// 1. 메소드의 이름 같아야 한다
// 2. 매개변수의 개수, 데이터 타입이 같아야 한다 
// 3. 메소드의 리턴타입이 같아야 한다
class Parent 
{
	public String name;
	public int age;
	public void info()
	{
		System.out.println(name +age);
	}
} 
class Child extends Parent 
{ 
	public String area;

	public void info()
	{
		System.out.println(area);
	}
} 
public class H2Work_Overriding
{
	public static void main(String[] args)
	{
		Child ch = new Child(); 
		ch.name ="홍길동";
		ch.age=20;
		ch.area="서울";
		ch.info();
	}
}
