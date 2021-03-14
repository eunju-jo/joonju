package days05_weekend;

import java.util.Scanner;

public class Practice_5switch {

	public static void main(String[] args) {
		//국어 점수 입력받아 kor 변수에 저장(switch) 
		//0-100 이외 프로그램 종료
		// grade 매길 것 
		//수 우 미 양 가 출력
		//수 - 90이상 100이하
		//우 - 80이상 90미만 
		//미 - 70이상 80미만 
		//양 - 60이상 70미만 
		//가 - 0이상 60미만 

		int kor;

		System.out.print("국어 점수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);

		kor = scanner.nextInt();

		if(0<=kor && kor<=100) {
			char grade ;

			switch (kor/10) {
			case 10: case 9:
				grade = '수';
				break;
			case 8:
				grade = '우';
				break;
			case 7:
				grade = '미';
				break;
			case 6:
				grade = '양';
				break;
			default:
				grade = '가';
				break;

			}
			System.out.printf("%d%s = \'%c\'", kor, "점",grade);
		} else {
			System.out.println("프로그램 종료: 정당한 점수를 입력하세요.");
		}


	}//main

}
