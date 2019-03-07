package kimeunmi.p20190225;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBallGame {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=0;i<4;i++) {
			int ranNum = (int)(Math.random()*10);
			if(numList.indexOf(ranNum)==-1) {
				numList.add(ranNum);
			}else {
				i--;
			}
		}
		System.out.println("numList = " + numList);
		int s = 0;
		while(s!=4) {
			int o = 0;
			s = 0;
			int b = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println(", 를 기준으로 1의 자리 숫자 4개 입력해 주세요");
			String[] strs = scan.nextLine().split(",");
			ArrayList<Integer> nums = new ArrayList<>();
			
			for(int i=0;i<4;i++) {
				nums.add(Integer.parseInt(strs[i]));
				if(numList.indexOf(nums.get(i))!=-1) {
					if(i==nums.indexOf(numList.get(i))) {
						s++;
					}else {
						b++;
					}
				}else {
					o++;
					
				}
			}
			System.out.println("결과 : " + b + "Ball, " + s + "Strike, " + o + "Out");
			if(s==4) {
				System.out.println("Nice~~!!!");
			}
			
		}
		
 	}
	
}
