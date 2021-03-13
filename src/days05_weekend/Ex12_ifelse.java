package days05_weekend;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 14, 2021 - 12:23:30 AM
 * @subject 5일 : if/else문도 kor/10해서 해보
 * @content
 *
 */
public class Ex12_ifelse {

	public static void main(String[] args) {

	System.out.print("국어 점수를 입력하세요: ");
	Scanner scanner = new Scanner(System.in);
	
	int kor = scanner.nextInt();
	char grade ='x';
	int g = kor/10;
	
	if (g>=0 && g<=10) {
		if (g==9 || g==10) {
			grade ='수';
		} else if(g==8 ){
			grade ='우';
		} else if(g==7 ){
			grade ='미';
		} else if(g==6 ){
			grade ='양';
		} else {
			grade ='가';
		}
		System.out.printf("%d%s = \'%c\'",kor,"점",grade);
		
	} else {
		System.out.println("입력값이 잘못되었습니다. 정당한 점수를 입력해주세요.");
	} 

	
	}
}