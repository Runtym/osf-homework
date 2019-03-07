package kimsunmin.p20190220;

public class OverLoading {

	
	OverLoading(){
		System.out.println("나도 파라미터좀....주라...");
	}
	
	OverLoading(int oNum){
		System.out.println("겨우 int 하나 주네.."+oNum+"개만 더 주세요...");
	}
	
	OverLoading(int oNum, String str){
		System.out.println("나도 int랑 String... 쫌 부족한데..."+oNum+"개만.."+str);
	}
	
	OverLoading(int oNum, String str, boolean bl){
		System.out.println("int를 먼저 받는 생성자가 진짜 생성자야! ");
	}
	
	OverLoading(boolean bl, int oNum, String str){
		System.out.println("boolean을 먼저 받는 생성자가 진짜 생성자야!");
	}
	
	OverLoading(String str, int oNum, boolean bl){
		System.out.println("String을 먼저 받는 생성자가 진짜 생성자야!");
	}

	
	public static void main(String[] args) {
		OverLoading ol1 = new OverLoading();
		OverLoading ol2 = new OverLoading(1);
		OverLoading ol3 = new OverLoading(1,"쳇");
		OverLoading ol4 = new OverLoading(1,"쳇",true);
		OverLoading ol5 = new OverLoading(true,1,"쳇");
		OverLoading ol6 = new OverLoading("쳇",1,true);
		System.out.println("--------------------------");
		System.out.println("개성이 뚜렷한 OverLoading들");
		
	}
}
