package days08;

public class Ex01_prac {

	public static void main(String[] args) {

	//마름모
//		for (int i = 1; i <=5; i++) {
//			for (int j = 1; j <=5; j++) {
//				if(i+2>=j && i+j>=4 && i-2<=j && i+j<=8) System.out.print("*");
//				else System.out.print("_");
//			}
//			System.out.println();
//		}
		
		
		//이등변삼각형(마름모위쪽)	
/*		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=5; j++) {
				if(i+2>=j && i+j>=4) System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
*/
			
	//모래시계
		int end=1;
		for (int i = 1; i <=5; i++) {
			end += (i<=3)?  
			for (int j = 1; j <=5; j++) {
				if(i<=j && end) System.out.print("*");
				else System.out.print("_");
			}

			
			System.out.println();
		}
		
		
		
		
		
	}

}
