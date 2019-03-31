package nohtaeun.p20190225;

import java.util.ArrayList;
import java.util.Scanner;

public class H3Work {

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
		System.out.println(", 기준으로 숫자 4개를 입력 해주세요.");
		String strNum = scan.nextLine();
		scan.close();
		String[] strNums = strNum.split(",");
		ArrayList<Integer> strList = new ArrayList<>();
		for (int i = 0; i < strNums.length; i++) {
			strList.add(Integer.parseInt(strNums[i]));
			
			
		}
		System.out.println("입력한 수 : "+ strList);
		
		int scnt=0;
		int bcnt=0;
		
		for(int i = 0;i<numList.size();i++) {
			if(numList.indexOf(strList.get(i))!=-1) {
				if(numList.get(i)==strList.get(i)) {
					scnt++;
				}
			}
				
				
		}
		System.out.println("맞춘 갯수는" + scnt + "개 입니다.");	
	}

}
//
//
//

///