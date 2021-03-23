package days12;

import java.util.Scanner;

import days09.Ex03_02;

/**
 * @author 조은주
 * @date Mar 23, 2021 - 10:06:03 AM
 * @subject 아침 문제 1 풀이 : main 함수 매개변수통해 받기 - run as .. configuration
 * @content ㅇㅇㅇㅇ년도 달력 전체 출력 or ㅇㅇㅇㅇ년 ㅇㅇ월 달력 출력 -- 매개변수에 따라
 *
 */
public class Ex01_runAsConfig {

	public static void main(String[] args) {

		int year, month;

		if(args.length ==1) {//year 들어온 경우
			year = Integer.parseInt(args[0]);
			for (int i = 1; i <=12; i++) {
				printCalendar(year, i);
			}
			
		}else if(args.length == 2) {//year,month 들어온 경우
			year = Integer.parseInt(args[0]);
			month = Integer.parseInt(args[1]);
			printCalendar(year, month);
			
		}else {
			System.out.println("년도 혹은 년도와 월만을 입력하세요.");
			return;
		}
		
//		printCalendar(year, month);

	} // main

	private static void printCalendar(int year, int month) {
		// [2020.3]
		// 1. year.month.1 무슨 요일 ?
		// 2. year.month 마지막날짜 몇일 ?

		// 0~6 :  0(일) 1(월) 2(화) 3(수) 4(목) 5(금) 6(토)
		int dayOfWeek = getDayOfWeek(year, month,  1);
		int lastDay = getLastDay(year, month);
		
		
		System.out.printf("\t\t    %d년 %d월\n", year, month);
		System.out.println("----------------------------------------------------");
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		System.out.println("----------------------------------------------------");
		// \t for
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		// System.out.println(1~마지막날짜);
		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("%d\t", i);
			if( (i+dayOfWeek) % 7 == 0 ) System.out.println();
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();
	}

	private static int getLastDay(int year, int month) {

		int lastDay = 0 ;
		//                       1월  2월                                                   12월
		//                        0    1   2                                          11
		int [] months = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		lastDay =  Ex03_02.isLeapYear(year) && month == 2 ? ++months[month-1] : months[month-1];
		return lastDay;
	}


	private static int getDayOfWeek(int year, int month, int day) {
		int totalDays = getTotalDays(year, month, day);				
		int dayOfWeek = totalDays % 7;
		return dayOfWeek;
	}

	// 총 737485일
	private static int getTotalDays(int year, int month, int day) {

		int totalDays = 0;

		totalDays =  (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		for (int i = 1; i < month; i++)			totalDays += getLastDay( year, i);	
		totalDays += 1; 

		return totalDays;
	}

} // class