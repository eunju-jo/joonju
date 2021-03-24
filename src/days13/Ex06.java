package days13;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		final int SIZE = 10; //상수로 정의하면 유지보수 쉬워서
		int x= 0 , y=0;
		
		char[][] board = new char[SIZE][SIZE];
		//지뢰찾기 게임처럼,, 1들어간데는 O를 0들어간데는 X를 하려고
		byte[][] shipBoard = {
//				 1  2  3  4  5  6  7  8  9
				{0, 0, 0, 0, 0, 0, 1, 0, 0 },//1
				{1, 1, 1, 1, 0, 0, 1, 0, 0 },//2
				{0, 0, 0, 0, 0, 0, 1, 0, 0 },//3
				{0, 0, 0, 0, 0, 0, 1, 0, 0 },//4	
				{0, 0, 0, 0, 0, 0, 0, 0, 0 },//5
				{1, 1, 0, 1, 0, 0, 0, 0, 0 },//6	
				{0, 0, 0, 1, 0, 0, 0, 0, 0 },//7
				{0, 0, 0, 1, 0, 0, 0, 0, 0 },//8	
				{0, 0, 0, 0, 0, 1, 1, 1, 0 },//9	
		};
		
		//가로 세로 1-9 입력하려고
		for (int i = 1; i < SIZE; i++) 
			board[0][i] = board[i][0] = (char)(i +'0'); // char 값을 앞에도 중간에도 대입하겠다 (+'0'(48)	 = 숫자를 문자로 만들겠다)
		//'1' ->1  ___ '1'- 48 or '1' - '0'
		// 1  ->'1' ____ 1 + 48 or 1 + '0' 
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.printf("좌표를 입력하세요 \"ex)22=(2.2)를 의미\" (종료는 00)");
			String input = scanner.nextLine();
			
			if (input.length() ==2) {
				x = input.charAt(0) - '0'; //숫자로 바꾸겠다
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0)break; //while문 나가서 ㅍ로그램 그만 	
			}
			
			//유효성 검사
			if (input.length() !=2 || x<=0 || x>=SIZE || y<= 0 || y>=SIZE) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			
			//1이면 o출력 아니면 x출력
			board[x][y] = shipBoard[x-1][y-1] ==1? 'O' : 'X';
			
			for (int i = 0; i < SIZE; i++) {
				System.out.println(board[i]);
			}
						
			System.out.println();
		}
		
	
	}
}
