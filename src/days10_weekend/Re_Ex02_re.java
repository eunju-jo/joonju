package days10_weekend;

import java.util.Date;

import days09.Ex05;

/**
 * @author 조은주
 * @date Mar 20, 2021 - 11:34:24 PM
 * @subject 몇세기인지, 생일언젠지, 몇살인지.	
 * @content 다시 스스로 코딩 연습
 *
 */
public class Re_Ex02_re {

	public static void main(String[] args) {
		String rrn;
		rrn = days09.Ex05.getRRN();
		
		boolean gender = Ex05.getGender(rrn);
		System.out.println(gender? "\n성별 : 남성" : "\n성별 : 여성");
		
		int century = getCentury(rrn);
		System.out.printf("출생세기 : %d년대\n",century);
		
		String birthday = getBirthday(rrn);
		System.out.println(birthday);
		
		int worldAge = getAge(rrn);
		System.out.printf("현재 만 %d세입니다.", worldAge);
		
		
	}//main
	
private static int getAge(String rrn) {
	//2021 - 출생년도 - 1 생일 지나면 +1
	Date date = new Date();
	
	int year = Integer.parseInt(rrn.substring(0, 2));
	int century = getCentury(rrn);
	year += century;
	
	int thisYear = date.getYear()+1900;
	int worldAge = thisYear - year - 1;

	int birthday = Integer.parseInt(rrn.substring(2, 6));
	int today = (date.getMonth()+1)*100 + date.getDate();
	if(birthday <= today) worldAge++;

	return worldAge;
	}

	// 940328-2170317
	private static String getBirthday(String rrn) {
		
		int year = Integer.parseInt(rrn.substring(0, 2));
		int century = getCentury(rrn);
		year += century;
		int month = Integer.parseInt(rrn.substring(2, 4));
		int day = Integer.parseInt(rrn.substring(4, 6));
		
		String birthday = String.format("출생일 : %d년 %02d월 %02d일", year, month, day);
		
		return birthday;
	}

	private static int getCentury(String rrn) {
		int sexNum = rrn.charAt(8)-48;
		int century;
		
		switch (sexNum) {
		case 9: case 10:
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

}
