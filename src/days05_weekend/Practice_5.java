package days05_weekend;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 14, 2021 - 9:57:45 PM
 * @subject if else수우미양가 11번 관련 
 * @content
 *
 */
public class Practice_5 {

	public static void main(String[] args) {

		//국어 점수 입력받아 kor 변수에 저장(if,else if) 
		//0-100 이외 프로그램 종료 
		// grade 매길 것 
		//수 우 미 양 가 출력
		//수 - 90이상 100이하
		//우 - 80이상 90미만 
		//미 - 70이상 80미만 
		//양 - 60이상 70미만 
		//가 - 0이상 60미만 


		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");

		int kor= scanner.nextInt();
		if (0<=kor && kor<=100) {
			char grade = 'x';
			if (kor>=90) {
				grade = '수';
			} else if(kor>=80){
				grade = '우';
			} else if(kor>=70){
				grade = '미';
			} else if(kor>=60){
				grade = '양';
			} else{
				grade = '가';
			}
			System.out.printf("%d%s = \'%c\'",kor,"점",grade);
		} else {
			System.out.println("프로그램 종료: 정당한 점수를 입력하세요. ");
		}

	}

}
