package choiinkyung.p20190225;

import java.util.ArrayList;
import java.util.Scanner;

public class H3Work {
	// 나올수 있는 랜덤 숫자는 0-9
	// 맞춰야하는 숫자는 4개
	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<>();
//중복없는 랜덤값
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
		System.out.println("0 ~ 9사이 숫자 아무거나 ,를 기준으로 4개를 입력하세요.");
		String[] numStr = scan.nextLine().split(",");
		int[] nums = new int[4];
		for (int i = 0; i < numStr.length; i++) {
			nums[i] = Integer.parseInt(numStr[i]);
		}

		int bCnt = 0;
		int sCnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (numList.indexOf(nums[i]) != -1) {
				if (i == numList.indexOf(nums[i])) {
					sCnt++;
				}

			} else {
				bCnt++;
			}
		}
		if (sCnt + bCnt == 0) {
			System.out.println("아웃!");
		} else {
			System.out.println(sCnt + " Strike, " + bCnt + " ball");
		}

	}

}
