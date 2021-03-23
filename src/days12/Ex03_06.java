package days12;

import java.util.Arrays;

/**
 * @author 조은주
 * @date Mar 23, 2021 - 2:35:39 PM
 * @subject 병합정렬
 * @content
 *
 */
public class Ex03_06 {

	public static void main(String[] args) {

		//병합정렬 merge sort
		// : 이미 정렬되어져 있는 두 개의 배열(파일)을 합하여 하나의 배열(파일)로 만드는 정렬.

		//기본적으로 둘다 오름차순 정렬 되어 있는 상태
		int [] m = { 1, 3, 6, 10, 13, 15 };
		int [] n = { 2, 4, 5, 7, 10 };

		mergeSort(m, n);


	}//main

	private static void mergeSort(int[] m, int[] n) {

		//배열 m과 n의 첫 인덱스들끼리 비교해서 작은 것부터 mn에 채우기
		// m[0] - n[0] - m[1] - n[1] 이렇게 차례로 하다가
		//한쪽(가령n)이 다 채워지고 남으면(m) 뒤에 스르륵 붙이기

		int [] mn = new int[m.length + n.length];

		int mIndex = 0, nIndex = 0, mnIndex = 0; //첫자리 선언
	
		
		//성능 높이려고 하는거. 밑에 while 돌아갈때마다 length 구하지 않게 하려고.안해도 상관은 없음
		int mLength = m.length;
		int nLength = n.length;
		int mnLength = mn.length;
		

		//if-else문 : 두 배열 중 하나라도 다 찰 때까지 while
		// [[ m.length > mIndex && n.length > nIndex -----while조건 이렇게 세워도됨 ]]
		//    ㄴ> 둘다 안찰동안 반복해라
		while (!(mLength == mIndex || nLength == nIndex)) {
			//아래 if문 삼항연산자로 축약
			mn[mnIndex++]  = (m[mIndex] > n[nIndex]) ? n[nIndex++] : m[mIndex++];
			
//			if(m[mIndex] > n[nIndex]) {
//			//같을 땐 노상관이니 같을 때 제외하고 크기 비교 하겠음
//				mn[mnIndex++] = n[nIndex++];
//			} else {
//				mn[mnIndex++] = m[mIndex++]; //후위 안에다 합치기
//			}
			
		}
		//m n system.arraycopy()
		for (int i = mnIndex; i < mn.length; i++) {
			mn[i] = (mIndex == mLength) ? n[nIndex++] : m[mIndex++];
		}
		
		int [] temp = (mIndex == mLength) ? n : m;
		int tempIndex = (mIndex == mLength) ? nIndex : mIndex;
		System.arraycopy(temp, tempIndex, mn, mnIndex, temp.length-tempIndex);
		
		
		//m n 중 뭐가 남았는지 확인
//		if(mIndex == m.length) {//m배열 다 채워지고 n배열이 남아있따
//			
//		} else {// n배열 다채우고 	m배열이 남아있다
//			
//		}
		
		System.out.println(Arrays.toString(mn));

		
		
		//아래거 축약 몇개 시킨게 위에 버전
		
/*		//배열 m과 n의 첫 인덱스들끼리 비교해서 작은 것부터 mn에 채우기
		// m[0] - n[0] - m[1] - n[1] 이렇게 차례로 하다가
		//한쪽(가령n)이 다 채워지고 남으면(m) 뒤에 스르륵 붙이기

		int [] mn = new int[m.length + n.length];

		int mIndex = 0, nIndex = 0, mnIndex = 0; //첫자리 선언
	
		
		//성능 높이려고 하는거. 밑에 while 돌아갈때마다 length 구하지 않게 하려고.안해도 상관은 없음
		int mLength = m.length;
		int nLength = n.length;
		

		//if-else문 : 두 배열 중 하나라도 다 찰 때까지 while
		// [[ m.length > mIndex && n.length > nIndex -----while조건 이렇게 세워도됨 ]]
		//    ㄴ> 둘다 안찰동안 반복해라
		while (!(m.length == mIndex || n.length == nIndex)) {
			if(m[mIndex] > n[nIndex]) {
			//같을 땐 노상관이니 같을 때 제외하고 크기 비교 하겠음
				mn[mnIndex] = n[nIndex];
				nIndex++;
				mnIndex++;
			} else {
				mn[mnIndex] = m[mIndex];
				mIndex++;
				mnIndex++;

			}

		}
		//m n 중 뭐가 남았는지 확인
		if(mIndex == m.length) {//m배열 다 채워지고 n배열이 남아있따
			
		} else {// n배열 다채우고 	m배열이 남아있다
			
		}
		System.out.println(Arrays.toString(mn));
*/
	}//mergeSort

}//class
