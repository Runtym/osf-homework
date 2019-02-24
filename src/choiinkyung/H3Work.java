package choiinkyung;

import java.util.ArrayList;
import java.util.Scanner;

public class H3Work {
	// 나올수 있는 랜덤 숫자는 0-9
	// 맞춰야하는 숫자는 4개
	public static void main(String[] args) {
		
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			int ranNum = (int) (Math.random() * 9);
			if (numList.indexOf(ranNum) == -1) {
				numList.add(ranNum);
			} else {
				i--;
			}
		}
		System.out.println("numList :" + numList);
			
	
		Scanner scan = new Scanner(System.in);
		String[] numStr = scan.nextLine().split(",");
		int[] nums = new int[4];
		for (int i = 0; i < numStr.length; i++) {
			nums[i] = Integer.parseInt(numStr[i]);
		}

		
	}

}