package days11_night;

import java.util.Scanner;

public class Ex03_prac3 {

	public static void main(String[] args) {
		System.out.println(">출력할 달력의 년도와 월을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day ;
		
		int lastDays = getLastDay(year,month);
		int totalDays = getTotalDay(year,month,1);
		int DayOfWeeks = getDayOfWeek(year,month,1);
		
		printCalender(year,month);
		
	}

	private static void printCalender(int year, int month) {
		int lastDays = getLastDay(year, month);
		int dayOfWeeks = getDayOfWeek(year, month, 1);
		
		System.out.printf("\t\t    %d년 %d월\n", year, month);
		System.out.println("---------------------------------------------------");
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		System.out.println("---------------------------------------------------");

		for (int i = 0; i < dayOfWeeks; i++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <=lastDays; i++) {
			System.out.printf("%d\t", i);
			if((i+dayOfWeeks)% 7 == 0) System.out.println();
		}
	}

	
	
	private static int getDayOfWeek(int year, int month, int i) {
		int totalDays = getTotalDay(year, month, 1);
		int dayOfWeek = totalDays % 7;
		return dayOfWeek;
	}

	private static int getTotalDay(int year, int month, int i) {
		int totalDays = 0;
		totalDays = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		for (int j = 1; j < month; j++) {
			totalDays += getLastDay(year, j);
		}
		++totalDays;
		return totalDays;
	}

	private static int getLastDay(int year, int month) {
		int lastDay = 0;
		int [] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } ;
		lastDay = days09.Ex03_02.isLeapYear(year) && month ==2 ? ++months[month-1] : months[month-1];
		
		return lastDay;
	}

}
