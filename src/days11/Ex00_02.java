package days11;

import java.util.Date;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 22, 2021 - 10:04:07 AM
 * @subject 10일차 Ex03 관련..올바르지 않다고 나옴 다시하기
 * @content
 *
 */
public class Ex00_02 {

	public static void main(String[] args) {
//**		if (ㅍ ==10) ㅍ=0;
//		else if(ㅍ ==11) ㅍ=1;
//		   Ex03 파일 1-0 거꾸로 되어 있음.****
//		  정리본 블로그 수정해놓기
		
		
		
		//days10 - ex03 관련
		String rrn;
		System.out.println("주민번호를 입력하세요(예:940328-2415107): ");
		Scanner scanner = new Scanner(System.in);
		rrn = scanner.nextLine();
		
		int century = getCentury(rrn);
		
		System.out.printf("만 나이는 %d세입니다.\n", getAge(rrn, century));
		
		if(isRRNCheck(rrn)) System.out.println("정당한 주민번호입니다.");
		else System.out.println("올바르지 않은 주민번호입니다.");
		
		
	}//main

	private static boolean isRRNCheck(String rrn) {
//int ㅍ = 11- ((2*ㄱ+3*ㄴ+4*ㄷ+5*ㄹ+6*ㅁ+7*ㅂ+8*ㅅ+9*ㅇ+2*ㅈ+3*ㅊ+4*ㅋ+5*ㅌ) % 11);
		int sum = 0;
		int [] m = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		for (int i = 0; i < m.length; i++) {
			sum += m[i] * (rrn.charAt(i)-48); //charAt(i)에 i에다가 0써놔서 오류났었음.,정신차리기
		}
		int checkNum = 11 - (sum % 11);
		if(checkNum ==10) checkNum = 0;
		else if(checkNum ==11) checkNum = 1;
		int realLastNum = rrn.charAt(13)-48;
		return checkNum == realLastNum;
	}		
	
	
	
	private static int getCentury(String rrn) {
		int centuryNum = rrn.charAt(7)-48; //940328-2
		int century;
		switch (centuryNum) {
		case 9: case 0:
			century = 1800;
			break;
		case 1: case 2: case 5: case 6:
			century = 1900;
			break;

		default:
			century = 2000;
			break;
		}
		return century;
	}

	private static int getAge(String rrn, int century) {
		int year = Integer.parseInt(rrn.substring(0, 2));
		year += century;

		Date date = new Date();
		int thisYear = date.getYear()+1900;
		int worldAge = thisYear - year - 1;
		
		int birthday = Integer.parseInt(rrn.substring(2, 6));
		int today = (date.getMonth()+1)*100 + date.getDate();
		if(birthday <= today ) worldAge++;
		return worldAge;
	}

}//class
