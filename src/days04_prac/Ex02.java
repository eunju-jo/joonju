package days04_prac;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//s1 "홍길동"이랑 입력된 "조은주"랑 입력 내용이 같은지 비교
		
		String s1 = "홍길동";
		
		System.out.print("이름을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		
		String s2 = scanner.next();
		
		System.out.println(s1.equals(s2));
		
		
		//값 증가시키는 4가지 예(증감연산자)
//		x= x+1;
//		x +=1;
//		x++;
//		++x;
		
		
		
	}
}
