package days08;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 6;
		/*		
		if (x%2 == 0) { //짝수이자 = 2의 배수
			if (x%3 ==0) { //x가 2의 배수이자, 3의 배수인가?
			}
		} 		

		if(x % 2 == 0 && x % 3 == 0) {//위 중복if문과 동일
		}
		 */



		int score;
		char grade;

		System.out.println("점수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if( (score+"").matches("100|[1-9]?[0-9]") ) {
			System.out.printf("당신의 점수는 %d이며,	\n",score);
			if (score>=94) {
				grade='A';
				if(score>=98) System.out.printf("당신의 학점은 %c%s입니다.",grade,"+");
				else System.out.printf("당신의 학점은 %c%s입니다.",grade,"-");

			} else if(score>=84){
				grade='B';
				if(score>=88) System.out.printf("당신의 학점은 %c%s입니다.",grade,"+");
				else System.out.printf("당신의 학점은 %c%s입니다.",grade,"-");

			} else {
				grade='C';
				System.out.printf("당신의 학점은 %c%s입니다.",grade,"+");
			}
		} else {
			System.out.println("정당한 점수를 입력하세요: ");
		}

		//다시 실행하게 돌리는거 어떻게 하더라???

	}//main

}
