package days06_night;

import java.io.IOException;


/**
 * @author 조은주
 * @date Mar 15, 2021 - 8:13:30 PM
 * @subject char 한글자 입력받아서 그대로 출력하기(형태 그대로)	
 * @content
 *
 */
public class Ex01_00 {
	public static void main(String[] args) throws IOException {

		char one;

		System.out.print("한 글자를 입력하세요. : ");
		one = (char)System.in.read();
		//read() 후 엔터를 치면 엔터=LF,CR 두 값이 추가로 더 저장되는 것
		
		
		System.out.printf("%c\n\n", one);
		
//		System.in.read();
//		System.in.read();
  		  //one에서 read하면서 같이 담겨진 LF, CR을 읽어내 줌
//		System.in.skip(2); //system.in.read 두개랑 같은 뜻
		System.in.skip(System.in.available());
		
		System.out.print("한 글자를 입력하세요. : ");

		one = (char)System.in.read();
		System.out.printf("%c\n", one);
		
		

	
	}//main
}
