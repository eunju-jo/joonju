package days06_night;

import java.io.IOException;

/**
 * @author 조은주
 * @date Mar 15, 2021 - 11:40:13 PM
 * @subject 아스키코드(256자) 출력해보기
 * @content
 *
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {

		//256자를 프린트하되, 10개마다 한 행을 나누고,
		//5줄이 쌓일 때마다 더 실행하시겠습니까? 묻고 엔터쳐야 이후 진행	
		int lineNumber = 1;
		
		for (int i = 0; i < 256; i++) {
			if(i%10 == 0) System.out.printf("%d: ", lineNumber++);
			System.out.printf("[%c]", (char)i);
			if (i%10 == 9) System.out.println(); 
			if (i%50 == 49) pause();
//			if (lineNumber%5 == 1) pause();
			
			
			}
		
	}//main

	private static void pause() throws IOException {
		System.out.println(">더 실행하려면 아무 키나 누르세요. ");
		//문자치고 엔터쳐도 되고 엔터(13번,10번)만 쳐도 무방
		System.in.read();
		System.in.skip(System.in.available());
	}

}//class
