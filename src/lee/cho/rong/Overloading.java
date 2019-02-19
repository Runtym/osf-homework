package lee.cho.rong;

public class Overloading {

	static int test() {
		return 0;
	}
	
	static String test(String str) {
		return "";
	}
	
	static String test(int i) { 
		return "";
	}
	
	static void test(int i,String str1,String str2) {
		
	}
	
	static void test(String str1,String str2,int i) {
		
	}
	
	public static void main(String[] args) {
		test();
		test("a");
		test(1);
		test(1,"a","b");
		test("a","b",1);
	}
}
