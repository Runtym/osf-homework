package simjongin;

import java.util.ArrayList;
import java.util.Scanner;

public class H3Work {
	// SearchList3
	// 나올수 있는 랜덤 숫자는 0-9
	// 맞춰야하는 숫자는 4개
	// 2019-02-25
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			int num = (int) (Math.random() * 10);
			if (numList.indexOf(num) != -1) {
				i--;
			} else {
				numList.add(num);
			}
		}
//		System.out.println(numList);
		for (int j = 0; j < 10;) {
			int sC=0;
			int bC=0;
			System.out.print(",을 기준으로 야구게임의 숫자 4개를 입력하세여 : ");
			String[] strs = scan.nextLine().split(",");
			for(int i=0;i<numList.size();i++) {
				int nums=Integer.parseInt(strs[i]);
				if(numList.indexOf(nums)!=-1) {
					if(numList.indexOf(nums)==i) {
						sC++;
					}else {
						bC++;
					}
				}
			}
			System.out.println(sC+"S"+bC+"B");
			if(sC==4) {
				j+=100;
				System.out.println("음 . . 님이 이김");
				System.out.println(numList);
			}
		}

		scan.close();
	}
}