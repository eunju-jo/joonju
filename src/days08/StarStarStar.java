package days08;

public class StarStarStar {
	public static void main(String[] args) {
		//이등변삼각형 3줄
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=5; j++) {
				if(i+j>3 &&i+3>j) System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
		}

System.out.println();
		
		//마름모
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if(i+j>=4 && i+j<=8 && i-2<=j && i+2>=j) System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
		}

		System.out.println();
		
		System.out.println();
		
		//모래시계
		int end = 0;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=end; j++) {
				System.out.print("_");
			}
			for (int n = 1; n <= 5-2*end ; n++) {
				System.out.print("*");
			}
			end += (i<3 ? 1 : -1);
			System.out.println();
		}

		
		
	}
}
