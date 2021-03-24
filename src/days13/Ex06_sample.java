package days13;

import java.util.Scanner;

public class Ex06_sample {

		public static void main(String[] args) {
			final int SIZE = 10; // 상수 정의
			int x = 0, y = 0;    // x, y 좌표

			char[][] board = new char[SIZE][SIZE]; // board 배열의 행/열 크기
			
			// 지뢰찾기
			byte[][] shipBoard = {
					// 1  2  3  4  5  6  7  8  9
					{0, 0, 0, 0, 0, 0, 1, 0, 0}, // 1
					{1, 1, 1, 1, 0, 0, 1, 0, 0}, // 2
					{0, 0, 0, 0, 0, 0, 1, 0, 0}, // 3
					{0, 0, 0, 0, 0, 0, 1, 0, 0}, // 4
					{0, 0, 0, 0, 0, 0, 0, 0, 0}, // 5
					{1, 1, 0, 1, 0, 0, 0, 0, 0}, // 6
					{0, 0, 0, 1, 0, 0, 0, 0, 0}, // 7
					{0, 0, 0, 1, 0, 0, 0, 0, 0}, // 8
					{0, 0, 0, 0, 0, 1, 1, 1, 0}  // 9
			};
			
			// '1' -> 1     '1'- 48   == '1' -'0'
			//  1 -> '1'      1 + 48  ==(char) 1 +'0'
			// board[][] : 1행에 행번호를, 1열에 열번호를 저장한다.
			for(int i=1;i<SIZE;i++)
				board[0][i] = board[i][0] = (char)( i+'0');
			
			Scanner scanner = new Scanner(System.in);

			while(true) {
				System.out.printf("좌표를 입력하세요. \"ex)22=(2.2)를 의미\" (종료는 0)>");
				String input = scanner.nextLine();

				if(input.length()==2) { // 두글자를 입력한 경우
					x = input.charAt(0) - '0';
					y = input.charAt(1) - '0';

					if(x==0 && y==0) break; // x와 y가 모두 0인 경우 종료
				}
				if(input.length()!=2||x<=0||x>=SIZE||y<=0||y>=SIZE) {
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					continue;
				}

				// shipBoard[x-1][y-1]의 값이 1이면, 'O'를 board[x][y]에 저장한다
				board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';

				// 배열 board의 내용을 화면에 출력한다
				for(int i=0;i<SIZE;i++) {
					System.out.println(board[i]);   // board[i]는 1차원 배열
				}
				System.out.println();
			}
		}

	}
