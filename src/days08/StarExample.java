package days08;

public class StarExample {

	public static void main(String[] args) {

		//[1] 이중 for문 안에 if문 넣기
		for (int i = 1; i <=4; i++) { //행(라인 개수)과 관련
			for (int j = 1; j<=4; j++) { //열(한 줄에 찍히는 수) 관련
				if(i <= j)System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
		}


		System.out.println();

		//[2]i,j 관계 활용해서 j에다가 i로 식세우기
		for (int i = 1; i <=4; i++) { //행(라인 개수)과 관련
			for (int j2 = 1; j2 <=i-1; j2++) {
				System.out.print("_");
			}
			for (int j = 1; j<=5-i; j++) { //열(한 줄에 찍히는 수) 관련
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println();

		
		//[3] end 변수 하나 선언해서 두 곳 다 활용하기
		int end = 0;

		for (int i = 1; i <=4; i++) { 
			for (int j2 = 1; j2 <=end; j2++) {
				System.out.print("_");
			}
			for (int j = 1; j<=4-end; j++) { 
				System.out.print("*");
			}
			end++;

			System.out.println();
		}




System.out.println();

		//[4] end를 각각 새로 선언하기
		int end4_1 = 0;
		int end4_2 = 4;

		for (int i = 1; i <=4; i++) { 
			for (int j2 = 1; j2 <=end4_1; j2++) {
				System.out.print("_");
			}
			end4_1++;
			for (int j = 1; j<=end4_2; j++) { 
				System.out.print("*");
			}
			end4_2--;

			System.out.println();
		}


	}

}
