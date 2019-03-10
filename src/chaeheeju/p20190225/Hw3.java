package chaeheeju.p20190225;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw3 {
	
	public static void main(String [] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<4;i++) {
			int ranNum = (int)(Math.random()*10);
		if(al.indexOf(ranNum)==-1) {
			al.add(ranNum);
		}else {
			i--;
		}
		}
		System.out.println(al);
		Scanner scan = new Scanner(System.in);	
		System.out.println(",를 맞춰서 숫자 4개를 입력하시오.");
		String strNum = scan.nextLine();
		String[] strNums = strNum.split(",");
		int [] num = new int[4];
		for(int i=0;i<strNums.length;i++) {
			num[i] = Integer.parseInt(strNums[i]);
		}
		int bCnt = 0;
		int sCnt = 0;
		for(int i=0;i<strNums.length;i++) {
			if(al.indexOf(num)!=-1) {
				bCnt++;
			}else if(i==al.indexOf(num[i])){
				sCnt++;
			}
		}
		if(bCnt+sCnt==0) {
			System.out.println("아웃!");
		}else {
			System.out.println(bCnt+"B"+sCnt+"S");
		}
	}
}
