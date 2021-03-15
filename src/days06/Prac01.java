package days06;

import java.io.IOException;

/**
 * @author 조은주
 * @date Mar 15, 2021 - 12:41:12 PM
 * @subject 6일: 입력받은 char 한자리 그대로 출력
 * @content
 *
 */
public class Prac01 {

	public static void main(String[] args) throws IOException {

		char one;
		System.out.print("한 글자 입력: ");
		
		
		one = (char) System.in.read();
		
		System.out.printf("%c\n" ,one);
		
		
		
	}

}
