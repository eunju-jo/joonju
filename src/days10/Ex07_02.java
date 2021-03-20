package days10;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * @author 조은주
 * @date Mar 19, 2021 - 4:32:51 PM
 * @subject Ex07 은 call by value. 여기선 call by reference로 할 것임
 * @content
 *
 */
public class Ex07_02 {

	public static void main(String[] args) {

		int [] m = {10,20};
//		int a = 10;
//		int b = 20;
		System.out.printf(">1. a = %d, b = %d\n", m[0], m[1]);
		
		
		swap(m); //배열명(참조타입) 매개변수로 swap 함수를 호출 == Call By Reference
				
		System.out.printf(">2. a = %d, b = %d\n", m[0], m[1]);

	}//main

	//Call by reference 참조형: ^배열^, 클래스, 인터페이스
private static void swap(int [] m) {
	System.out.printf(">swap1. a = %d, b = %d\n", m[0], m[1]);
	int temp = m[0];
	m[0] = m[1];
	m[1] = temp; 		
	System.out.printf(">swap2. a = %d, b = %d\n", m[0], m[1]);
	}
	//두번째 녹화본으로 영상 설명 
	//main의 m 과 swap의 m은 서로 다른 것이지만, 같은 참조 주소를 가짐.	
	//교환한다면 (m과 swap이 둘 다) 참조하는 주소(100번지)의 값들이 바뀌는 것.

public static void drawLine() {
	System.out.println("==================");
}
	
}//class
