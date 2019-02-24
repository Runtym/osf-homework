package kimsiyoon;

import java.util.ArrayList;

public class BaseBall {
	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		for(int i =0;i<4;i++) {
			int ranNum = (int)((Math.random()*9)+1);
			if(numList.indexOf(ranNum)==-1) {
				numList.add(ranNum);
			}else {
				i--;
			}
			
		}
		System.out.println(numList);
	}

}
