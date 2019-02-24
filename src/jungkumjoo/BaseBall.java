package jungkumjoo;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			int ranNum = (int) (Math.random() * 9);
			if (numList.indexOf(ranNum) == -1) {
				numList.add(ranNum);
			} else {
				i--;
			}
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("0~9중에서 ,를 기준으로 숫자 4개를 입력해주세요.");
		String Str = scan.nextLine();
		String[] numStrs = Str.split(",");
		System.out.println("입력하신 숫자는 : " + Str);
		ArrayList<Integer> sList = new ArrayList<>();
		for (int i = 0; i < numStrs.length; i++) {
			int num = Integer.parseInt(numStrs[i]);
			sList.add(num);
		}
		int j = 0;
	int a = 0;
	int b = 0;
	for(j = 0; j < sList.size(); j++){
		int sNum = sList.get(j);
		if (numList.indexOf(sNum) != -1) {
			if (j == numList.indexOf(sNum)) {
				a++;
			} else {
				b++;
			}
		}
	}if(a+b==0)
	{
		System.out.println("Out!");
	}else
	{
		System.out.println(a + "Strike, " + b + "Ball");
	}
	System.out.println("numList : "+numList);
	}
		}