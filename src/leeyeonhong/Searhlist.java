package leeyeonhong;

import java.util.ArrayList;
import java.util.Scanner;

public class Searhlist {

	public static void main(String[] args) {
		ArrayList<Integer> AB = new ArrayList<>();

		for (int i = 0; i <= 3; i++) {
			int ranNum = (int)(Math.random()*10);
			AB.add(ranNum);
			}
		Scanner scan = new Scanner(System.in);
		System.out.println(",를 기준으로 4개의 숫자를 입력해주세요.");
		String jump = scan.nextLine();
		String[] str = jump.split(",");
		System.out.println("입력하신 숫자는 " + jump);
		int num = 0;
		
		
		for(String st:str) {
		if(AB.indexOf(Integer.parseInt(st))!=1) {
			num++;
		}
		}
		System.out.println("numlist :" + AB);
		System.out.println("맞춘갯수는 : " + num);
		
	}
	
	
}
