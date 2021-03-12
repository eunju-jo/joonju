package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 조은주
 * @date 2021. 3. 9 - 오후 5:14:24
 * @subject 2일-14번f( 마지막 문제에 f)
 * @content BufferedReader
 *
 */
public class Ex14 {

	public static void main(String[] args) throws IOException {

		
		//	키보드로(표준입력장치)부터 이름을 입력받아서
		//	입력받은 이름 출력
		

		System.out.print("> 이름을 입력하세요? ");
		
		
		//System.out
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* new  Inputstr 까지 치고 ctrl +s 해서 해당것에서 엔터
		 * 그 윗중에 new BufferedR도 똑같이
		쳐야지 위에 import도 두줄 다 자동 입력됨 */
				// 그러고 조합해야 위에 구문. Buffered~ 외우기
		
		
		//Unhandled exception type IOException
		// br.readLine() 함수 사용하려면 IOException 예외를 처리해야 하는데..너 안했다..
		// 2주 정도 후 예외가 뭔지, 예외 처리법 뭔지 파악후
		// br.readLine() 등등 이해할 것이니 당분간 암기
		
		//예외를 처리하는 두가지 방법 중 throws IOException 사용(오류 옆에 마우스올려서 첫번째꺼 클릭)
		String name = br.readLine();
		//br.readLine()쓰려면 throws IOException 써야됨 (암기)
		System.out.printf("> 이름 : %s \n",name);
		
		//콘솔에 빨간불 : 진행중이라는뜻(블로킹) 


	}//main

}//class
