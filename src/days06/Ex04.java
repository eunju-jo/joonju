package days06;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 15, 2021 - 4:12:31 PM
 * @subject 아침 문제: 7번 문제 풀이
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) throws IOException {

		// 아침 7번 문제 풀이 
		//한 문자를 입력받아서 소문자,대문자,한글, 숫자인지,특수문자인지 출력
		//특수문자:#$@! 이렇게만 상정하겠음
		
//		1. 한 문자를 저장할 변수(one) 선언
//		2. 스캐너 선언 (scanner)	
//		3. 스캐너의 next() 혹은 nextLine()으로 첫 문자 가져오기

		char one;
		Scanner scanner = new Scanner(System.in);
		System.out.print("한 문자 입력: ");
		
//		String data = scanner.nextLine();
//		one = data.charAt(0);
//		두 줄 대신 아래처럼 써도 됨
		one = scanner.nextLine().charAt(0);
		
		
		if('A'<=one && one<='Z') {
		System.out.printf("%c는 알파벳 대문자입니다.",one);
		} else if ('a'<=one && one<='z') {
			System.out.printf("%c는 알파벳 소문자입니다.",one);
			
		} else if ('0'<=one && one<='9') {
			System.out.printf("%c는 숫자입니다.",one);

		} else if ('가'<=one && one <='힣') { //한글의 범위
			System.out.printf("%c는 한글입니다.",one);
		} else if (one =='#' || one == '$' || one == '@' || one =='!') {
			System.out.printf("%c는 특수문자입니다.",one);
		}

		
		
		
		
		
		
		
		
	}//main

}//class
