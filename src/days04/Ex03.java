package days04;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author 조은주
 * @date 2021. 3. 11 - 오전 11:46:54
 * @subject 4일-4번 : 키보드로 정수를 받아서 y변수에 저장
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//두 문자열 비교
		
		String s1 = "홍길동";
		String s2;
		
		//키보드로부터 문자열을 입력받아 s2라는 변수에 저장
		//s1과 s2 동일한지 비교해 boolean값찍기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("> 이름을 입력하세요 ");
		s2 = scanner.next();
		
		System.out.println(s1 == s2);		// 같아도 달라도 false
		//464p
		// == 연산자 : 주소를 비교하는 거라서
		
		System.out.println(s1.equals(s2));
		
		
		
		
		/*두 정수 비교
		
		//NumberFormatException : 숫자 형식인지 확인하는,,
		int x = 100;
		
//br 버전		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(">정수 입력? ");
		
		int y = Integer.parseInt(br.readLine());
		
		System.out.println(x == y);
		
		
// scanner 버전		
//		//키보드로 정수를 받아서 y변수에 저장
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(">정수 입력? ");
//		int y = scanner.nextInt();
//		
//		//x와 y값이 동일값인지 확인 (정수값 비교시 : ==)
//		System.out.println(x == y);
		*/
	}

}
