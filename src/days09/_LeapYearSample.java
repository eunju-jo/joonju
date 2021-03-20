package days09;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 18, 2021 - 11:31:53 PM
 * @subject 입력받은 년도가 윤년leap year인지 구하기
 * @content
 *
 */
public class _LeapYearSample {

	public static void main(String[] args) {
		int year; //년도는 사칙연산하는 경우가 많으니 int로 선언
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("> 년도를 4자리로 입력하세요.");
		year = scanner.nextInt();
	
		if ( isLeapYear(year) ) {
			System.out.println("윤년 leap year");
		} else {
			System.out.println("평년 common year");
		}
		

	}//main

	
	//boolean이라서 true, false 값이 모두 있어야 함
	public static boolean isLeapYear(int year) {
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)  return true;
		else													return false;
	}

	//년도를 입력받아 윤년/평년 true, false 값으로 반환하는 메서드 만들고 자주 쓸것임
		
	

}
