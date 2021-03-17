package days07;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		char one;
		Scanner scanner = new Scanner(System.in);
		
		//입력받은 알파벳을 대문자로 변환
		System.out.printf("> 알파벳 입력하세요? ");
		one = scanner.next().charAt(0);
		
		//if문 사용해서 소문자라면 대문자로 변환해서 다시 one이라는 변수에 저장
		//소문자만 if문 걸리고 나머지는 char 그대로 출력됨
		if(isLowerCase(one)) {
			//one = Character.toUpperCase(one); //대문자로 바꾸는 함수
			//소문자->대문자 함수 구현해보자
			one = toUpperCase(one);
		}
		System.out.println(one);
	}

	private static boolean isLowerCase(char one) {
		// TODO Auto-generated method stub 멍때림.. 티스토리에 있음
		return false;
	}

	private static char toUpperCase(char one) {

		if ('a'<=one && one<='z') {
			//대문자로 어케 바꿀까? A=65, a=97 
			// " 소문자 - 32 = 대문자 "
			one = (char)(one - 32);
		}
		return one;
	}

	
	private static char toLowerCase(char one) {
		
		if ('A'<=one && one<='Z') {
			// " 소문자 - 32 = 대문자 "
			one = (char)(one + 32);
		}
		return one;
	}

}
