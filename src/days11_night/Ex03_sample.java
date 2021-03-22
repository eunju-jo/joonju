package days11_night;

import java.util.Scanner;

import days09.Ex03_02;

public class Ex03_sample {

	public static void main(String[] args) {
		int year, month;

		Scanner scanner = new Scanner(System.in);
		System.out.print("> year, month 입력 ? ");  // 2020.3 
		year = scanner.nextInt();
		month = scanner.nextInt();

		printCalendar(year, month);

	} // main

	private static void printCalendar(int year, int month) {
		// [2020.3]
		// 1. year.month.1 무슨 요일 ?
		// 2. year.month 마지막날짜 몇일 ?

		// 0~6 :  0(일) 1(월) 2(화) 3(수) 4(목) 5(금) 6(토)
		int dayOfWeek = getDayOfWeek(year, month,  1);
		int lastDay = getLastDay(year, month);
		
		
		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.println("--------------------------------------");
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		System.out.println("--------------------------------------");
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
		System.out.println("--------------------------------------");
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













/*
> year, month 입력 ? 2021 4
		2021년 4월
--------------------------------------
일	월	화	수	목	금	토
--------------------------------------
				1	2	3	
4	5	6	7	8	9	10	
11	12	13	14	15	16	17	
18	19	20	21	22	23	24	
25	26	27	28	29	30	
--------------------------------------
*/





/*
for (int i = 1; i <=12 ; i++) {
	Date d = new Date(121, i-1, 1);
	//System.out.println(d.toLocaleString());
	d.setMonth(1 + d.getMonth() );
	//System.out.println(d.toLocaleString());
	d.setDate(d.getDate() - 1);
	//System.out.println(d.toLocaleString());
	System.out.printf("%d월 - %d일\n", i,  d.getDate());
}
 */