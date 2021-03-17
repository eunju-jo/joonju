package days05;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		int i;
		int n;
		int m;
		
		System.out.print("두 정수값을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);

/*이렇게 굳이 한번에 받아서 쓰려면 bufferedreader 쓰는게 나음
//scanner 쓰는게 scanner.nextInt();로 바로 쓰려는 것
		
		String str = scanner.next(); //*.nextLine();으로 잘못씀
		String [] strarr = str.split("\\*s,\\*s"); 
		
		n = Integer.parseInt(strarr[0]);
		m = Integer.parseInt(strarr[1]);*/ 
		
		n = scanner.nextInt();
		m = scanner.nextInt(); //구
		
//Exception in thread "main" java.lang.NumberFormatException: For input string: "2,5"

		int max = Math.max(n,m);
		int min = Math.min(n,m);
		int sum = 0;
		
		for (i = min; i<=max; i++){
			 sum +=i; 
			 System.out.print(i +" + ");
			}
			System.out.println(" = " + sum);


	}//main
}
