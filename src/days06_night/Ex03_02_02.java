package days06_night;

import java.util.Scanner;


/**
 * @author 조은주
 * @date Mar 15, 2021 - 11:07:51 PM
 * @subject 요거 여러번 연습 필요
 * @content
 *
 */
public class Ex03_02_02 {

	public static void main(String[] args) {
		//days04.Ex01.java 메인함수 긁어온 것 
		//국어,영어,수학 점수 다른 함수로부터 받아서 총점, 평균까지 출력

		int kor, eng, mat, tot;
		double avg;

		//요기가 중요
		kor = getScore("국어");
		eng = getScore("영어");
		mat = getScore("수학");
		tot = kor + eng + mat;
		avg = (double) tot /3;

		System.out.println(">국어: " +kor ) ; 
		System.out.println(">영어: " +eng ); 
		System.out.println(">수학: " +mat ); 
		System.out.println(">총계: " +tot ); 
		System.out.println(">평균: " +avg ); 
		
		
	}

	private static int getScore(String subject) {
		
		//0-100점 사이인지 검증하고, 아니면 "입력오류. 다시 입력하세요 :" 띄우기
		Scanner scanner = new Scanner(System.in);
		String data;
		boolean flag = false;
		String regex = "100|[1-9]?[0-9]";
		
		do {
			if(flag) { System.out.print("> 입력 오류로 다시 입력: "); }
			System.out.printf("%s 점수를 입력하세요: ", subject);
			data = scanner.next();
			data.matches(regex);
		} while (flag=!data.matches(regex));
		
		
		return Integer.parseInt(data);
	}

}//class
