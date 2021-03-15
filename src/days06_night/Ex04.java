package days06_night;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		// 아침 7번 문제 풀이 
		//한 문자를 입력받아서 소문자,대문자,한글, 숫자인지,특수문자인지 출력
		//특수문자:#$@! 이렇게만 상정하겠음
		
//		1. 한 문자를 저장할 변수(one) 선언
//		2. 스캐너 선언 (scanner)	
//		3. 스캐너의 next() 혹은 nextLine()으로 첫 문자 가져오기
		
		char one;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 한 문자를 입력하세요: ");
		one = scanner.next().charAt(0);
		
		
		if ('A' <= one && one <='Z') {
			System.out.printf("%c는 대문자입니다.", one);
		} else if('a' <= one && one <='z'){
			System.out.printf("%c는 소문자입니다.", one);
		} else if('가' <= one && one <='힣'){
			System.out.printf("%c는 한글입니다.", one);
		} else if('1' <= one && one <='9'){
			System.out.printf("%c는 숫자입니다.", one);
		} else if(one=='#'|| one=='$'||one=='$'||one=='@'){
			System.out.printf("%c는 특수문자입니다.", one);
		} else {
			System.out.println("본 문자는 설명될 수 없습니다.");
		}
		
		
		
		
		
	}//main

}//class
