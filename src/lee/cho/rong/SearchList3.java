package lee.cho.rong;

import java.util.ArrayList;
import java.util.Scanner;

	

public class SearchList3 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			int num = (int) (Math.random() * 9) + 1;
			if (numList.indexOf(num) == -1) {
				numList.add(num);
			} else {
				i--;
			}
		}

		
		System.out.println(",로 구분하여 숫자를 4개 입력하세요.");

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		System.out.println("입력한 숫자 : " + str);

		scan.close();
		String[] strs = str.split(",");
		ArrayList<Integer> numsList = new ArrayList<>();
		for (String str1 : strs) {
			numsList.add(Integer.parseInt(str1));
		}

		int cntS = 0;
		int cntB = 0;
		for (int i = 0; i < 4; i++) {
			int num1 = numsList.get(i);
			if (numList.indexOf(num1) != -1) {
				if (numList.indexOf(num1) == i) {
					cntS++;
				} else {
					cntB++;
				}
			}
		}

		if (cntS + cntB == 0) {
			System.out.println("아웃");
		} else {
			System.out.println(cntS + "S" + cntB + "B");
		}

		System.out.println("정답은 : " + numList);
	}
}
