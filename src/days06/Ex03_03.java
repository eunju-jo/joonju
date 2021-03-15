package days06;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 15, 2021 - 3:21:16 PM
 * @subject 유효성 검사
 * @content
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		//000-000 00000 둘다 가능하지만 일단 000-000
		Scanner scanner = new Scanner(System.in);
		System.out.printf("> 우편 번호 입력: ");
		
		String zipCode = scanner.next();
		String regex ="\\d{3}-\\d{3}|\\d{5}"; // | or 연산자
//		String regex ="[0-9]{3}-[0-9]{3}"; 위와 같은 코딩
		//0~9 중에 아무거나 와도 좋다는 뜻 \d
		// 역슬래쉬 두개 줘야 하나 의미해서 두개 쳐줘야 함 
		//{숫자 개수}
		
		//zipCode 문자열이 정규표현식과 일치한다면
		if (zipCode.matches(regex)) {
			System.out.println(zipCode);
		} else {
			System.out.println("올바르지 않은 우편번호입니다.");
		}
		
		
		
	}//main

}
