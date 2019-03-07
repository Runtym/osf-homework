package leekyutaek.p20190220;

public class Overloading {
	public static int plus(int x, int y) {
		System.out.println(x+y);
		return 0;
	}

	public static int plus(int x, int y, int z, int q) {
		System.out.println(x+y+z+q);
		return 0;
	}

	public static String plus(String x, String y) {
		System.out.println(x+y);
		return null;
	}

	public static void main(String[] args) {
		plus(1,2);
		plus(4,1,5,6);
		plus("12","34");
	}
}
