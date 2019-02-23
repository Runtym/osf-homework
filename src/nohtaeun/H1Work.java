package nohtaeun;

import java.util.ArrayList;
import java.util.Scanner;

public class H1Work {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			int ranNum = (int) (Math.random() * 9) + 1;
			if (numList.indexOf(ranNum) == -1) {
				numList.add(ranNum);
			} else {
				i--;
			}
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 4개를 입력 해주세요.");
		String strNum = scan.nextLine();
		String[] strNums = strNum.split(strNum);
		ArrayList<Integer> strList = new ArrayList<>();
		for (int i = 0; i < strNums.length; i++) {
			int num = Integer.parseInt(strNums[i]);
			strList.add(num);
		}
		int num = 0;
		for(int i=0;i<strList.size();i++) {
			int ranNum =(int)(Math.random()*9)+1;
			if(numList.indexOf(ranNum)!=-1) {
				num++;
			}
			System.out.println("맞춘 개수는" + num);
		}

	}

}
