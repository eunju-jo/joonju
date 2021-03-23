package days12;

import java.util.Arrays;

/**
 * @author 조은주
 * @date Mar 23, 2021 - 11:37:51 AM
 * @subject 삽입정렬 뭔말???????모르겠음₩	
 * @content
 *
 */
public class Ex03_05 {

	public static void main(String[] args) {
		// 삽입 정렬(insertion sort)
		// : 아직 정렬되지 않은 임의의 데이터를 이미 정렬된 부분의 적절한 위치에 삽입해 가며 정렬하는 방식
		// 포인트: 두번째 자료부터 시작해서 이전(왼쪽)의 자료들과 비교해서 
		// 삽입(끼워넣을) 할 위치를 지정한 후
		// 자료를 뒤로 옮겨 놓고 지정한 자리에 자료를 삽입하여 정렬하는 방식 

		//[1] 삽입할 위치 지정 
		//[2] 더 큰 애들 한 칸씩 뒤로 밀기
		//[3] 지정한 자리에 자료를 삽입

		// 0-1 // 0-2 1-2 // 0-3 1-3 2-3 // 0-4 1-4 2-4 3-4 //
		// i=1. i++<=4 __ 1234   ------  j=0 j++ = i __ 0, 01, 012, 0123
		int [] m = { 3, 5, 2, 4, 1 };
		System.out.println( Arrays.toString(m) );

		insertionSort(m);


	}//main

	private static void insertionSort(int[] m) {

		// [1, 2, 5,       3]
		//		[3,          5,2,4,1]
		for (int i = 1; i < m.length; i++) {
			int idx = 0; // 삽입할 위치를 저장할 index 변수
			int value = m[i]; // 삽입할 값을 저장할 변수
			//밑에 이프문 value로 줄라고
			
			//1. while문이 더 쉬울 수 있음... 몇번 반복할지 모르니까... 조건: m[j] < value
			for (int j = i-1; j >=0; j--) { //체크하고자하는 i-1부터 0을 만날 때까지 비교
				//삽입할 위치 찾는 코딩
				if (m[j] < value) { //value 값(삽입할 값)이 j위치보다 크다면 ?
					idx = j+1; //이래되면 앞에 더 체크할 필요 없음
					break;
					//다 돌고도 못찾으면 자리는 0임. 그래서 위에 idx = 0으로 줌
 				} else { //미는역할 까지 여기서 해버리자*******************밑이랑 다른 점은 else문 추가
 					m[j+1]=m[j]; //2
 				}
			}//j포문
			//밀을 때 뒤에거부터 한칸씩 옮겨야 덩어리가 차례로 잘 들어감(35 45 옮기는데 꼬이면 둘다 35 35 로 들감)
			//i값 앞(i-1)부터 하나씩 밀어
			//2.
			for (int j = i-1; j >=idx; j--) {
				m[j+1] = m[j]; //0번째 읽어와서 1번째에 이동시키겠다.
			}
		
			
			//3.끼워넣고자 하는 위치에 value값 집어넣기
			m[idx] = value;
		
			System.out.println(Arrays.toString(m));
		}



/*
		
		// [1, 2, 5,       3]
		//		[3,          5,2,4,1]
		for (int i = 1; i < m.length; i++) {
			int idx = 0; // 삽입할 위치를 저장할 index 변수
			int value = m[i]; // 삽입할 값을 저장할 변수
			//밑에 이프문 value로 줄라고
			
			for (int j = i-1; j >=0; j--) { //체크하고자하는 i-1부터 0을 만날 때까지 비교
				//삽입할 위치 찾는 코딩
				if (m[j] < value) { //value 값(삽입할 값)이 j위치보다 크다면 ?
					idx = j+1; //이래되면 앞에 더 체크할 필요 없음
					break;
					//다 돌고도 못찾으면 자리는 0임. 그래서 위에 idx = 0으로 줌
				}
			}//j포문
			//밀을 때 뒤에거부터 한칸씩 옮겨야 덩어리가 차례로 잘 들어감(35 45 옮기는데 꼬이면 둘다 35 35 로 들감)
			//i값 앞(i-1)부터 하나씩 밀어
			//2.
			for (int j = i-1; j >=idx; j--) {
				m[j+1] = m[j]; //0번째 읽어와서 1번째에 이동시키겠다.
			}
		
			
			//3.끼워넣고자 하는 위치에 value값 집어넣기
			m[idx] = value;
		
			System.out.println(Arrays.toString(m));
		}

*/
	}//insertion



}//class	
