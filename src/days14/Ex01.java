package days14;

import java.util.Random;

import apple.laf.JRSUIConstants.Size;

/**
 * @author 조은주
 * @date Mar 25, 2021 - 10:30:53 AM
 * @subject 쉽게만 살아가면 재미없어 빙고
 * @content
 *
 */

public class Ex01 {
	public static void main(String[] args) {

		final int SIZE = 5;

		int [][] m = new int[SIZE][SIZE];

		//		fillM01(m);
		//		fillShuffle02(m);
		//		fillM02_01(m);
		//		fillM02_02(m);
		//		fillM03(m);

		//마방진magic square - 짝수 마방진, 홀수 마방진(5*5)	
		//  예를 들어 3×3 마방진은 1부터 9까지의 숫자를 중복하지 않고 
		//모두 사용하되 가로, 세로, 대각선의 합이 15가 되도록 
		//정사각형 안에 배열해 놓은 것
		magicSquare(m);
		dispM(m);



	}//mai

	private static void magicSquare(int[][] m) {

		// 규칙
		//1 2 3 4 ~ 25 중복없이 찍을건데
		//1. 먼저 0행의 가운데 열에 '1'이 들어감(0행 2열)	
		//2. 출력된 값이 5의 배수라면(i%5==0) 행만 증가시킴
		//3. 아니라면 "열증가 && 행감소"
		//--. 위의 값이 
		//--. 행의 범위 벗어남: 같은 열의 가장 큰 행(4행)으로 감	
		//--. 열의 범위를 벗어남 : 같은 행의 가장 작은 열(0열)로 감   
		//가로,세로, 대각선 모두 합은 65	

		//25번 돌면되니 포문 와일문 다 상관없음
		
		int n = 1;
		int row = 0, col = m.length/2; //col:가운데찾겠따(2줘도 노상관)	
		while (n<=25) {
			
			m[row][col] = n; //n++ 증가 여기에하면 꼬임 (n++ 1증가된 값에 5넣으면..)	
			dispM(m); 
			if (n % 5 == 0) {
				row++;
			} else {
				col++; row--;
				if(col==5) col = 0;// 4보다 크냐/5냐 해도 됨 랭쓰는 5니까
				else if(row==-1) row = 4; //가장 큰 row값으로	
			}
			n++;
		}//while
			
		
		
		
		
/*		int k = 1;
		
		for (int i = 0; i < m.length; i++) {//행
			for (int j = 0; j < m[i].length; j++) {//열
				if(i==0 && j==2) {
					m[i][j] = k++;
					if(m[i][j] % 5 == 0) {
						i++;
					} else {
						if(i-1 < 0) {
							m[i][j] = m[4][2];
						}
//							m[i][j] = m[i-1][j+1]; //-1. 3
					}

				}

			}
		}//for행
뀨? 안됨
*/ 		

	}

	private static void fillM03(int[][] m) {

		//1 2 3 4 5
		//10 9 8 7 6
		//11 12 13 14 15
		//20 19 18 17 16
		//21 22 23 24 25

		//방 값 건드려서 저장
		for (int i= 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(i % 2 == 0) m[i][j]=5*i+j+1;
				else m[i][4-j] = 5*i+j+1; //뒤부터

				//				아래처럼 한 줄 축약해도 됨
				//				m[i][(i%2 == 0)? j: 4-j]= 5*i+j+1;
			}
		}


		//값을 변화시켜서 (짝,홀) 저장		
		/*		for (int i= 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				 m[i][j]= (i % 2 == 0) ? 5*i+j+1 : 5*(i+1)-j;
//				if(i % 2 == 0) m[i][j]=5*i+j+1;
//				else m[i][j]=5*(i+1)-j;
					//2,4 라인 10,20 되게 세팅하고 1씩 빼기 작업(j가 보니 1씩 됨)
			}
		}
		 */

		//내가 풀다 만거 숫자가 안늘음
		/*		boolean sw = false;
		int k = 1;
		for (int i = 0; i < m.length; i++) {
			if(!sw) {
				for (int j = 0; j < m.length; j++) {
					m[i][j]= k++;
				}
			} else {
				for (int j = 0; j < m.length; j++) {
					m[i][j]= k-- +4;
				}
			}
			sw = !sw;

		}
		 */		


	}

	private static void fillM02_02(int[][] m) {

		int n =1; //방을 찾아서 거꾸로 뒤져온 것
		/*		for (int i= m.length-1; i >=0; i--) {
			for (int j = m[i].length-1; j >=0; j--) {
				m[i][j] = n++;
			}
		}
		 */		
		//00 -> 44 위치 찾아가야됨 
		//01 -> 43 위치 찾아가야됨 
		// i+j =4 규칙을 m[i][j]에 적용
		for (int i= 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-i][4-j] = 5*i+j+1;
			}
		}

	}

	private static void fillM02_01(int[][] m) {
		// 25 24 23 22 21   이러케 하고 싶음(fillM01의 역순)	
		// ...
		// ...
		// 10 9 8 7 6
		// 5 4 3 2 1

		//k=1 세워서  [or m1그대로 놓고 k=25  k--;]
		//		for (int i= m.length-1, k= 1; i >=0; i--) {
		//			for (int j = m[i].length-1; j >=0; j--) {
		//				m[i][j] = k++;
		//			}
		//		}

		//별개 변수 선언없이 i,j 사용
		for (int i= 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 26-(5*i+j+1);//열갯수*i+j+1
				// 위에거 계산값  = 25-5*i-j;
				// 다른사람   	= 5*(5-i)-j;		
			}
		}


	}//fillM02

	private static void fillShuffle02(int[][] m) {
		//행, 열을 난수로 발생시켜서 채워넣기/이미 채워진칸이면 다시 랜덤
		Random rnd = new Random();
		int n = 1;
		int row, column;
		while (n<=25) {
			row = rnd.nextInt(5);
			column = rnd.nextInt(5);
			if(m[row][column] == 0) {//초기값(0)이라면 안채워진거니 채우겠다
				m[row][column] = n++; //초기값이 아니면 이미 찬 칸이니 패스됨
			}
		}
	}

	private static void fillM01(int[][] m) {
		//		i=0일 때 j 01234	
		//		i=1일 때 j 01234 ....	
		for (int i= 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 5*i+j+1;//열갯수*i+j+1
			}
		}
	}

	//k없이 세우려면??? 위에 한 대로 식세우기

	/*		//k라는 변수를 새로 세워서 찍은것
		for (int i= 0, k=1; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = k++;
				//[01][02][03][04][05]
				//[06][07][08][09][10]
				//[11][12][13][14][15]
				//[16][17][18][19][20]
				//[21][22][23][24][25]

			}
		}
	}
	 */
	//출력				//2차원배열 이렇게 받으면 됨
	private static void dispM(int[][] m) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]",m[i][j]);
			}
			System.out.println();
		}
	}

	}
