package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		String inputData;
		String inputData2;
		String inputData3;
		
		String str = "[필수 정보 입력]";
		System.out.println(str);
		
			inputData = scanner.nextLine();
			System.out.println("1. 이름: " +inputData );
			System.out.println("2. 주민번호 앞 6자리: " +inputData );
			System.out.println("3. 전화번호: " +inputData );
			
		
	
	}
}
