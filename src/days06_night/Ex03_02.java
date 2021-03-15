package days06_night;

import java.util.Scanner;

public class Ex03_02 {

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
		
		System.out.printf("%s 점수를 입력하세요: ", subject);
		Scanner scanner = new Scanner(System.in);
		String score = scanner.next();
		
		return Integer.parseInt(score);
	}

}
