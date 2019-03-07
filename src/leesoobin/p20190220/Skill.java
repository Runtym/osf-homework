package leesoobin.p20190220;

public class Skill {

	public void Volt(int v) {
		System.out.println(v+"볼트를 사용합니다.");
	}
	
	public void Volt(int n,int v) {
		System.out.println(n+"마리가"+v+"볼트를 사용합니다.");
	}
	
	public void Volt(int v,String str) {
		System.out.println(v+str+"볼트를 사용합니다.");
	}
	
	public void Volt(String str, int n) {
		System.out.println(str+"볼트를"+n+"마리에게 사용합니다.");
	}
	
//	public int Volt(int v,int v2) {
//		return v+v2;
//	}
	
	public String Volt() {
		return "스킬에 실패하였습니다.";
	}
}
//오버로딩