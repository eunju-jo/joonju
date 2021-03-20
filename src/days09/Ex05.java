package days09;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

	//https://ko.wikipedia.org/wiki/%EC%A3%BC%EB%AF%BC%EB%93%B1%EB%A1%9D%EB%B2%88%ED%98%B8#%EC%97%AD%EC%82%AC	
	//주민등록번호 입력받아서 	ㄱㄴㄷㄹㅁㅂ - [ㅅ]ㅇㅈㅊㅋㅌㅍ
	// 1. 성별 2. 내국인/외국인 3.태어난 세기
		
		String rrn;
		rrn = getRRN();
		System.out.printf("> RRN: %s\n", rrn);
		
		//입력용: 123456-7890123
		
		//1.성별 (반환을 어떻게 할지는 선택쓰) -> 조건식에 사용하기에 true.false가 편해서 이거 할거임
		// 반환: 1,2 / true,false / m,f 등이 있지만,, 그렇다함
		
		boolean gender = getGender(rrn); //rrn 체크해야된께
		if(gender) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		
		//2. 내국인.외국인 체크 _외국인이니? true 내국인이면 false	
		if( isForeigner(rrn) ) {
			System.out.println("외국인");
		} else {
			System.out.println("내국인");
		}
		
		//3. 몇 세기인지century? 1800년대, 1900년대, 2000년대
		getCentury(rrn);
		
	}//main

public static void getCentury(String rrn) {
//		"1800년대" 이런식으로 출력되게 짜기
	}

public static boolean isForeigner(String rrn) {
	char s = rrn.charAt(7); //if(5<= <=8)해도 됨
	switch (s) {
	case '5': case '6': case '7': case '8':
		return true;
	}
	return false;
	}

public static boolean getGender(String rrn) {
	//ㄱㄴㄷㄹㅁㅂ-ㅅㅇㅈㅊㅋㅌㅍ

	//123456-7890123이면 문자'7'이 저장됨 
	char s = rrn.charAt(7); //ㅅ 성별 값 char에 저장 -> '2'임 (홑따옴표 안의 2)	
	//여기서 cmd shift b. 중단점브렉포인트 만들기
	//f6누르면 다음으루
	
	 return ( s - 48) % 2 ==1 ? true : false ;
	//이렇게 한줄로 끝내도 됨
	
	
	/*
	switch (s -48) { //아스키 0 빼주기(char를 숫자로 만들기 위해서)	
	case 9: case 1: case 3: case 5: case 7:
		return true; //return이 들어가면 break은 의미없어져버림. break버리기
		
	default:
		return false;
	}
	

	 	*/

}

//유효성검사까지 해서 돌려주기(숫자 자리수 맞는지)	
// "\d{6}-\d{7}" 숫자6자리-숫자7자리 형태가 되어야 리턴하는 함수 짤거임
	public static String getRRN() {

		String rrn;
		
		String regex = "\\d{6}-\\d{7}";
		boolean flag = false; //true이면 다시 입력하라고 알려주도록
		
		
		do {
			if(flag) System.out.print("[다시]: ");
			System.out.print("> 주민등록번호 입력?: ");
			Scanner scanner = new Scanner(System.in);
			rrn = scanner.nextLine();
		} while ( flag =!rrn.matches(regex) );
				
		return rrn;
	}

}//class


//주민등록번호 입력받아서 식별가능한 것
//1. 성별 (뒷자리 첫자리*)
//2. 생년월일(생일)
//3. 세기(몇십년대 출신인지) 1900' 2000' (뒷자리 첫자리*)
//4. 출생지역
//5. 내국인/외국인 (뒷자리 첫자리*)
//6. 정당한 주민번호인지 검증
//7. 나이

//주민등록번호(RRN) : Resident Registration Number	
// 네이버 쳐봐서 이것저것 보듯 프젝할 때도 이런식으로 내용파악해서 요구사항 분석 해야 함
// ㄱㄴㄷㄹㅁㅂ - ㅅㅇㅈㅊㅋㅌㅍ
// 1) ㄱㄴㄷㄹㅁㅂ = 생년월일
// 2) 'ㅅ' = 성별, 세기, 내국인-외국인
// 3) ㅇㅈ = 출생지역(출생 등록기준지 지역 고유번호)
// 4) ㅊㅋ = (출생등록지 읍,면,동 주민센터 고유번호)
// 5) ㅌ = 그날 출생신고한 순서
// 6) ㅍ = 주민등록번호 오류없는지 확인하는 검증번호
// ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
//  ㄴ> 검증하는 거 식
//즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 1, 11은 0로 표기한다.)