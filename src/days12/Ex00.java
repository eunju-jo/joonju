package days12;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 23, 2021 - 5:19:22 PM
 * @subject 아침문풀 연습장
 * @content
 *
 */
public class Ex00 {
	public static void main(String[] args) throws IOException {

		//		만년달력 
		//		   main() 함수의 매개변수로 년도(year)만 입력받았을 때는 입력받은 년도(year)의 1월~12월 달력 출력
		//		          "                  "       년도(year), 월(month)를 입력받았을 때는    year, month 달력만 출력

		System.out.print(">출력을 원하는 달의 년도와 월을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day ;

		int lastDays = getLastDay(year, month);
		int totalDays = getTotalDay(year, month, 1);
		int dayOfWeek = getDayOfWeek(year, month, 1);

		printCalender(year,month);

		System.out.print("\n>출력을 원하는 년도를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int yearAll = sc.nextInt();
		int monthAll = 1;
		printCalender(yearAll, monthAll);


	}//main

/*	private static void printCalender(int yearAll, int monthAll) {
		int lastDays = getLastDay(yearAll, monthAll);
		int dayOfWeek = getDayOfWeek(yearAll, monthAll, 1);


		for (int monthAll = 1; monthAll <=12; monthAll++) {

			System.out.printf("\t\t    %d년 %d월\n", yearAll, monthAll	);
			System.out.println("===================================================");
			System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
			System.out.println("===================================================");

			for (int i = 0; i < dayOfWeek; i++) {
				System.out.print("\t");
			}

			for (int i = 1; i <=lastDays; i++) {
				System.out.printf("%d\t", i);
				if((i+dayOfWeek) % 7 == 0 )System.out.println();
			}		
		}
	} */

	private static void printCalender(int year, int month) {
		int lastDays = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month, 1);

		System.out.printf("\t\t    %d년 %d월\n", year, month	);
		System.out.println("===================================================");
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		System.out.println("===================================================");

		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <=lastDays; i++) {
			System.out.printf("%d\t", i);
			if((i+dayOfWeek) % 7 == 0 )System.out.println();
		}

	}

	private static int getDayOfWeek(int year, int month, int i) {
		int totalDays = getTotalDay(year, month, 1);
		int dayOfWeek = totalDays % 7; //0일욜 6토욜


		return dayOfWeek;
	}

	private static int getTotalDay(int year, int month, int i) {
		int totalDays = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		for (int j = 1; j < month; j++) {
			totalDays += getLastDay(year, j);
		}
		++totalDays;

		return totalDays;
	}

	private static int getLastDay(int year, int month) {
		int lastDay = 0;
		int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		lastDay = days09.Ex03_02.isLeapYear(year)&& month == 2 ? ++months[month-1] : months[month-1];
		return lastDay;
	}






}//class