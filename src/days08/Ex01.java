package days08;
/**
 * @author 조은주
 * @date Mar 17, 2021 - 10:14:32 AM
 * @subject 별 찍 
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args){

		
		//i=1 j=1,2,3,4 돌고 5되면 아웃 +개행 ****
		//i=2 j=1,2,3,4 돌고 5되면 아웃 +개행 ****
		//i=3 j=1,2,3,4 돌고 5되면 아웃 +개행 ****
		//i=4 j=1,2,3,4 돌고 5되면 아웃 +개행 ****
		//i=5 라서 아예 아웃
//ㄴ.		
//*
//**
//***
//****
		
	for (int i = 1; i <=4; i++) { //행(라인 개수)과 관련
			for (int j = 1; j<=i; j++) { //열(한 줄에 찍히는 수) 관련
				System.out.print("*");
//				if(i == j)System.out.print("*");
//				else System.out.print("_");
			}
			System.out.println();
		}

		System.out.println();
	

	
		
//ㄷ.
//**** i=1     j=4
//***  i=2     j=3
//**   i=3     j=2
//*    i=4     j=1       i+j = 5
		
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=5-i; j++) {
				System.out.print("*");
			}			
			System.out.println();
		}

		

		
//ㄹ.
//___*
//__**
//_***
//****

		/*
		for (int j = 1; j <=4; j++) {
			for (int e = 1; e<=4-j; e++) { //열(한 줄에 찍히는 수) 관련	
				System.out.print("_");
			}
			for (int m = 1; m<=j; m++) { 	
				System.out.print("*");
			}
			System.out.println();
		}

		*/
		
		
//ㅁ.
//**** i 1  _0  *4
//_*** i 2  _1  *3
//__** i 3  _2  *2
//___* i 4  _3  *1
		
/*		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i-1; j++) {
				System.out.print("_");
			}
			for (int m = 1; m <=5-i; m++) {
				System.out.print("*");
			}

			System.out.println();
		}
*/		

		
//ㅂ. 이등변삼각형
//__*
//_***
//*****
		
	
	for (int i = 1; i <=3; i++) {
		for (int j = 1; j <=5; j++) {
			if(i+2>=j && i+j>=4) System.out.print("*");
			else System.out.print("_");
		}
		System.out.println();
	}
	
	
/*		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <= 3-i; j++) {
				System.out.print("_");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			for (int d = 1; d <=3-i; d++) {
				System.out.print("_");
			}// 뒷 공백 찍고 싶으면 	(안해도 됨)	
			System.out.println();
		}
*/		
	
	System.out.println();
		
		//방법1: end2  새로 선언 (마름모)
/*		int end = 2;
		int end2 = 1;
		for (int i = 1; i <=5; i++) {
			//i<=3? 3-i : -(3-i) 이렇게 삼항연산자로 쓴 사람도 있음(포문도는만큼 연산계속해서좋은 코딩은 아님)
			//for문 돌때마다 절대치 구하지 않게 밖에 빼놓는게 더 좋은 코딩
//			end = Math.abs(3-i);
			for (int j = 1; j <=end; j++) {
				System.out.print("_");
			}
			end += (i >= 3 ? 1 : -1); //end를 i<=3까지는 1씩 감소해나가다가 4부터는 1씩 늘려라
			
			for (int d = 1; d <=end2; d++) {
				System.out.print("*");
			}
		    end2 += (i >= 3?  -2 : 2); //이게 된다는데 왜 안되지?	end+=인데 =로 짜서 안됐음
//			end2 = (2*i-1<5? 2*i+1: -2*i+9); //되긴하는데 이렇게 힘들게 짜야되나????	이것도 그래서
			System.out.println();
		}
		
*/		
		
		
		//end와 별 간의 관계로 -> 5 -2 * end	
/*		int end = 2;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=end; j++) {
				System.out.print("_");
			}
			
			for (int d = 1; d <=5-2*end; d++) {
				System.out.print("*");
			}
			end += (i >= 3 ? 1 : -1); //end를 i<=3까지는 1씩 감소해나가다가 4부터는 1씩 늘려라
			System.out.println();
		}

		*/
		
		
		//모래시계 찍기
		int end = 0;
		for (int i = 1; i <=5; i++) {
			//i<=3? 3-i : -(3-i) 이렇게 삼항연산자로 쓴 사람도 있음(포문도는만큼 연산계속해서좋은 코딩은 아님)
			//for문 돌때마다 절대치 구하지 않게 밖에 빼놓는게 더 좋은 코딩
//			end = Math.abs(3-i);
			for (int j = 1; j <=end; j++) {
				System.out.print("_");
			}
			
			for (int d = 1; d <=5-2*end; d++) {
				System.out.print("*");
			}
			end += (i < 3 ? 1 : -1); //end를 i<3까지는 1씩 증가해나가다가 4부터는 -1씩 해라
			System.out.println();
		}
		
	
		
		
		
		



}//class
}