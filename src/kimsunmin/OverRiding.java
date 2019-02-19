package kimsunmin;

class MomClass{
	String name = "MomClass";
	
	public void printName() {
		System.out.println(this.name);
	}
	
	public void printMomName() {

	}
	
}

public class OverRiding extends MomClass{
	public void printName() {
		System.out.println("나는 MomClass가 아니야. ");
	}	
	
	public void printMomName() {
		super.printName();
	}
	
	public static void main(String[] args) {
		MomClass mc = new MomClass();
		mc = new OverRiding();
		mc.printName();
		mc.printMomName();
		
		
		
	}
}
