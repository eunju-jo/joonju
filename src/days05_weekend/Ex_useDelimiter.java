package days05_weekend;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex_useDelimiter {

	public static void main(String[] args) {

		
//		String pattern = "\\s*,\\s*";

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요(구분: , ) :");
		
		scanner = new Scanner(scanner.next()).useDelimiter("\\s*,\\s* | \\s");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.printf("%d, %d", a, b);

		
		
		
/*		String str = "3.14.15.92"; 
		Scanner sc = new Scanner(str).useDelimiter("\\."); 
		while(sc.hasNext()) { 
			System.out.println(sc.nextInt()); 
		} 
		sc.close();
*/
	}

}
