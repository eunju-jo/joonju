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
		int end=0;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=end; j++) {
				System.out.print("_");
			}
			for (int j = 1; j <=5-2*end; j++) { //end값이랑 *(5-3-1)비교해보면 end에 2곱해서 *이랑 더하면 5 같을거같음..맞음
				 System.out.print("*");
			}
			end += (i < 3 ? 1 : -1);  
			System.out.println();
		}
		
		
		
		
		
	}

}
