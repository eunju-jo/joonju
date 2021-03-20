package days10_weekend;

import java.util.Scanner;

public class Re_9dayExam03 {

	public static void main(String[] args) {
//		3. 년도를 입력받아서 윤년( leap year ) , 평년( common year) 를 출력하는 코딩을 하세요.
//	    윤년여부를 체크하는  isLeapYear() 메서드 선언
		
		System.out.print("> 년도를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		isLeapYear(year);
		
		
		
	}//main

	private static void isLeapYear(int year) {
		if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0 ) System.out.println("윤년");
		else System.out.println("평년");
		
	}

}//class
