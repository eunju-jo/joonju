package days06;

import java.io.IOException;

public class Ex05_00 {

	public static void main(String[] args) throws IOException {
		
		for (int i = 0; i < 256; i++) {
//			while (다섯번째 반복) {
//				System.out.println("계속할까요? ");break;				
//			}
			
			System.out.printf("[%c]", (char)i);
			if(i%10 ==9) System.out.println(); 
			if(i%50 ==49)pause(); //멈춰라는 함수 따로 만들기(깔 끔)
			
			//10개 마다, 50개 마다 헷갈리면 좌표 손으로 찍어보기 	
		}
		
		//5라인 하고 계속합니다. 뜨고 엔터치면 5라인 다시 뜨게
		//라인넘버를 붙여서 개행때		
		//lineNumber1
		
		//49까지 출력하고 멈춤. 99출력하고 멈춤. 149, 199
		
		
		
//		if(i%10 ==9) System.out.println();
//		출력한 후에 i가 9,19,29,39,.일 때 개행 -> i%10 == 9
		//10번째는 LF라서, 13번째는 \r라서 개행된 것 

		//한 라인에 열개씩 출력하도록 코딩 (개행) \n LF 10번값 or println
		//마지막 라인에 6개 남으면 된거임
		
		
/*		아스키 코드 7비트(128)-> 나중에 256가지로 확장
//		아스키코드 출력해보기

		for (int i = 0; i < 256; i++) {
			System.out.printf("[%d]%c\n",i, (char)i);
		}*/
		//[32]까지는 \n 등 제어문자가 들어가 있어서 안보임
		//뒤에 우리가 쓰는거 127가지. [128]부터 또 깨져서 안나오고,,
		
		
/*		Ex02.drawLine(30); //다른 데 것도 끌어다 쓸 수 있음 	
		//65 ~ 90 대문자 영문
		for (int i = 'A'; i <='Z'; i++) {
			System.out.printf("%c[%d]\n",i,i);
		}

		Ex02.drawLine(30);
		//97 ~ 122 소문자 영문
		for (int i = 'a'; i <='z'; i++) {
			System.out.printf("%c[%d]\n",i,i);
		}
		
		Ex02.drawLine(30);
		//48 ~ 57 요거는 기억 'n'
		for (int i = '0'; i <='9'; i++) {
			System.out.printf("\'%c\'[%d]\n",i,i);
		}

		Ex02.drawLine(30);
		//44032 ~ 55203 한글
		for (int i = '가'; i <='힣'; i++) {
			System.out.printf("\'%c\'[%d]\n",i,i);
		}
*/
		
		
		
		
		
		
		
	}//main	
	

	private static void pause() throws IOException {
		System.out.println("아무키나 누르세요...");
		System.in.read(); //13,10번(=엔터)	해도 아무키나 누른 것
		System.in.skip(System.in.available()); //나중에 이런걸로 애먹음
		//한번하고 안되니까,,
	}

}
