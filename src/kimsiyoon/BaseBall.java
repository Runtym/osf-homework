package kimsiyoon;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall {
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
		int sCnt = 0;
		int bCnt = 0;
		while (sCnt!=4) {
			sCnt = 0;
			bCnt = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("궁굼한 숫자 4개를  , 기준에 맞춰 입력해주세요.");
			String num = scan.nextLine();
			String[] userNum = num.split(",");
			
			int[] userNum1 = new int[4];
					
			for(int i=0;i<userNum.length;i++) {
				userNum1[i] = Integer.parseInt(userNum[i]);
			}
			
			for(int i=0;i<userNum1.length;i++) {
				if(numList.indexOf(userNum1[i])==i){
					sCnt++;
				}else if(numList.indexOf(userNum1[i])!=-1) {
					bCnt++;
				}
			}	
			if(sCnt==0 && bCnt==0) {
				System.out.println("아웃!!!");
			}else {
				System.out.println(sCnt+"S ," + bCnt + "B 입니다.");
			}
		}
		System.out.println("모두 맞췄습니다 ^3^ !!! ");
		System.out.println("제 숫자는 : " + numList + "입니다.");
				
		}
}
