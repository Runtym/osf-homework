package soninhwa.p20190218;
// 같은 이름의 메소드를 여러 개 가지면서 매개 변수를 다르게 정의하는 것
// 1. 메소드 이름 같아야 한다
// 2. 매개변수의 개수 또는 데이터 타입이 달라야 한다
// 3. 리턴 타입이 같아도되고 달라도 된다
public class H2Work_Overloading
{
	public int sum(int x, int y)
	{
		return ( x + y);
	}

	public double sum(double d, double e, double f)
	{
		return (d + e + f);
	}

	public static void main(String[] args) 
	{
		H2Work_Overloading s = new H2Work_Overloading();
		s.sum(10, 20);
		s.sum(10.5, 20.5, 30.5);

	}
}
