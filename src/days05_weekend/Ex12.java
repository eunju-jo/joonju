package days05_weekend;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 14, 2021 - 12:17:22 AM
 * @subject
 * @content
 *
 */
public class Ex12 {
	public static void main(String[] args) {

	// 국어점수를 입력받아서 kor 변수에 저장
	// 입력받은 국어점수의 등급을 "수우미양가" 중에 하나 출력...
	// ( switch 문 사용 ) 
		
		System.out.print("국어 점수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		
		int kor = scanner.nextInt();
		char grade = 'x';
		
		switch (kor/10) {
		case 9: case 10:
			grade ='수';
			break;
		case 8:
			grade ='우';
			break;
		case 7:
			grade ='미';
			break;
		case 6:
			grade ='양';
			break;
		default:
			grade ='가';
			break;
		}
		System.out.printf("%d%s = \'%c\'", kor,"점",grade);
		
		
		
		
		
		
	}//main
}