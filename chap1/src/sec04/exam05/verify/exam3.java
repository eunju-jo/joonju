package sec04.exam05.verify;

import java.util.Scanner;

public class exam3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String secnum = scanner.nextLine();
		
		System.out.print("3. 전화번호: ");
		String phnum = scanner.nextLine();
		
		System.out.println(); //아 줄띄라고~~
		
		System.out.println("[입력한 내용]");
		System.out.println("1. 이름: " + name);
		System.out.println("2. 주민번호 앞 6자리: " + secnum);
		System.out.println("3. 전화번호: " + phnum);
	}
}
