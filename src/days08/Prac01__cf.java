package days08;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 17, 2021 - 11:42:08 PM
 * @subject 주요문제 연습 : 마름모찍기, 입력받은 소수점 둘째자리에서 반올림해서 출력하기(메서드 활용),
 * 						컴퓨터(랜덤)과 가위바위보 결과 출력, 이등변삼각형(별찍기) 입력된 행대로 별찍기
 * @content
 *
 */
public class Prac01__cf {

	public static void main(String[] args) {
		//내일1. 마름모찍기
		/*

__*
_*** 		
*****
_***
__*

	1.3 2.2 3.1
	3.1 4.2 5.3
	1.3 2.4 3.5      2.3 3.4
	3.5 4.4 5.3     
	i+2 >= j

		 */ 

		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if(i+j>=4 && i-2 <= j && i+2>=j && i+j<=8) System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
		}

		System.out.println();

		//내일2. Ex05 소수점 n째자리에서 반올림하는거 입력받기


		
		System.out.println("실수를 입력하세요(소수점 셋째자리 이하까지): ");
		Scanner scanner = new Scanner(System.in);
		double pi = scanner.nextDouble();
		
		roundUp(pi);
		
		System.out.println();
		
		
		//내일3. 가위바위보 ex05_02 (com이랑 user 배틀)
		
		System.out.print("가위바위보를 입력하세요 [ 가위(1), 바위(2), 보(3) ] : ");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt(); 
		int com = (int) (Math.random()*3 +1);
		
		//win: 나-컴 1-3 2-1 3-2     -2 1 1      case -2: case 1:
		//lose: 나-컴 1-2 2-3 3-1    -1 -1 2     case -1: case 2:
		//비김: 나-컴 1-1 2-2 3-3       0         case 0:
		//비기는 경우 둘다 동일하게(차감한 값이 0이게) 딱 떨어지니까 user-com 기준으로 잡는것이 깔끔

		String result;
		switch (user-com) {
		case -2: case 1:
			result = "당신이 이겼습니다.";
			break;
		case -1: case 2:
			result = "당신이 졌습니다.";
			break;

		default:
			result = "비겼습니다.";
			break;
		}
		
		String [] game = {"정당한 값이 아님*","가위","바위","보"}; //0 1 2 
		System.out.printf("\nuser[%s] - com[%s](으)로, %s\n\n", game[user], game[com], result);        
		
		
		//내일4. 이등변삼각형 행 개수 입력하면 그거에 맞춰서 크기 더크게 더작게 나오게
		
		System.out.print("이등변 삼각형의 행의 수를 입력하세요. : ");
		Scanner scRow = new Scanner(System.in);
		int row = scRow.nextInt(); 
		
/*

__* 
_***
*****                   i+2 <= j
			1.3 2.2 3.1
 	2.3		1.3 2.4 3.5 i+2>=j
 */

		//처음에 end 값 하나로 세워서 활용해서 했더니 *찍는게 변동이 잘 안되었음
		//*은 1 3 5 7 9로 홀수값으로 쭉 나가니 end2에는 1(초기값) +=2;조건말고는 필요없음
		//_의 end 값은 3일 때 2, 5일 때 4/ row값보다 1작음 -> row-1 그렇게 1씩 작아지니 end--;
		int end = row-1;
		int end2 = 1;
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=end; j++) {
				System.out.print("_");
			}
			for (int j = 1; j <=end2; j++) {
				 System.out.print("*");
			}
			end--;
			end2+=2;
			System.out.println();
		}
		
		
		
		
	//처음엔 포문 	이렇게 세웠으나 이거로는 row 넣어서 세우기 더 헷갈렸음 그래서 아예 end 값으로 다시 설정	
/*		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=5; j++) {
				if(i+j>=4 && i+2>=j) System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
		}
이 구문으로 늘리는거 못함,,		*/
		
		
		
	}//main

	
	
	private static void roundUp(double one) {
		System.out.println(Math.round(one*100) *0.01);
		//Math.round는 long을 출력함. 둘째짜리까지 한다고 가정하면 3.141592 x 100 = 314.1592에서 반올림 후
		//다시 x 0.01해서 제 자리로 돌려줌. 3.14 (0.01을 곱하면 double이라 자동 실수로 출력 가능)
		//0.01곱하는게 아니라면 /100하고 앞에 (double)로 실수처리도 가능함. *0.01이 더 심플하니 이쪽으로 하는 걸로 
		
	}

}//class
