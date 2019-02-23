package leesoobin;

import java.util.ArrayList;

public class Compare {
	int sCnt;
	int bCnt;
	int oCnt;
	public void compare(ArrayList<Integer> numList,String[] str) {
		
			sCnt=0;
			bCnt=0;
			oCnt=0;
			for(int i=0;i<numList.size();i++) {
				int numStr = Integer.parseInt(str[i]);
				if(numStr==numList.get(i)) {
					sCnt++;
				}else if(numList.indexOf(numStr)!=-1) {
					bCnt++;
				}else oCnt++;
			}
			System.out.println(sCnt+"스트라이크"+bCnt+"볼"+oCnt+"아웃");
		
	}
}
