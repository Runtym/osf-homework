package kimsunmin.p20190225;

import java.util.ArrayList;
import java.util.Scanner;
// version 0.2



public class BaseballGame {
	
	
	public static int arrayIndexOf(int[] arrNum, int num) {
		for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	public static String passError(String str) {
		// 콤마(,)를 두 번 입력하였을 경우에 에러를 방지하기 위한 처리
		if (str.indexOf(",,") != -1) {
			str = str.replace(",,", ",");
		}
		// 첫 글자를 콤마(,)로 입력 하였을 경우에 에러를 방지하기 위한 처리
		if (str.substring(0, 1).equals(",")) {
			str = str.substring(1);
		}
		return str;
	}


	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		int strikeCount = 0;
		int ballCount = 0;
		int tryCount = 0;
		
		// 중복 제거 및 numList에 random number 부여하기.
		for (int i = 0; i < 4; i++) {
			int ranNum = (int) (Math.random() * 9) + 1;
			if (numList.indexOf(ranNum) == -1) {
				numList.add(ranNum);
			} else {
				i--;
			}
		}

		// 사용자의 이름 정보를 수집한다.
		System.out.println("이름을 입력 해 주세요.");
		System.out.print(": ");
		Scanner nameScan = new Scanner(System.in);
		String name = nameScan.nextLine();

		while (strikeCount < 4) {
			int errorCount = 0;

			// 사용자로부터 입력을 받는다.
			System.out.println("','를 구분으로 1부터 9까지 4개의 숫자를 입력 해 주세요. (예시 : 1,2,3,4)");
			Scanner scan = new Scanner(System.in);
			String userInput = scan.nextLine();
			// 콤마(,)를 두 번 입력하였을 경우에 에러를 방지하기 위한 처리
			// 첫 글자를 콤마(,)로 입력 하였을 경우에 에러를 방지하기 위한 처리
			userInput = passError(userInput);

			String[] userNums = userInput.split(",");
			// 사용자로부터 입력 받은 수가 4개가 아닌 경우 오류 메세지를 출력하고,
			// while문의 가장 윗 부분으로 처리 순서 강제변경.
			
			
			if (userNums.length != 4) {
				System.out.println("입력에 오류가 발생하였습니다. 다음과 같이 입력 해 주세요. ( 입력 예시 :  1,2,3,4 )");
				continue;
			}
			

			// 사용자로 부터 입력 받은 userNums를 integer array type의 uNums로 저장.
			int[] uNums = new int[4];
			for (int i = 0; i < uNums.length; i++) {
				try {
					uNums[i] = Integer.parseInt(userNums[i]);
				}catch(Exception e) {
					System.out.println("입력에 오류가 발생하였습니다. 숫자를 입력 해 주세요.");
					errorCount = errorCount + 1;
					break;
				}
				// 사용자로부터 입력 받은 숫자 중에 하나라도 1부터 9사이의 숫자가 아닐 경우
				// while문의 가장 윗 부분으로 처리 순서 강제변경.
				if (uNums[i] < 1 || uNums[i] > 9) {
					System.out.println("1 부터 9 사이의 숫자를 다시 입력 해 주세요.");
					errorCount = errorCount + 1;
				}

				// errorCount 메소드를 사용하지 않았지만, 중복된 숫자가 있을 경우,
				if (arrayIndexOf(uNums, uNums[i]) != i) {
					System.out.println("입력하신 숫자 중에 중복을 발견했습니다. 다시 입력 해 주세요.");
					errorCount = errorCount + 1;
				}
			}
			
			if(errorCount>0) {
				continue;
			}
			
			// strike와 ball의 recount를 위헤 0으로 변경
			strikeCount = 0;
			ballCount = 0;
			// uNums로 받은 4개의 사용자 숫자와 random number 4개를 비교 후
			// strikeCount와 ballCount의 수를 변경
			
			for (int i = 0; i < numList.size(); i++) {
				if (numList.indexOf(uNums[i]) != -1) {
					if (numList.indexOf(uNums[i]) == i) {
						strikeCount++;
					} else {
						ballCount++;
					}
				}
			}

			// 시도 횟수를 위한 tyrCount와 현재의 상태 표시를 위한 Print.
			tryCount++;
			System.out.println("Strike : " + strikeCount + ", Ball : " + ballCount);
			System.out.println("현재까지의 시도 횟 수 : " + tryCount);
			System.out.println("------------------------");
		}
		System.out.println(name + " 님이 " + tryCount + "회 만에 COMPUTER를 이겼습니다.");
		System.out.println("( " + name + " 님이 입력 하신 숫자가 COMPUTER의 숫자인 " + numList + " 와 완벽히 일치 하였습니다. )");
		nameScan.close();
	}
}
