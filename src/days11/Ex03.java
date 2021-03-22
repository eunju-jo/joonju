package days11;

import java.util.Scanner;
import days09.Ex03_02;

/**
 * @author 조은주
 * @date Mar 22, 2021 - 2:08:32 PM
 * @subject 내일 시험칠것 : 만년 달력
 * @content
 *
 */
public class Ex03 {
	public static void main(String[] args) {

		int year, month;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("> year, month 입력? "); //2020.03.01까지의 총 날짜수?
		year = scanner.nextInt();
		month = scanner.nextInt();
		
		printCalender(year,month);

		//2020.03.월 가정
		//1. 그리고자하는 year.month.첫날 -> 무슨 요일인지 알아와야 가능
		//2. year.month. 마지막 날짜가 며칠까지 있는지?
		
		//강사님이 임의로 매칭한것: 0일 1월 2화 3수 4목 5금 6토
		int dayOfWeek = getDayOfWeek(year, month, 1); //1일 날짜가 무슨 요일인지 필요하니까 1	
		int lastDay = getLastDay(year, month);

		
	/*	각 월별로 마지막날 잘 잡혔나 확인용
		for (int i = 1; i <=12; i++) {                             // 월은 for문 속 i로 	
			System.out.printf("%d월 - %d일\n", i, getLastDay(year, i));
		}
	*/
		
		
	}//main

	
	private static void printCalender(int year, int month) {

		int dayOfWeek = getDayOfWeek(year, month, 1); //1일 날짜가 무슨 요일인지 필요하니까 1	
		int lastDay = getLastDay(year, month);
		
		System.out.printf("\t\t    %d년  %d월\n", year, month);
		System.out.println("---------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토\n");
		System.out.println("---------------------------------------------------");
		
		//\t for문 (1 위치 잡기 위함) '그' 1일의 dayOfWeek(요일)에 맞게 찍기위해 dayOfWeek가 월요일이면 tab 한번해서 두번째 칸 이런식
		for (int i = 0; i <dayOfWeek; i++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <=lastDay; i++) {
			System.out.printf("%d\t", i); // 개행없이 일단 찍는거
			if ((i+dayOfWeek) % 7 == 0 ) System.out.println();
				//앞에 공백개수(dayOfWeek)	까지 합쳐서 개행
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------");
	
	}


	//확인한 코딩
	private static int getLastDay(int year, int month) {
			
		int lastDay = 0;
		int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		// month의       0 = 1월        ~                   11번째방 = 12월
		lastDay = Ex03_02.isLeapYear(year) && month ==2 ?  ++months[month-1] : months[month-1];
		//윤년체크하고 +1더주기 // [month-1] 마이너스 1	하는거 까먹지 말기
		return lastDay;
		
	}

	
/*	private static int getLastDay(int year, int month) {
		// 31일까지 있는 달 : 1, 3, 5, 7, 8, 10, 12
		// 30일까지 있는 달 : 4, 6, 8, 11
		// 28일(29일)까지 있는 달 :  2 (윤년시)
		
		int lastDay = 0;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			lastDay = 31;
			break;

		case 4: case 6: case 9: case 11: 
			lastDay = 30;
			break;
			
		default:
			lastDay = days09.Ex03_02.isLeapYear(year)? 29 : 28;
//			lastDay = 윤년? 29: 28;
			break;
		}
		
		return lastDay;
	}
*/
	
	//1일이 무슨 요일인지 알아오는 함수
	private static int getDayOfWeek(int year, int month, int day) { //마지막은 i로 자동세팅되는데 day로 바꾸기
		//ㄱ. 1.1.1.(1년 1월 1일: 월요일) ~ year.month.1까지의 총날짜 수 계산 먼저. --getTotalDay
		//총 날짜 수 왜 필요?? 예) 1년 3월 2일이 무슨요일인지 알고 싶은데 모름
		//ㄴ. 총날짜 수 % 7 == 0(일요일) ~~ 6(토요일)
		// 그것을 리턴하면 요일 알 수 있음
				
		int totalDays = getTotalDays(year, month, day);
		int dayOfWeek = totalDays % 7;
		
		return dayOfWeek;
	}

	
	//2020.03.01까지의 총 날짜수?
	private static int getTotalDays(int year, int month, int day) {
		//1.1.1. ~ 2020.3.1 총 날짜 수
		// 1.1.1. ~ 2019.12.31 계산 + 2020.1.1 ~ 2 + (1)하루
		int totalDays = 0;
		
		
		totalDays = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		//이게 제일 심플하고 성능좋은 코딩 (2020까지 구하면 1~2019 구하는 거)
		
		
		//month =3 (2020년 1~3월 날짜)
		for (int i = 1; i <month; i++) {
			totalDays += getLastDay(year, i);
		}
		totalDays += 1;

		return totalDays;

		//성능은 이게 더 좋아도 가독성은 윗 함수가 더 좋음
/*		int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < month-1; i++) {
			totalDays += months[i];
			if(Ex03_02.isLeapYear(year) && month>=3) totalDays++;
		}
		totalDays += 1;
*/		
		
		//이전년도(2019)까지의 총합 //이중포문으로(년도*월)도 가능하지만 계산 너무 많이 돌아서 비효율적
		//이중포문보다는 아래가 효율적
/*		for (int i = 1; i < year; i++) {
			totalDays += Ex03_02.isLeapYear(year)? 366 : 365;
		}
		*/
		
		
		

		
	}
}//class
