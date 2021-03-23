package days12;

import java.util.Arrays;

/**
 * @author 조은주
 * @date Mar 23, 2021 - 11:37:51 AM
 * @subject 교재 201쪽 예제 5-10
 * @content
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {
		//정렬sort : 자료를 일정한 기준에 따라 나열하는 것
		//		선택 정렬(selection sort): 정렬되지 않은 데이터들에 대해 '가장 작은 데이터를 찾아select' 가장 '앞'의 데이터와 교환해나가는 방식

		int [] m = { 3, 5, 2, 4, 1 };
		System.out.println(Arrays.toString(m));

		selectionSort(m);



	}//main

	private static void selectionSort(int[] m) {
		//비교해서 큰거 앞으루 
		//0-1 0-2 0-3 0-4
		//    1-2 1-3 1-4
		//        2-3 2-4
		//            3-4

		//직접 해보랍니다.. 규칙 알아서찾기
		for (int i = 0; i < m.length-1; i++) { //4번까지 돌아야하니까 <4로 줘도됨
			for (int j = i+1; j < m.length; j++) { //m.length 5니까 4까지
//				System.out.printf("%d-%d\t", i, j);
				if(m[i]>m[j]) {
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
				System.out.println(Arrays.toString(m)); 
			}
			System.out.println();
		}




	}//selectionSort


}//class	
