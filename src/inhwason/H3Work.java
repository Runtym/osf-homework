package inhwason;
import java.util.ArrayList;
import java.util.Scanner;
public class H3Work 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 4; i++) 
		{
			int ranNum = (int) (Math.random() * 10) ;

			if (numList.indexOf(ranNum) == -1) 
			{
				numList.add(ranNum);
			} 
			else 
			{							
				i--;
			}
		}
		System.out.println("numList : " + numList);
		int bCnt = 0;
		int sCnt = 0;
		System.out.println("0~9 ,를 기준으로 4번 입력 해주세요. ");
		
		while (sCnt != 4) 
		{
			bCnt = 0;
			sCnt = 0;
			System.out.println("번호 입력 : ");
			Scanner scan = new Scanner(System.in);		
			String[] numStr = scan.nextLine().split(",");
			int[] nums = new int[4];
			
			for (int i = 0; i < nums.length; i++) 
			{			
				nums[i] = Integer.parseInt(numStr[i]);
			}
				
			for (int i = 0; i < nums.length; i++) 
			{
				
				if (numList.indexOf(nums[i]) != -1) 
				{
					if (i == numList.indexOf(nums[i]))
					{
						sCnt++;
					} 
					else 
					{
						bCnt++;
					}
				}
			}
			if (sCnt + bCnt == 0 ) {
				System.out.println("아웃");
			} 
			else
			{
				System.out.println(sCnt + "S " + bCnt + "B ");
			}
		}
		System.out.println("game over");
	}
}
