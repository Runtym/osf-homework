package kangyoungjun;

public class Chain extends Chicken{

	public String name;
	
	public void FriedChicken(Chicken c) {
		this.name = "원조 치킨";
	}
	
	public void Chicken(Chicken c, GalBiSauce s) {
		this.name = "수원 왕갈비 치킨";
	}
}
