package leechorong.p090220;

public class Overloading {

	static int test() {
		System.out.println("test() 오버로딩.");
		return 0;
	}
	
	static String test(String str) {
		System.out.println("test(String str) 오버로딩.");
		return "";
	}
	
	static String test(int i) { 
		System.out.println("test(int i) 오버로딩.");
		return "";
	}
	
	static void test(int i,String str1,String str2) {
		System.out.println("test(int i,String str1,String str2) 오버로딩.");
	}
	
	static void test(String str1,String str2,int i) {
		System.out.println("test(String str1,String str2,int i) 오버로딩.");
	}
	
	public static void main(String[] args) {
		test();
		test("a");
		test(1);
		test(1,"a","b");
		test("a","b",1);
	}
}


//[ 오버로딩 ]
//
//1. 같은 영역에서 사용
//2. 같은 메소드명. 메소드의 데이터타입은 상관없음.
//3. 메소드 파라미터의 갯수, 데이터타입이 달라야함. 둘 다 같다면 순서가 달라도 됨.
//ex ) (int i, String str)  (String str, int i)
//
//-> 같은 메소드명이라도 호출시 파라미터로 구분되어 실행됨.
//
//+ 우리가 지금까지 제일 많이 쓴 오버로딩은 println. 대표적인 오버로딩.
//+ 클래스의 생성자도 오버로딩 할수있음. 조건은 같음. 같은 영역, 같은 생성자명, 파라미터 다르게.
//   ++ 기본 생성자, 생성자를 오버로딩으로 나눈 이유는,
//      디폴트값이 있을 수도 있고, 다른 값을 대입하게 될 수도 있으니까.
