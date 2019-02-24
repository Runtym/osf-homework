package kangyoungjun;

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
		
		// 랜덤숫자의 범위 0-9, 숫자 4개 설정
		for (int i = 0; i < 4; i++) {
			int ranNum = (int)(Math.random() * 10);
			if (numList.indexOf(ranNum) == -1) {
				numList.add(ranNum);
			}else {
				i--;
			}
		}
		System.out.println(numList);
		System.out.println(", 을 구분자로 4가지 숫자를 입력하세요");		
		int ballCount = 0;
		int strikeCount = 0;
				
		while (strikeCount != 4) {
			ballCount = 0;
			strikeCount = 0;
			
			// 4가지 숫자를 입력받음

			String[] inputStr = (scan.nextLine().split(","));
			int[] inputNums = new int[inputStr.length];
			
			// 문자배열을 숫자배열로 파싱
			for (int i = 0; i < inputStr.length; i++) {
				inputNums[i] = Integer.parseInt(inputStr[i]);
			}
			
			for (int i = 0; i < inputNums.length; i++) {
				if (numList.indexOf(inputNums[i]) != -1) {
					if (i == numList.indexOf(inputNums[i])) {
						strikeCount++;
					}else {
						ballCount++;
					}
							
				}
			}
			if (ballCount + strikeCount == 0) {
				System.out.println("아웃");
			}
			System.out.println(strikeCount + "S " + ballCount + "B ");
		}
		System.out.println("게임종료");
	}
}