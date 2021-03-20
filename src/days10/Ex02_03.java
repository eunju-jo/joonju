package days10;

import java.util.Date;

/**
 * @author 조은주
 * @date Mar 19, 2021 - 2:21:14 PM
 * @subject date 클래스
 * @content
 *
 */
public class Ex02_03 {

	public static void main(String[] args) {

		//Date 클래스 - 날짜 정보
		
		Date d = new Date()	;
		System.out.println(d);
		
		int year = d.getYear();
		System.out.println(year); // 121 (2021년) -->1900이 빠져나옴(1900을 뺀 년도값 출력) --> 1900+을 더해줘야 2021이 나옴
		
		int month = d.getMonth();// 0~11월값을 내보냄 (1월 = 0월 ~ 12월=11월로 출력)
		System.out.println(month); // 2 (3월)
		
		int day = d.getDate();
		System.out.println(day); //19 (19일)	
		
		
	}//main

}//class
