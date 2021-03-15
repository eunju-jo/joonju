package days06;

import java.io.IOException;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/**
 * @author 조은주
 * @date Mar 15, 2021 - 10:28:45 AM
 * @subject 6일: 1번 주석처리만 지우고 실험용 
 * @content
 *
 */
public class Ex01_02 {

	public static void main(String[] args) throws IOException {

		

		int one;
		
		//A[엔터 13 + 10] 스트림 13?
		//13번 값을 없애줘야지 다시 읽어갈 것 - how?
		//13번: cr(캐리지리턴)	'\r' 제어 문자
		//10번:LF(Line Feed) '\n' 제어 문자 
		
		System.out.print("한 글자를 입력하세요. : ");
		one = System.in.read(); //
		System.out.printf("%d\n", one);
		
//		 abcd를 치면 abcd 엔터[13+10(제어문자)] 입력됨
//		System.in.read();에서 next byte(a)만을 읽어감
//		남은 bcd13/10(5바이트)는 다음에서 출력되버림
//		System.in.skip(System.in.available()); 
//		 ->입력 스트림에 남은 모든것을 비우겠다는 뜻
		
//		System.in.read(); //13 버리는용도 
//		System.in.read(); //10 버리는용도 
//		System.in.skip(2); //위에 두개랑 같음
		
		System.in.skip(System.in.available());
		//앞으로 많이 사용할 것. asdf 치면 a만 받고 나머지는 버려라
		
		System.out.print("한 글자를 입력하세요. : ");
		one = System.in.read(); //
		System.out.printf("%d\n", one);




	}
}