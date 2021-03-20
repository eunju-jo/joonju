package days10;

import java.util.Date;

import days09.Ex05;

/**
 * @author 조은주
 * @date Mar 19, 2021 - 11:40:48 AM
 * @subject 주민번호 예제 이어
 * @content
 *
 */
public class Ex02 {
	public static void main(String[] args) {

		//980302-2199222
		String rrn;
		rrn = days09.Ex05.getRRN();
		boolean gender = Ex05.getGender(rrn);
		System.out.println(gender ? "남자":"여자");
		int century = getCentury(rrn);
		System.out.printf("%d년대\n",century);
		
		//주민등록번호로부터 생년월일을 출력 : 1949년 02월 19일
		// 19를 붙이려면 세기를 알아야해서 위에 한 것
		String birthday = getBirthday(rrn);
		System.out.println(birthday);

		//나이계산
		//1) 세는나이(한국나이)
		//2) 만 나이
		//한국나이: 2019.12.31(1세) / 2020.1.1.(2세) / 2020.12.30 (2세) / 2021.1.1.(3세)
		//만 나이: 2019.12.31(0세)  / 2020.1.1(0세) / 2020.12.30(1세) / 2021. 1.1.(1세) / 2021.12.31(2세)	
		
		//만 나이 반환 메서드
		//만 32세, 용띠입니다.	
		int age = getAge(rrn);
		System.out.printf("만 %d세, 호랑이띠입니다.\n", age	);
		//980302-2199222
		
		
	}//main

	private static int getAge(String rrn) {
		Date d = new Date()	;
		
		//밑에 잘 옮겨왔나 체크 
		
		//오늘 날짜 기준
		int year = Integer.parseInt(rrn.substring(0,2)); 
		int century = getCentury(rrn); 
		int birthYear = year += century;
		
		//세는 나이(무조건): thisYear - year +1;
		int manAge = (d.getYear()+1900) - birthYear -1;
		//manAge에 생일 지났는지 여부 처리해서 +1
		
		int theDay = Integer.parseInt(rrn.substring(2,6));
		int today = (d.getMonth()+1)*100 + d.getDate(); //3월19일
		if(theDay <= today) manAge = manAge++; //생일이 지났다면 (201 < 319) +1살 더하기
		return manAge;
	}

	private static String getBirthday(String rrn) {
		//"1998년 03월 28일"
		int year = Integer.parseInt(rrn.substring(0,2)); 
		int month = Integer.parseInt(rrn.substring(2,4)); // 03(월)을 읽어오려면 2번(비긴)~ 4번(앤드) 줘야 함/앤드 앞자리까지
		int day = Integer.parseInt(rrn.substring(4,6));
		
		int century = getCentury(rrn); //1900
		year += century;
		
		String birthday = String.format("출생일: %d년 %02d월 %02d일", year,month,day);
		//%d월 	03 -> 변환하니까 3월로 걍 나옴 %02d로 주면 두자리로 나올 수 있음
		
		return birthday;
	}

	public static int getCentury(String rrn) {
		int ㅅ = rrn.charAt(7) - 48; 
		int century;
		switch (ㅅ) {
		case 0: case 9:
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

}//class
