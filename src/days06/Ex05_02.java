package days06;

import java.io.IOException;

public class Ex05_02 {

	public static void main(String[] args) throws IOException {

		//한 라인 7개 찍고 3줄찍고 멈춰라
		//유지보수에 좋을거 어떤지? 고민해보기 내일풀이,,
		
		int lineNumber = 1; //라인넘버 1부터 시작

		for (int i = 0; i < 256; i++) {
			if(i%10 == 0)System.out.printf("%d : ", lineNumber++);
			System.out.printf("[%c]", (char)i);
			if(i%10 == 9) System.out.println(); 
//			if(i%50 ==49)pause(); //이렇게 안하고 아래로 해도 됨
			if(lineNumber % 5 == 1) pause();
			//이거해도 5번째 첫문자만 뜨는디,..>??? 뭘까 
			
			//후행이라서 그 행 첫번째거에서 넘버1찍고, 그 행 두번째부턴 넘버가 2됨
			//밑에 안되는건 4번째행 첫번째에서 넘버4찍고, 4번째-2번째부터 넘버5가 되서
			
		
			

			
			
		}

	}



	private static void pause() throws IOException {
		System.out.println("> 아무키나 누르세요...");
		System.in.read(); 
		System.in.skip(System.in.available()); 

	}




}