package days06_night;

import java.io.IOException;

/**
 * @author 조은주
 * @date Mar 15, 2021 - 9:31:29 PM
 * @subject system.in.read()로 두번 한 글자씩 받되, 입력은 몇자씩 되든 첫 글자만
 * @content
 *
 */
public class Ex01_000 {

	public static void main(String[] args) throws IOException {

		
		System.out.print("한 글자를 입력하세요: ");
		char one = (char) System.in.read();
		
		System.in.skip(System.in.available());
		
		System.out.printf("%c\n", one);

		
		System.out.print("한 글자를 입력하세요: ");
		one = (char) System.in.read();
		
		System.in.skip(System.in.available());
		
		System.out.printf("%c\n", one);
		
		
	}

}
