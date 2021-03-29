package days16;

import days15.TV;

public class Ex03_02 {

	public static void main(String[] args) {

		//클래스(객체) 배열 초기화
		
/*		TV t1 = new TV();
		TV t2 = new TV();
		TV t3 = new TV();
		TV t4 = new TV();
		TV t5 = new TV();
		*/
		//이걸 클래스 배열로 선언 가능
		
/*		TV tArr = new TV[5]; //tArr이라는 클래스 배열 선언한 것
		tArr[0] = new TV();
		tArr[1] = new TV();
		tArr[2] = new TV();
		tArr[3] = new TV();
		tArr[4] = new TV();
*/
		//클래스 배열 초기화 알아보기 이전에 '배열 초기화'의 의미 복기
/*		int kor1 = 90;
		int kor2 = 88;
		int kor3 = 80;
		
		int [] kors = new int[3];
		kor1 = 90;
		kor2 = 89;
		kor3 = 80;
		
 */		

//		int [] kors = {90, 89, 80}; ---이게 배열 초기화
		
		//클래스 배열 '초기화'
		
		TV [] tvArr = {
						new TV(), 
						new TV(), 
						new TV(), 
						new TV(), 
						new TV()
						};
		
		
	}


// 클래스(객체) 배열 초기화

/*
int kor1 = 90;
int kor2 = 89;
int kor3 = 80;

기존에 알던 윗 개념이 클래스에선 아래로 적용됨(클래스 시)

TV t1 = new TV();
TV t2 = new TV();
TV t3 = new TV();
TV t4 = new TV();
TV t5 = new TV();
*/

/*

int [] kors = new int[3];
kor1 = 90;
kor2 = 89;
kor3 = 80;

여기도 마찬가지

TV [] tArr = new TV[5]; // tArr 클래스 배열 선언
tArr[0] = new TV();
tArr[1] = new TV();
tArr[2] = new TV();
tArr[3] = new TV();
tArr[4] = new TV();
*/

// 배열 초기화 
/* 
int [] kors = new int[]{  90, 89, 80 };
int [] kors = {  90, 89, 80 };
*/
	
	
// *** 클래스 배열 초기화 ***
TV [] tvArr = {
		           new TV(), 
		           new TV(), 
		           new TV(),
		           new TV(),
		           new TV()
		     };

}