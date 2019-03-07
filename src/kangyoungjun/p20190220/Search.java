package kangyoungjun.p20190220;

public class Search {
	
	public void Search(Object info) {
		String resultName = ""; 
		int pokeNum = 0;
		searchPoke(info); // 복잡한 검색 로직
		System.out.println("포켓몬번호 : " + pokeNum);
		System.out.println("포켓몬이름 : " + resultName);
	}
	
	public void searchPoke(Object obj) {
		// 요구사항
		// 포켓몬 번호로 조회, 이름 조회
		// 포켓몬 타입으로 조회, 무게로 조회
		// 발견지로 조회, 인근 포켓몬 센터 찾기
		
		// 개발순서
		// 1. 질문을 해석하여 원하는 목적의 분기로 배분
		// 2. 각 분기에 대한 기능 수행
		//    searchNo, searchName, searchType, searchWeight
		//    searchPlace, searchPokeCenter
	}
	public static void main(String[] args) {
		
	}
}
