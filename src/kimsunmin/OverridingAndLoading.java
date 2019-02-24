package kimsunmin;

import java.util.Scanner;


public class OverridingAndLoading {

	public static void main(String[] args) {
		for(int i =0;i<9;i++) {

			System.out.println("궁금한 것을 고르시오.(숫자만 입력 해 주세요.) 1. 오버라이딩, 2. 오버로딩 3.이제 다 알아 ㅃ2(나가기)");
			Scanner scan = new Scanner(System.in);
			String input =scan.nextLine();
			
			if(input.equals("1")) {
				System.out.println("오버라이딩을 선택하셨습니다.");
				for(int j=0;j<10;j++) {
					System.out.println("==================================");
					System.out.println("1. 오버라이딩의 사전적 의미가 보고 싶어요.");
					System.out.println("2. 예시를 들어서 자세한 설명이 보고 싶어요.");
					System.out.println("3. 이제 다 알아요(이전 페이지로 가기)");
					System.out.println("==================================");
					Scanner scan1 = new Scanner(System.in);
					String input1 =scan1.nextLine();
					if(input1.equals("1")) {
						System.out.println("자! 오버라이딩을 배우기 전에 '오버라이딩'이라는 단어의 뜻을 먼저 알아보아야할 것 같습니다.");
						System.out.println("'오버'라는 뜻은 무엇인가를 넘거나, 위에 올라섰을 때 쓰는 전치사 입니다. 그리고, ");
						System.out.println("'라이딩'이라는 뜻은 말이나 짐승 따위를 타는 것을 이야기 하는 단어입니다.");
						System.out.println("이 두 단어가 만나서 '오버라이딩'이라는 단어가 만들어지게 된 것이죠.");
						System.out.println("즉, 오버라이딩이란, '무엇인가를 올라타서 그 위에 있는다.'라는것을 의미하는 단어입니다.");
						System.out.println("절대 아래의 것을 지우고 그 자리를 차지하는 것이 아니고, 위에 올라탄다는 의미를 가지고 있습니다.");
						j--;
					}else if(input1.equals("2")) {
						System.out.println("컴퓨터에서 하나의 예시를 들자면,");
						System.out.println("같은 폴더에서 같은 이름과 같은 확장자를 가진 것을 또 다운 받거나 옮겨 놓을 때,");
						System.out.println("덮어 쓰시겠습니까? 라고 물어보는 것이라고 생각하면 이해하기 편하실 것 같습니다.");
						System.out.println("완전히 같지는 않지만, 같은 이름과 같은 확장자를 가지고 있다면 완벽히 같은 파일이기 때문에,");
						System.out.println("그 파일을 더블 클릭 했을 때는 이전에 무엇이 있었더라도, 새로운 것을 실행하게 되는 것이죠.");
						System.out.println("예를 들어서, 부모 클래스로부터 상속 받은 클래스가 부모 클래스에 있는 메소드를 다시 정의하려고 합니다.");
						System.out.println("이 때 분명 덮어쓰거나, 부모 클래스의 메소드를 사용하거나, 둘 중 하나일 것 입니다.");
						System.out.println("java는 물어보지도 않고!! 덮어버립니다. !! 주인한테 물어보지도 않고!!");
						System.out.println("일단은 이러한 것을 '오버라이딩' 이라고 합니다.");
						System.out.println("멋있게 말하자면, 부모 클래스와 부모 클래스를 상속 받은 자식 클래스가 있고 ");
						System.out.println("부모 클래스에 있는 메소드를 자식 클래스에서 만들 때, 파라메터의 위치, 갯 수, 타입이 같고,");
						System.out.println("메소드의 리턴 타입과 이름이 같다면 !");
						System.out.println("메소드를 호출했을 때, JAVA는 오버라이딩을 해서 자식 클래스에서 정의한 내용을 실행하게 되는 것입니다. ");
						System.out.println("( 절대 부모 클래스의 메소드를 삭제하는 것은 아니라는 것을 명심해야 합니다. )");
						j--;
					}else if(input1.equals("3")) {
						System.out.println("이전 으로 돌아갑니다.");
						j=10;
		
					}
					
				}
				i--;
			}else if (input.equals("2")) {
				System.out.println("오버로딩을 선택하셨습니다.");
				for(int j=0;j<10;j++) {
					
					System.out.println("==================================");
					System.out.println("1. 오버로딩의 사전적 의미가 보고 싶어요.");
					System.out.println("2. 예시를 들어서 자세한 설명이 보고 싶어요.");
					System.out.println("3. 이제 다 알아요(이전 페이지로 가기)");
					System.out.println("==================================");
					Scanner scan2 = new Scanner(System.in);
					String input2 =scan2.nextLine();
					if(input2.equals("1")) {
						System.out.println("자! 오버로딩을 배우기 전에 '오버로딩'이라는 단어의 뜻을 먼저 알아보아야할 것 같습니다.");
						System.out.println("'오버'라는 뜻은 무엇인가를 넘거나, 위에 올라섰을 때 쓰는 전치사 입니다. 그리고, ");
						System.out.println("로딩, 로드 라는 뜻은 상자나 물건을 어떤 넓은 면에 싣는 것을 의미하는 단어입니다.");
						System.out.println("이 두 단어가 만나서, '오버로딩'이라는 단어가 만들어지게 된 것이죠.");
						System.out.println("즉, 오버로딩이란, 무엇인가를 넓은 책상이나 트럭 짐칸에 올려서 싣는 것을 의미하는 단어입니다.");
						j--;
					}else if(input2.equals("2")) {
						System.out.println("컴퓨터에서 하나의 예시를 들자면,");
						System.out.println("같은 폴더에서 이름은 같지만 확장자명은 다른 파일을 만들 때,");
						System.out.println("덮어 쓰시겠습니까?");
						System.out.println("라고 안! 물어보는 것이 프로그래밍에서의 오버로딩과 매우 비슷한 의미입니다.");
						System.out.println("예를 들어서, 한 클래스 안에서 메소드를 만들 때, 이름은 같지만, 파라메터의 갯 수, 타입, 위치,");
						System.out.println("그리고 리턴 타입이 하나라도 다른 메소드들을 만들게 되면 이 메소드들은 완전히 다른 메소드로 사용하게 됩니다.");
						System.out.println("이러한 것을 JAVA는 허락 해 주고 있습니다.");
						System.out.println("그리고 이러한 것을 '오버로딩'이라고 합니다.");
						System.out.println("즉, 트럭 짐칸에 물건을 올려놓았는데, 상자는 같지만, 안에 든 물건과 상자의 주인이 다르다면,");
						System.out.println("이 트럭은 완전히 다른 물건을 짐칸에 싣게 되는 것이라고 생각하면 외우기는 좋습니다. ");
						System.out.println("멋있게 말하자면, 메소드나 클래스의 생성자를 만들 때, 이름은 같아도, 출력 타입(메소드), 파라메터의 갯 수와 ");
						System.out.println("타입이 다르다면, 완전히 다른 메소드나 생성자를 만들 수 있다. 그리고 이러한 것을 '오버로딩'이라고 한다.");
						System.out.println("");
						j--;
					}else if(input2.contentEquals("3")) {
						System.out.println("이전으로 돌아갑니다.");
						j=10;
					}
				}
				i--;
				
			}else if(input.equals("3")) {
				System.out.println("올~ ");
				scan.close();
				i=10;
			}else {
				System.out.println("숫자만 입력 해 주세요. 1, 2, 3 !");
				i--;
			}
			
		}	
	}
}
