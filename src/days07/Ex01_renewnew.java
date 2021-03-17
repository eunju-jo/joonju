package days07;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 16, 2021 - 11:36:17 AM
 * @subject renew 보다 더 다음거~~ new 계속쌓는건 내가 임의로 만든 것
 * @content 한 문자 입력받아서 무슨 유형인지 출력하기(아침 7번 관련)
 *
 */
public class Ex01_renewnew {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("한 문자를 입력하세요: ");
		char one = scanner.next().charAt(0);
		
		//래퍼클래스 쓰는게 성능은 조금 떨어지지만 가독성 굿 
		if(isHangul(one)) System.out.println("한글");
		//한글도 밑에 저런건 없으니 함수를 만들어보자
		// 매개변수 char isHangul 사용
		// 넣은것이 한글인지 아닌지 보는 true/false 함수
		
		else if(Character.isLowerCase(one)) System.out.println("소문자");
		else if(Character.isUpperCase(one)) System.out.println("대문자");
		else if(Character.isDigit(one)) System.out.println("숫자");
//		else if(one == '!' || one == '@' ||one == '#' ||one == '$' )
		else if(isSpecial(one)) System.out.printf("%c는 특수문자입니다.",one);
		
/*		else if ((one+"").matches("[#$%@]"))
		{System.out.printf("%c는 특수문자입니다.",one);}
	// 모든 문자 + "" = 문자열이 됨 (기억하기) char인 one +"" => String.
		//정규표현식 쓰려면 String.matches()써야해서 String으로 바꿔서 사용해야함
		//정규표현식 사용: [#$%@] 요 중에 하나면 된다. [1-9] 1-9 사이면 된다처럼
		//				[aeiouAEIOU] 모음인지?
		
		//int -> 래퍼wrapper클래스 -> Integer
		//Integer.MAX_VALUE;
		//Integer.parseInt();                  */
	
	
	}

	private static boolean isSpecial(char one) {
	if( (one+"").matches("[#$%@]") ) return true;
	else return false; //특문은 아스키코드값이 여기저기 떨어져있어서 범위화하긴 힘듦
	}

	
	private static boolean isHangul(char one) {
		//체크하고자하는게 들어가고 참거짓으로 제시됨
		if('가'<=one && one<='힣') return true;
		else 			   		 return false;
	}

}
