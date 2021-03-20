package days10_weekend;

import java.util.Date;

import days09.Ex05;

/**
 * @author 조은주
 * @date Mar 20, 2021 - 10:57:21 PM
 * @subject 주민번호 예제 시리즈 2	
 * @content 이전 메서드 불러와서 사용, 몇세기인지, 생일언젠지, 몇살인지.	
 *
 */
public class Re_Ex02 {

	public static void main(String[] args) {

		String rrn;
		rrn = days09.Ex05.getRRN();
		//getRRN 우클릭하면 원래 소스 보기 가능(open Declaration)
		
		boolean gender = Ex05.getGender(rrn);
		System.out.println(gender? "남자" : "여자");
		
		int century = getCentury(rrn);
		System.out.printf("%d년대\n",century);
		
		String birthday = getBirthday(rrn);
		System.out.println(birthday);
		
		int age = getAge(rrn);
		System.out.printf("현재 만 %d세입니다.\n", age);
		
	}//main

	private static int getAge(String rrn) {
		//만나이: 2021- 태어난년도-1 // 생일 지났으면 +1
		Date d = new Date();
		
		int year = Integer.parseInt(rrn.substring(0,2));
		int century = getCentury(rrn);
		year += century;
		
		int thisYear = d.getYear()+1900;
		int worldAge = thisYear - year - 1;
		
		int birthday = Integer.parseInt(rrn.substring(2,6));
		int today = (d.getMonth()+1)*100 + d.getDate();
		
		if(birthday <= today) worldAge++;
		
		
		return worldAge;
	}

	private static String getBirthday(String rrn) {
		int year = Integer.parseInt(rrn.substring(0,2));
		int month = Integer.parseInt(rrn.substring(2,4));
		int day = Integer.parseInt(rrn.substring(4,6));
		int century = getCentury(rrn);
		year += century;

		String birthday = String.format("출생일 : %d년 %02d월 %02d일", year, month, day);
		
		return birthday;
	}

//		920214-2140112
	private static int getCentury(String rrn) {
		int centuryNum = rrn.charAt(8)-48;
		int result;
		
		switch (centuryNum) {
		case 9: case 10:
			result = 1800;
			break;
		case 1: case 2: case 5: case 6:
			result = 1900;
			break;

		default:
			result = 2000;
			break;
		}
		
		return result;
	}

}//class
