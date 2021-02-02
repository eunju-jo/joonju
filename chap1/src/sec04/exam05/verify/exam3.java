package sec04.exam05.verify;

import java.util.Scanner;

public class exam3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[필수 정보 입력]" + "\n" + "1. 이름: ");
		String strnum1 = scanner.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String strnum2 = scanner.nextLine();
		
		System.out.print("3. 전화번호: ");
		String strnum3 = scanner.nextLine();

	}
}
