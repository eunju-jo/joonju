package days06_night;

import java.io.IOException;
import java.util.Scanner;

public class Ex05_02 {

	public static void main(String[] args) throws IOException {
		//아스키코드 한 라인 7개 찍고 3줄찍고 멈춰라
		//라인넘버도 찍어봐라
		
		int lineNumber = 1;
		
		for (int i = 0; i < 256; i++) {
			if(i%7 == 0) System.out.printf("%d: ", lineNumber++);

			System.out.printf("[%c]", (char)i);
			if (i%7 == 6) System.out.println();
			if (i%21 == 20) pause();
		}
		
		
		
	}

	private static void pause() throws IOException {
		System.out.printf("\n계속 출력하시려면 아무 키나 누르세요: ");
		System.in.read();
		System.in.skip(System.in.available());
	}

}
