package kimdongkeun;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBallH3Work {
	
	public static void main(String[] args) {
		
		int size = 4;
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		for(int i=0;i<size;i++) {
			int ranNum = (int)(Math.random()*10);
			if(numList.indexOf(ranNum)!=-1) {
				i--;
			}else {
				numList.add(ranNum);
			}
		}
		
		
		int[] nums = new int[size];
		int bCnt = 0;
		int sCnt = 0;
		int totalCnt = 1;
		Scanner scan = new Scanner(System.in);
		while(sCnt !=size) {
			bCnt = 0;
			sCnt = 0;
			System.out.print(totalCnt + "회차 : ");
			System.out.println(",를 구분자로 숫자 " + size + "개를 입력해주세요.");
			String numStr = scan.nextLine();
			System.out.println("입력하신 숫자는 : " + numStr);
			String[] numStrs = numStr.split(",");
			
			for(int i=0;i<nums.length;i++) {
				nums[i] = Integer.parseInt(numStrs[i]);
				if(numList.indexOf(nums[i])!=-1) {
					if(numList.indexOf(nums[i]) == i) {
						sCnt ++;
					}else {
						bCnt ++;
					}
				}
			}
			if(sCnt + bCnt == 0) {
				System.out.println("아웃");
			}else {
				System.out.println(sCnt + "S " + bCnt + "B");
			}
			totalCnt++;
			System.out.println("---------------------------");
		}
		System.out.println("총 사용 횟수 : " + (totalCnt-1));
		System.out.println("끝");
		scan.close();
	}
}
//String[] numStr = scan.nextLine().split(",");