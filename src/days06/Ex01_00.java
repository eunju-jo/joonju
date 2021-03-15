package days06;

import java.io.IOException;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/**
 * @author 조은주
 * @date Mar 15, 2021 - 10:28:45 AM
 * @subject 6일: 오늘도 제어문 
 * @content
 *
 */
public class Ex01_00 {

	public static void main(String[] args) throws IOException {

		// 7. 한 문자를 입력받아서 입력받은 문자가 숫자,소문자,대문자,한글 이라고 출력.
		//입력) 한 문자 입력 ?  A
		//출력) 대문자 

		//br쓰면 String으로 받음 : String -> 'a'char 로 변환
		//scanner.next()/nextLine()/nextInt()/nextByte()/next캐릭터???
		//스캐너로는 읽을 수 없음 -> 스캐너 써도 String -> char 변환 필요
		

		char one;
		
		System.out.print("한 글자를 입력하세요. :");

		one = (char) System.in.read(); //
		//입력받은 값을 int값으로 돌려주는 함수
		//int - > char 에 담아야함  (오류메시지 클릭하면 됨)(캐스트연산자)
		//ERR: Unhandled exception type IOException
		//->throws IOException 추가

		System.out.printf("%c\n", one);
		//입력 그대로 출력됨
		
		System.in.read();
		
		System.out.print("한 글자를 입력하세요. :");
		one = (char) System.in.read(); //
		System.out.printf("%c", one);




	}
}