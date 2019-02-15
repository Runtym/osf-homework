package leeyeonhong;

class Cat {
	String name;
	int age;

}

public class CatArray {
	public static void main(String[] args) {

		
		Cat[] cats = new Cat[10];
		for (int i = 0; i < cats.length; i++) {

			cats[i] = new Cat();
			cats[i].age = i+1;
		}
		System.out.println(cats[1].age);
	}
}
