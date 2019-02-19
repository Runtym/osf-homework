package lee.cho.rong;

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
