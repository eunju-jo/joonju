package days07;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 16, 2021 - 11:22:41 AM
 * @subject Ex01 그대로 쳐보다가 안된거. 더 해보기	
 * @content
 *
 */
public class Ex01_renew {

	public static void main(String[] args) {

		
		int []kors = new int[5];
		
		//입력함수
		inputScore(kors);
		
		//출력함수
		outputScore(kors);
		
		getScore("국어");
		
		
		System.out.println("= END =");
		
		
	}//main

	private static void getScore(String subjectName) {
		Scanner scanner = new Scanner(System.in);
		String data = scanner.next();
		String regex = "100 | [1-9]?[0-9]";
		boolean flag = false;
		
		do {
			if(flag) System.out.println("");
			System.out.printf("> %s 점수를 입력하세요.", subjectName);
			data = scanner.next();
			data.matches(regex );
		} while (flag = !data.matches(regex));
		
	}

	private static void outputScore(int [] kors) {
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("kors[%d]=%d\n",i,kors[i]);
		}
	}

	
	
	private static void inputScore(int [] kors) {

	for (int i = 0; i < kors.length; i++) {
		kors[i] = 0;
	}
	
	}//input
	
	
	

}//class
