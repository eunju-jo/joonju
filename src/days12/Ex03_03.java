package days12;

import java.util.Arrays;

/**
 * @author 조은주
 * @date Mar 23, 2021 - 11:37:51 AM
 * @subject 교재 201쪽 예제 5-10
 * @content
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		//정렬sort : 자료를 일정한 기준에 따라 나열하는 것
//		-   선택정렬, 삽입정렬, 버블정렬, 병합정렬+퀵정렬, 힙정렬 등  

		//버블 정렬(bubble sort): 서로 이웃한(인접한) 데이터들을 비교하며 가장 큰 데이터를 가장 뒤로 보내며 정렬하는 방식
		
		int [] m = { 3, 5, 2, 4, 1 };
		System.out.println(Arrays.toString(m));
	
		bubbleSort(m);
		
		//소트함수 기억
		Arrays.sort(m); //나중에 프젝할 땐 기존 함수 이거 쓰면 됨 우린 연습할라고 밑에거 하고 있는 거
						//기본: 오름차순 정렬
		
	}//main

	private static void bubbleSort(int[] m) {

		//0-1비교해서 큰거 뒤로, 1-2비교해서 큰거 뒤로, 동일하게 2-3, 3-4 반복
		//제일 큰값이 맨 뒤로 가있을 것
		
		//계속 돌리면 차례로 큰수가 뒤로 가게 됨
		//0-1 1-2 2-3 3-[4]  별이라고 가정시  ****
		//0-1 1-2 2-[3]                   ***
		//0-1 1-[2]                       **
		//0-[1]		                      *
		//i-i+1과 같음
		
		for (int i = 0; i < 4; i++) {//행개수
			for (int j = 0; j < 4 -i ; j++) {
				System.out.printf("%d-%d\t", j , j+1);
				if(m[j]>m[j+1]) { //앞의 수가 더 커서 뒤랑 바꾸는 처리가 된다면 ***를 찍고 탭하겠음
					System.out.print("***\t");
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
				System.out.println(Arrays.toString(m)); 
			}//for
			System.out.println();
		}//for
		
		
/*					 // 4 = m.length-1
		for (int i = 0; i < 4; i++) {//행개수
			System.out.printf("%d회전 : ", i+1);
			for (int j = 0; j < 4 -i ; j++) {
//				System.out.printf("%d-%d\t", j , j+1);
				//별찍듯이 위에거를 이중포문으로 표현
				//오름차순 정렬 [3, 5, 2, 4, 1] -> ... -> [1, 2, 3, 4, 5]
				if(m[j]>m[j+1]) {
					m[j] = m[j+1];
					int temp = m[j];
					m[j+1] = temp;
				}
			}
//			System.out.println();
			System.out.println(Arrays.toString(m)); 
			//프린트 된거에 첫줄은 실행하기전 main함수에 syso/ 한 회전마다 실행하겠다
		}
*/		
	}//bubble

}//class	
