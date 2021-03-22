package days11_night;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 22, 2021 - 10:56:04 PM
 * @subject 2020년 3월 출력 가정
 * @content 말일 - total - 요일 산출
 *
 */
public class Ex03_prac1 {

	public static void main(String[] args) {

		System.out.println(">출력하려는 달의 년도와 월을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day ;
		
		int lastDay = getLastDays(year, month);
		int totalDays = getTotalDays(year, month, 1);
		int dayOfWeek = getDayOfWeek(year,month, 1);
		
		printCalender(year,month);
		
		
//		System.out.println(lastDay);
	}//main




	private static void printCalender(int year, int month) {
		
		int dayOfWeek = getDayOfWeek(year, month, 1);
		int lastDay = getLastDays(year, month);
		
		System.out.printf("\t\t    %d년 %d 월 \n", year, month);
		System.out.println("---------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토\n");
		System.out.println("---------------------------------------------------");

		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
	
		for (int i = 1; i <=lastDay; i++) {
			System.out.printf("%d\t", i);
			if((i+dayOfWeek) % 7 == 0) System.out.println();
		}
	
		System.out.println();
		System.out.println("---------------------------------------------------");

	}




	private static int getLastDays(int year, int month) {
		int lastDay = 0;
		int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//month는 0(1월)~11(12월)로 되어있음 --- 연산시 month-1 
		lastDay = days09.Ex03_02.isLeapYear(year) && month ==2 ? ++months[month-1] : months[month-1];
		
		return lastDay;
	}



	private static int getTotalDays(int year, int month, int day) {

		//1.1.1. ~ 2019.12.31
		int totalDays = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		for (int i = 1; i <month; i++) {
			totalDays += getLastDays(year, i);
		}
		++totalDays;
		
		return totalDays;
	}
	
	
	private static int getDayOfWeek(int year, int month, int i) {
		int totalDays = getTotalDays(year, month, 1);
		int dayOfWeek = totalDays % 7;
		//0일요일 ~ 6토요일
		
		return dayOfWeek;
	}

}//class
