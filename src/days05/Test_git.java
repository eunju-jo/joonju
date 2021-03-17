package days05;

import java.util.Scanner;

public class Test_git {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("조은주를 좋아하세요? (예=1/아니요=2): ");
	
	int yesorno = scanner.nextInt();
	

	switch (yesorno) {
	case 1:
		System.out.println("삐빅- 당신은 정상입니다.");

		break;

	default:
		System.out.println("탈락");

		break;
	}
	
//	System.out.printf("이름 : %s \n", name);


	}//main
}
