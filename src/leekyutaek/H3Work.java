package leekyutaek;

import java.util.ArrayList;
import java.util.Scanner;

public class H3Work {
	public static void main(String[] args) {
		ArrayList<Integer> array4 = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			int random = (int) (Math.random() * 9) + 1;
			if (array4.indexOf(random) == -1) {
				array4.add(random);
			} else {
				i--;
			}

		}
		System.out.println(array4);
		Scanner scan = new Scanner(System.in);
		int strike;
		int ball;
		int out;
		do {
			strike = 0;
			ball = 0;
			out = 0;
			System.out.print("숫자를 입력해주세요 : ");
			String[] Str = scan.nextLine().split(",");
			int[] num = new int[4];
			for (int i = 0; i < num.length; i++) {
				num[i] = Integer.parseInt(Str[i]);
			}
			for (int i = 0; i < num.length; i++) {
				if (array4.indexOf(num[i]) != -1) {
					if (i == array4.indexOf(num[i])) {
						strike++;
					} else {
						ball++;
					}
				} else {
					out++;
				}
			}
			System.out.println(strike + "S " + ball + "B " + out + "OUT입니다.");
		} while (strike != 4);

	}
}
