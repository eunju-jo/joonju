package days03;

import java.util.Scanner;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오후 3:12:38
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {

		char one = 'A'; //10진수로65, 16진수로 41
		/* char = 유니코드 2바이트로 처리됨 
		 	'\u0000' ~ '\uFFFF'의 값의 범주
			char one = '\u0041'; */

		System.out.printf("%c", one);

		//		Java api doc -scanner class
		//		스캐너가 어떤 패키지인지 기억안날때 : scanner 치고 ctrl +스페이스 하면 위에 임포트문 뜨니까 그거 보고

		
		// scanner : system.in도 되지만 new file도 string도 가능
		//delimiter : 구분자(설정 안하면 기본=스페이스)
		
		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		//스캐너는 반드시 닫아야함.(밑에 s.close();가 관련문)
		
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		
		s.close();


		//전공자만 이해하세요..?
		
	}

}
