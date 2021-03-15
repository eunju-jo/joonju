package days06_night;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 15, 2021 - 11:08:56 PM
 * @subject 우편번호 유효성 검사
 * @content
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		// 000-000 or 00000 형식
		Scanner scanner = new Scanner(System.in);
		System.out.println(">우편번호 입력: ");
		
		String postN = scanner.next();
		String regex="\\d{3}-\\d{3}|\\d{5}";
		postN.matches(regex);

		if(!postN.matches(regex)) {
			System.out.println("[입력오류]정당한 번호를 입력하세요 ");
		} else {
		System.out.println(postN);
		}




	}
}