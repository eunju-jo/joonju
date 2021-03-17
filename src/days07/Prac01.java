package days07;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 17, 2021 - 1:52:34 AM
 * @subject 아침 시험 대비 문1 , 문 2
 * @content 메시지 한글자씩 출력시키고 반복할지 질문후 반복 
 * 아스키코드 라인값 넘버값 등 변수선언해서 나눠(물어보면서) 출력
 *
 */
public class Prac01 {

	public static void main(String[] args) throws IOException {

		//문제1. 메시지를 한글자씩 출력시키고 계속 반복할지 물어보고 y or Y면 반복출력
		
		
/*		String message;
		char ques ='x';
		boolean flag = true;
		
		do {
			System.out.println("메시지를 입력하세요: ");
			Scanner scanner = new Scanner(System.in);
			message = scanner.next();
			for (int i = 0; i < message.length(); i++) {
				System.out.println(message.charAt(i));
			}
		System.out.println("계속 하시겠습니까?(y,n)");
		ques = (char) System.in.read();
		System.in.skip(System.in.available());
		} while (flag=ques=='y' || ques=='Y');         */
		
		
		//문2.라인넘버, 한라인에 몇개, 변수선언 이거 Ex01_renewnewnew 관련
		//아스키코드 한라인에 7개씩 출력 따 변수선언해서.
		//3라인 출력 후 잠시 멈춤

		
		int lineNumber = 1;
		int sizePerLine = 7; //한 라인출력 할 아스키 개수
		int numberOfLines = 3; //한번에 출력할 라인 수

			for (int i = 0; i < 256; i++) {
			if(i%sizePerLine == 0) System.out.printf("%d: ",lineNumber++);
			System.out.printf("[%c]",(i==13 || i == 10)? ' ':(char)i);
			if(i%sizePerLine == sizePerLine -1) {
				System.out.println();
				if(lineNumber%numberOfLines==1) pause();
			}
		}
		
		
		System.out.println("\n\n= END =");



	}//main

public static void pause() throws IOException {
	System.out.print(">아무키나 누르세요..");
	System.in.read();
	System.in.skip(System.in.available());
}
		
		

	}//class