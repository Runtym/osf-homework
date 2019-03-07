package kimbongkook.p20190225;

import java.util.ArrayList;
import java.util.Scanner;

public class H3Work {
	// SearchList3
	// 나올수 있는 랜덤 숫자는 0-9
	// 맞춰야하는 숫자는 4개
	// 2019-02-25
	public static void main(String[] args) {
		ArrayList<Integer> numsList = new ArrayList<>();
		
		for(int i=0; i<4; i++) {
			int num=(int)(Math.random()*9);
			if(numsList.indexOf(num)!=-1) {
				i--;
			} else {
				numsList.add(num);
			}
		} 
		System.out.println("랜덤 수 : "+numsList);
		
		Scanner scan = new Scanner(System.in);
		System.out.println(", 기준으로 숫자 4개를 입력해주세요: ");
		String strs = scan.nextLine();
		scan.close();
		String[] strNums = strs.split(",");
		
		ArrayList<Integer> strsList = new ArrayList<>();
		
		for(int i=0; i<strNums.length; i++) {
			strsList.add(Integer.parseInt(strNums[i]));
		}
		System.out.println("입력한 수 : "+strsList);
		
		int sCnt=0, bCnt=0;
		
		
		for(int i=0; i<numsList.size(); i++) {
				if(numsList.indexOf(strsList.get(i))!=-1){
					if(numsList.get(i)==strsList.get(i)) {
						sCnt++;
					}else {
						bCnt++;
					}				
			}
		}
		System.out.println(sCnt+"S "+bCnt+"B");
		}
}