package days11;

import com.sun.prism.impl.BaseMesh.FaceMembers;

/**
 * @author 조은주
 * @date Mar 22, 2021 - 12:06:06 PM
 * @subject 팩토리얼 재귀함수로 만들기
 * @content
 *
 */
public class Ex02_03 {

	public static void main(String[] args) {


//		long result = factorial(10); //일단 값 크게 가정하고 long 사용
//		long result = factorial(0); // 0! = 1
//		long result = factorial(-3); // -3! = 1로 나옴

		long result = recursiveFactorial(10); // 재귀함수
//		long result = recursiveFactorial(0); 
		System.out.println(result);
	}

	
	private static long recursiveFactorial(int n) {
		
//		if(n == 1) return 1;
//		else if(n ==0) return 1;
//		else return n * recursiveFactorial(n-1);

		if(n == 1 || n ==0 ) return 1;
		else return n * recursiveFactorial(n-1);
		
	}
	
	private static long factorial(int n) {
		//if(n<0) 오류발생시키자 - 예외처리, 예외 발생시키는 코딩 (나중에 배우고 넣을 것)
		long result = 1; //0 주면 x. 0에 뭘 곱해도 0나옴

		for (int i = 1; i <=n; i++) {
			result *= i;
		}
		return result;
	}


}
