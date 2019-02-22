package leesoobin;

import java.util.Scanner;

public class Input {

	public String[] numPut(int a) {
		Scanner scan = new Scanner(System.in);
		System.out.print("0~9까지 숫자 입력 :");
		String numStr = scan.nextLine();
		String[] nums = numStr.split(",",a);
		return nums;
	}
}
