package leesoobin;

import java.util.ArrayList;

public class RanNum {
	
	public ArrayList<Integer> ranNumMethod(int a) {
		ArrayList<Integer> ranNum = new ArrayList<>();
		for(int i=0;i<a;i++) {
			int num = (int)(Math.random()*10);
			if(ranNum.indexOf(num)==-1) {
				ranNum.add(num);
			} else {i--;}
		}
		return ranNum;
	}
}
