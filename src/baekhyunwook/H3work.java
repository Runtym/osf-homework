package baekhyunwook;

import java.util.ArrayList;
import java.util.Scanner;

public class H3work {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			int ranNum = (int) (Math.random() * 10) + 1;
			numList.add(ranNum);
		}
		System.out.println(numList);

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 4개를 , 를 구분해서 입력해주세요");
		String strNum = scan.nextLine();
		System.out.println("입력하신 번호는 " + strNum + " 입니다.");
		String[] strNums = strNum.split(",");

		int yesNum = 0;
		for (String str : strNums) {			
			int num = Integer.parseInt(str);
			if(numList.indexOf(num)!=-1) {
				yesNum++;
			}
		}
		System.out.println("맞춘 갯수는 : " + yesNum);
	}

}
