package leeyeonhong;

import java.util.ArrayList;
import java.util.Scanner;

public class H4WorkBaseballGame {

	public static void main(String[] args) {
		ArrayList<Integer> AB = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			int ranNum = (int) (Math.random()*10);

			if (AB.indexOf(ranNum) == -1) { 
				AB.add(ranNum);
			} else {
				i--;
			}
		}


		int ball = 0;
		int strike = 0;
		Scanner scan = new Scanner(System.in);
		while (strike != 3) {
			ball = 0;
			strike = 0;
			System.out.println("숫자 입력 하삼!");

			String[] str = scan.nextLine().split(",");
			int[] nums = new int[4];
			for (int i = 0; i < str.length; i++) {
				nums[i] = Integer.parseInt(str[i]);
			}
			for (int i = 0; i < nums.length; i++) {

				if (AB.indexOf(nums[i]) != -1) {
					if (i == AB.indexOf(nums[i])) {
						strike++;
					} else {
						ball++;
					}
				}

			}

			if (strike + ball == 0) {
				System.out.println("아웃!");
			} else {
				System.out.println(strike + "S, " + ball + "B");
			}
		}
	}

}

