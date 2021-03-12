package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author 조은주
 * @date 2021. 3. 10 - 오전 11:19:50
 * @subject 3일-2번 : br(BufferedRead) - >Scanner 클래스로 변환
 * @content Scanner 관련 정석책 p40
 * 
 */
public class Ex02_03 {

	public static void main(String[] args) throws IOException {

		//Console은 이클립스에서 사용 불가하므로, Scanner 클래스 사용
		
		//[문제]
		//입력: 이름, 국어, 영어, 수학성적
		//출력: 총점, 평균
		
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
			
//		scann -> 대소문자 구분없이 쓰고, ctrl +space. 뒤에도 한칸띄고 뭐 치지말고 ctrl+space로 타이핑하면 됨 다
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("> 이름 국어 영어 수학을 입력하세요 ?");
		
		name = scanner.next();
		kor = scanner.nextByte();
		eng = scanner.nextByte();
		mat = scanner.nextByte();

		

		//입력할 때 콤마 구분자X 
		//scanner 기본 구분자 = space (공백)

		//입력부(이름 국어 영어 수학 - 한번에 입력받고 엔터로가 좋음 )

		
		tot =  (short) (kor + eng + mat);
		avg = (double) tot / 3;  
		
		System.out.printf("> 이름: %s,  국어: %d, 영어: %d, 수학:%d \n, 총점:%d \n, 평균:%.2f \n", name, kor, eng, mat, tot, avg);

		
	}//main

}//class
