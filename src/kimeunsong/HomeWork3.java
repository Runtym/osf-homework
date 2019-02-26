package kimeunsong;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork3 {
	    // SearchList3
		// 나올수 있는 랜덤 숫자는 0-9
		// 맞춰야하는 숫자는 4개
	
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		
		for(int i=0;i<4;i++) {
			int num = (int)(Math.random()*9);
			 if(numList.indexOf(num)==-1) {
				numList.add(num);
			 } else {
				i--;
			 }
		}
			Scanner scan = new Scanner(System.in);
			System.out.println(",를 기준으로 4개 입력");
			String numStr = scan.nextLine();
			System.out.println("입력하신 숫자는 : " + numStr);
			
			String[] numStrs = numStr.split(",");
			int cnt = 0;
			for(String str : numStrs) {
				int num2 = Integer.parseInt(str);
				if(numList.indexOf(num2)!=-1) {
					cnt++;
				}
			}
			System.out.println("맞춘 갯수는 : " + cnt);
		}
	}