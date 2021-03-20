package days10;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class Ex07 {

	public static void main(String[] args) {

		//함수 : drawLine() drawLine(int n) drawLine(int n, char style) 오버로딩
		//함수를 호출할 때 매개변수 사용방법에 따라서 
		//1)Call By Name
		//**2)Call By Value
		//3)Call By Point _C언어에서. 자바에선X
		//**4)Call By Reference
		//2,4번 구분 필요
		
//		drawLine(); //1) ~ name: 매개변수X, 함수명 호출하는 경우

		int a = 10;
		int b = 20;
		System.out.printf(">1. a = %d, b = %d\n", a, b);
		
/*		int temp = a;
		a = b;
		b = temp;     */
//이렇게 변수 바꾸던 거를 함수로 처리하고 싶음
//swap()  기능: 두 기억공간의 값을 바꾸는 일
		
		swap(a,b);
				
		System.out.printf(">2. a = %d, b = %d\n", a, b);

	}//main

private static void swap(int a, int b) {
	System.out.printf(">swap1. a = %d, b = %d\n", a, b);
	int temp = a;
	a = b;
	b = temp; 		
	System.out.printf(">swap2. a = %d, b = %d\n", a, b);
	}
//결과 이렇게 나옴(call by value) _ 기억공간의 값value을 main stub(a,b)에서 swap stub(a,b)으로 옮겨가 처리해서	
//함수 호출 끝난 후 main 함수 a,b 그냥 그대로 프린트 되는 것
//>1. a = 10, b = 20
//>swap1. a = 10, b = 20
//>swap2. a = 20, b = 10
//>2. a = 10, b = 20

//기억 공간 자체를 넘겨야 하는 것 (아이패드 녹화본 참고) (그림)	


public static void drawLine() {
	System.out.println("==================");
}
	
}//class
