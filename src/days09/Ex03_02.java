package days09;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 18, 2021 - 2:12:06 PM
 * @subject 9일: 4자리의 년도를 입력받아서 "윤년" 또는 "평년"을 출력하는 코딩
 * @content
 *
 */
public class Ex03_02 {
	public static void main(String[] args) {
		int year; //2010 -> 년도는 덧셈뺄셈할일 많아서 int로 선언하는 것이 좋음
		
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
	//....03_02랑 03 내용 바뀌었음 다시 돌려놓기 	
	
}//class

