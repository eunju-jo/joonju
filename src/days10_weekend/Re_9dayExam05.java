package days10_weekend;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 21, 2021 - 3:24:05 AM
 * @subject
 * @content
 *
 */
public class Re_9dayExam05 {

	public static void main(String[] args) {
//		5. 주민등록번호 14자리를 입력받아서 
//	    성별 :  getGender() 메서드 선언
//	    내외국인 구분 : isForeigner()  메서드 선언
//	    세기 (1800년대 , 1900년대,  2000년대 )  :  getCentry() 메서드 선언
//	    후 출력하는 코딩.
		
		
		String rrn;
		Scanner scanner = new Scanner(System.in);
		String regex = "\\d{6}-\\d{7}";
		boolean flag = false;
		
		do {
			if(flag) System.out.println("입력오류. 양식에 맞게 다시 입력하세요.");
			System.out.print("주민번호를 입력하세요(예:840218-2140525) : ");
			rrn = scanner.nextLine();
			
		} while (flag = !rrn.matches(regex));
		
		if( getGender(rrn)) System.out.println("남자");
		else System.out.println("여자");

		isForeigner(rrn);
		if(isForeigner(rrn)) System.out.println("외국인");
		else System.out.println("내국인");
		
		
		System.out.printf("%d년대", getCentury(rrn));
		
		
		
	}//main

	private static int getCentury(String rrn) {
		int genderNum = rrn.charAt(7)-48;
		int century;
		switch (genderNum) {
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

	private static boolean isForeigner(String rrn) {
		int genderNum = rrn.charAt(7)-48;
		if(5<=genderNum && genderNum <=8) return true;
		else return false;
	}

	private static boolean getGender(String rrn) {
		int genderNum = rrn.charAt(7)-48;
		if(genderNum %2 != 0) return true;
		else return false;
	}

}//class
