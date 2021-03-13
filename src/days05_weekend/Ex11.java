package days05_weekend;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 14, 2021 - 12:09:07 AM
 * @subject 5일 : if-else 구문 사용
 * @content
 *
 */
public class Ex11 {
	public static void main(String[] args) {

		//국어 점수 입력받아 kor 변수에 저장
		//수 우 미 양 가 출력
		//수 - 90이상 100이하
		//우 - 80이상 90미만 
		//미 - 70이상 80미만 
		//양 - 60이상 70미만 
		//가 - 0이상 60미만 

		//정규표현식(Regular Expression) = regex => 유효성 검사

		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요: ");

		int kor = scanner.nextInt();


		if(0<=kor && kor<=100) {
			char grade ='X';
			if (kor<=100 && kor>=90) {
				grade = '수';
			} else if(kor>=80) {
				grade = '우';
			} else if(kor>=70) {
				grade = '미';
			} else if(kor>=60) {
				grade = '양';
			} else {
				grade = '가';
			} 
			System.out.printf("%d%s = \'%c\'",kor,"점",grade);
		}else {
			System.out.println("입력이 잘못되었습니다. 정당한 점수를 입력해주세요.");
		}



	}//main
}
