package days07;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 16, 2021 - 10:02:25 AM
 * @subject 7일 : 아침 문풀 
 * @content 계속 반복하되 계속하겠니? 물어보고 반복
 *
 */
public class Ex01 {
	public static void main(String[] args) throws IOException {

//아침 문제 2번
				String message;
		char con = 'y'; //안줘도 됨(초기값)

		do {
			System.out.print(">message 입력?: ");
			Scanner scanner = new Scanner(System.in);
			message = scanner.next();
			for (int i = 0; i < message.length(); i++) {
				System.out.println(message.charAt(i));
			}
			System.out.println("계속 하시겠습니까?(y,n) : ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());

		} while (con=='y' || con=='Y');

		

//아침문제 3번
		int []kors = new int[5];

		//배열 kors 입력 (입력해두는 함수 만들기)
		inputKors(kors); 
		//배열크기 : 5 (0번째 요소 ~ 4번째 요소)
		//0번째 방 : LowerBound 아랫첨자값
		//마지막 방 : UpperBound 윗첨자값 (배열크기 - 1 = 윗첨자값)


		//배열 kors 출력
		dispKors(kors);
		//참조타입은 초기화 하지 않아도 각 자료형의 기본값으로 초기화되어져 있음.
		//int 배열이기 때문에 int의 기본값인 0으로 초기화되어져 있는 것.
		/*		for (int i = 0; i < kors.length; i++) { //자동으로 배열명.length 찍힘
		System.out.printf("kors[%d]=%d\n",i,kors[i]);
		}
		 */

		//함수를 선언
		//1. 기능: int[]배열 출력 기능명에 맞게:dispKors
		//2. 매개변수: int[] 배열
		//3. 리턴값: x ->void


		System.out.println("= END ="); 

		/*		kors[0]=90;
		kors[1]=90;
		kors[2]=90;

		//반복문 미사용시
		System.out.println( kors[0]);
		System.out.println( kors[1]);
		System.out.println( kors[2]);
		 */




	}//class

	private static void inputKors(int[] kors) {
		for (int i = 0; i < kors.length; i++) { 
			kors[i] = getScore("국어");
		}				
	}

	
	
	//				함수의 매개변수로 '배열'도 가능
	private static void dispKors(int[] kors) {
		for (int i = 0; i < kors.length; i++) { 
			System.out.printf("kors[%d]=%d\n",i,kors[i]);
		}		
	}

	
	private static int getScore(String subjectName) {
		String regex = "100|[1-9]?[0-9]"; //0~100
		Scanner scanner = new Scanner(System.in);
		String data;
		boolean flag = false;
		
		do {
			if(flag) System.out.print("> 입력 오류로 다시 입력. ");
			System.out.printf("> %s 점수를 입력하세요: ",subjectName);
			data = scanner.next();
			data.matches(regex); 
		} while(flag = !data.matches(regex)); //요렇게 많이 쓸거임
		return Integer.parseInt(data);
			
	}

}//class
