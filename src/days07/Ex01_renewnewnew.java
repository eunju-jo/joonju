package days07;

import java.io.IOException;

public class Ex01_renewnewnew {

	public static void main(String[] args) throws IOException {

/*  while(con=='y' || con =='Y')
	앞에 나왔던 위에거를 아래처럼 코딩도 가능
	while(Character.toUpperCase(con)=='Y') */

		/* String 형변환 */
		//String n ="123"; 

		//String ->int,double 등등 하고싶음
		//Integer.parseInt(n);
		//Double.parseDouble(n);
		//모든 타입 +"" 	
		//거꾸로 int, double, boolean, char -> String 하고싶음
		// int 100 +""      = "100" 
		//double 3.14 +""   = "3.14"
		//boolean true +""  = "true"
		//char 'A' +""      = "A"
		//모든 타입 +""       => "문자열로 바뀜"

		//*.matches()는 String에 속한 함수라 앞을 문자열로 만들어야 사용가능
		//아래처럼 때리면 됨
		//	('x'+"").matches(regex); */




		// 아스키 0~255 출력하기

	/*	int lineNumber = 0;

		for (int i = 0; i < 256; i++) {			//(char)i라고 안해도 됨 알아서 변환
			if(i%10==0)System.out.printf("%d: ", ++lineNumber);
			System.out.printf("[%c]",(i==13||i==10)?' ':i);
			if(i%10 ==9) {
				System.out.println();
				//개행한데가 5,10,15,20번째 라인이냐? 그럼 pause();호출
				if(lineNumber%5==0) pause();
				//이렇게하면 4번째 줄에서 개행처리됨 
			}
			
		} 이렇게도 가능 밑에도 가능*/

		
/*		int lineNumber = 1;
		
		for (int i = 0; i < 256; i++) {			//(char)i라고 안해도 됨 알아서 변환
			if(i%10==0)System.out.printf("%d: ", lineNumber);
			System.out.printf("[%c]",(i==13||i==10)?' ':i);
			if(i%10 ==9) {
				System.out.println();
				//개행한데가 5,10,15,20번째 라인이냐? 그럼 pause();호출
				if(lineNumber%5==0) pause();
				//이렇게하면 4번째 줄에서 개행처리됨 
				lineNumber++;
			}
			
		} 이것도 가능*/

		
		//유지보수? (변수 선언해서 개수 지정해놓는게 나중에 고치기 더 편함)
		//한라인에 7개씩 출력
		//3라인 출력 후 잠시 멈춤
		//쇼핑몰 게시판 출력수,,(50개씩 보기) 이런식
		
		int lineNumber = 1;
		int sizePerLine = 10; //한 라인출력 할 아스키 개수
		int numberOfLines = 5; //한번에 출력할 라인 수
		
//		for (int i = 0; i < 256; i++) {			//(char)i라고 안해도 됨 알아서 변환
//			if(i%sizePerLine == 0)System.out.printf("%d: ", lineNumber++);
//			System.out.printf("[%c]",(i==13||i==10)?' ':i);
//			if(i%sizePerLine ==sizePerLine -1) {
//				System.out.println();
//				//개행한데가 5,10,15,20번째 라인이냐? 그럼 pause();호출
//				if(lineNumber%numberOfLines==1) pause();
//			}
//		} 
//		
	//똑같이 걍 쳐본 것
		for (int i = 0; i < args.length; i++) {
			if(i%sizePerLine == 0) System.out.printf("%d: ",lineNumber++);
			System.out.printf("[%c]",i);
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
