package sec04.exam05.verify;

import java.util.Scanner;  //java 내부 시스템 땡겨쓸거다

public class exam2 {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); //시스템의 입력장치로부터 읽는 scanner생성
	
	System.out.print("첫번째 수: ");
	String strnum1 = scanner.nextLine(); //엔터 키 이전까지 입력된 문자열을 읽음
	
	System.out.print("두번째 수: ");
	String strnum2 = scanner.nextLine();
	
	int num1 = Integer.parseInt(strnum1);
	int num2 = Integer.parseInt(strnum2);
	int result = num1 + num2;
	System.out.println("덧셈 결과: " + result);
	
 }
}
