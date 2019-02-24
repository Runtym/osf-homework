package kwonjunyoung;

import java.util.ArrayList;
import java.util.Scanner;

public class HW3SearchList {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			int num = (int) (Math.random() * 9 + 1);
			if (numList.indexOf(num) == -1) {
				numList.add(num);
			} else {
				i--;
			}
		}

		int sCnt = 0;
		int bCnt = 0;

		System.out.println("numList : " + numList);
		Scanner scan = new Scanner(System.in);

		while (sCnt != 4) {
			sCnt = 0;
			bCnt = 0;
			System.out.println("번호 입력 : ");
			String numStr[] = scan.nextLine().split(",");
			int[] nums = new int[4];
			for (int i = 0; i < numStr.length; i++) {
				nums[i] = Integer.parseInt(numStr[i]);
			}
			for (int i = 0; i < numStr.length; i++) {
				if (numList.indexOf(nums[i]) != -1) {
					if (i == numList.indexOf(nums[i])) {
						sCnt++;
					} else {
						bCnt++;
					}
				}
			}
			if (sCnt + bCnt == 0) {
				System.out.println("Out!");
			} else {
				System.out.println(sCnt + "S" + " " + bCnt + "B");
			}
		}
	}
}
