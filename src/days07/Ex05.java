package days07;

/**
 * @author 조은주
 * @date Mar 16, 2021 - 4:40:54 PM
 * @subject
 * @content
 *
 */
public class Ex05 {
	public static void main(String[] args) {

		//****
		//****
		//****
		//****
		//이중 for문으로 표현할 것.	
		
/*		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				System.out.printf("*");	
			}
			System.out.println();
		}     */
		
		
		
		//1. 
		//*
		//**
		//***
		//****
		
		//2. i=j  i-1=j i-2=j i-3=j
		//	 i-1=j i=j i-2=j		
		//****
		//***
		//**
		//*
		
		//[i,j]형태찍기
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}		

		
		//문1
/*		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		System.out.println();
		
		//문2
		for (int i = 1; i <=4; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
			System.out.println();   */
			
		//문3 빈칸찍는 작업 필요 (_로 처리)
/*		for (int i = 1; i <=4; i++ ) {
			for (int k = 2; k <=i; k++) {
				System.out.print("_");
			}
			for (int j = 4; j>=i; j--) {	
				System.out.printf("*");
			}
			System.out.println();
		}		*/
		
		//문4 
		for (int i = 1; i <=4; i++ ) {
			for (int k = 3; k>=i; k--) {
				System.out.print("_");
			}
			for (int j = 1; j<=i; j++) {	
				System.out.printf("*");
			}
			System.out.println();
		}		

		
		//문5 ?????
//		for (int i = 1; i <=4; i++ ) {
//			for (int k = 3; k>=i; k--) {
//				System.out.print("_");
//			}
//			for (int j = 1; j<=i; j++) {	
//				System.out.printf("*");
//			}
//			System.out.println();
//		}		
		
		
		
		
		
		
//		i, i-1
		//3에서 _ 찍기 : 2,1/ 3,1/ 3,2/ 4,1/ 4,2/ 4,3
		//i>j
		
		// 3. i=j i+1=j i+2=j i+3=j
		//        i=j   i+1=j i+2=j
		// 결국 i<=j
		

		//2. i=j  i-1=j i-2=j i-3=j
		//	 i-1=j i=j i-2=j		
		
//		i>=j
//		i
		
		
		


	}//main

}//class
