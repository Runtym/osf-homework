package goodongheun;

import java.util.ArrayList;
import java.util.Scanner;

public class H2_random {;
		// SearchList3
		// 나올수 있는 랜덤 숫자는 0-9
		// 맞춰야하는 숫자는 4개
		// 2019-02-25
	
	public static void main(String [] args) {
		ArrayList<Integer> random = new ArrayList<>();
		for(int i=0;i<4;i++) {
			int ranNum = (int)(Math.random()*9);
		if(random.indexOf(ranNum)==-1) {
			random.add(ranNum);
		}else {
			i--;
		}
		}
		System.out.println("내가 맞춰야 하는 4개의 숫자 : "+ random);
		Scanner scan = new Scanner(System.in);	
		System.out.println("맞출 숫자를 ,를 이용해 적어주세요.");
		String strNum = scan.nextLine();
		String[] strNums = strNum.split(",");
		int [] num = new int[4];
		for(int i=0;i<strNums.length;i++) {
			num[i] = Integer.parseInt(strNums[i]);
		}
		int random1 = 0;
		int random2 = 0;
		for(int i=0;i<strNums.length;i++) {
			//해당 num은 배열로 indexOf시에 무조건 -1
			if(random.indexOf(num)!=-1) {
				random1++;
			}else if(i==random.indexOf(num[i])){
				random2++;
			}
		}
		if(random1+random2==0) {
			System.out.println("맞춘 숫자가 하나도 없습니다. 다시하세요.");
		}else {
			System.out.println("내가 맞춘 숫자의 갯수 : " + (random1 + random2));
		}
	}
}
