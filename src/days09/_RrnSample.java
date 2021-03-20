package days09;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 18, 2021 - 11:25:56 PM
 * @subject 주민등록번호 : 입력받기, 940328-2~ 중 성별 '2'자리 값으로 여성/내국인/1900년대 확인
 * @content Ex05
 *
 */
public class _RrnSample {

	public static void main(String[] args) {

	//ㄱㄴㄷㄹㅁㅂ - [ㅅ]ㅇㅈㅊㅋㅌㅍ
	// [ㅅ] 자리로 1. 성별 2. 내국인/외국인 3.태어난 세기 확인
	//입력용: 123456-7890123
		
		String rrn;
		rrn = getRRN();
		System.out.printf("> RRN: %s\n", rrn);
		
		
		//1. 성별체크
		boolean gender = getGender(rrn); 
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
		System.out.println(getCentury(rrn));
		
	}//main

public static String getCentury(String rrn) {
char s = rrn.charAt(7);
switch (s - 48) { //-48을 빼거나 (1의 아스키코드=49) '9'로 값받기 뭐든 상관무
case 9: case 0:
	return "1800년대";

case 1: case 2: case 5: case 6:
	return "1900년대";

default:
	return "2000년대";
}

//		"1800년대" 이런식으로 출력되게 짜기
	}

private static boolean isForeigner(String rrn) {
	char s = rrn.charAt(7); 
	switch (s) {   //if(5<= <=8)해도 됨
	case '5': case '6': case '7': case '8':
		return true;
	}
	return false;
	}

private static boolean getGender(String rrn) {

	char s = rrn.charAt(7); //ㅅ 성별 값 char에 저장 -> '2'임 (홑따옴표 안의 2)	
	
	 return ( s - 48) % 2 ==1 ? true : false ;
	

}

	private static String getRRN() {

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
