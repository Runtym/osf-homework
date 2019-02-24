package leesoobin;

public class Poketmon {

	public static void main(String[] args) {
		Skill s = new Skill();
		s.Volt(1);
		s.Volt(2,3);
		s.Volt(1,"백만");
		s.Volt("백만",2);
		String str = s.Volt();
		System.out.println(str);
		
		Pikachu p = new Pikachu();
		p.get();
		Pikachu p1 = new Pikachu("피카피카");
		p1.get();
		Pikachu p2 = new Pikachu("첫사랑 피카츄",2017);
		p2.get();
		
		Raichu r = new Raichu();
		p.evolution();
		r.evolution();
		
		
	}
}
