package days11;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 22, 2021 - 12:06:47 PM
 * @subject 누승(거듭제곱,power)	
 * @content
 *
 */
public class Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//an에서 a = 밑수, n= 지수
		//두 정수(밑수,지수)를 입력받아서 누승을 계산. 
		int a, n;
		System.out.printf(">밑수(a)와 지수(n)을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);

		a = scanner.nextInt();
		n = scanner.nextInt();

//		double result = power(a,n);
//		System.out.println(result);

		double recur = recursivePower(a,n);
		System.out.println(recur);

		// Math.pow(a,b) --> 구하는 함수 따로 있음. 기억

	}//main

	//재귀함수로 만들 때
	private static double recursivePower(int a, int n) {
		
/*		double result;
		if(n==1) result = a; 
		else if(n==0) result = 1; 
		else result = ( a *= recursivePower(a, n-1));
		return n < 0? 1/result : result; //음수가 안됨 ㅡㅡ  */
		
		if(n>1) {
			return a * recursivePower(a, n-1);
		} 
		else if(n==1) return a;
		else if(n < 0) return 1 / recursivePower(a, -1*n); //2^-3승이면 2^3으로 바꿔버려서 그거를 1로 나누겠다
		else 			return 1; //0일 경우
		
	}
	

	//아래것 중복분 축약하면
	private static double power(int a, int n) {
		double result = 1;

		//		n = n<0? -n : n; //아래 방법 기억안나면 이렇게라도

		//어쨌든 양수로 가정하고 2^3 해야되니까 -> 음수면 나중에 1/result;하면됨
		for (int i = 1; i <=Math.abs(n); i++) {
			result *= a;
		} 

		return n < 0 ? 1/result : result;
	}

	/*	private static double power(int a, int n) {
		double result = 1;
		if (n>=0) {
			for (int i = 1; i <=n; i++) {
				result *= a;
				// 1 * a를 n번 곱하기 
			} 

			return result;
		} else {
			n = -n; // n = -1 * n; 부호바꾸기 (음수->양수)	
			for (int i = 1; i <=n; i++) {
				result *= a;
			} 
			return 1/result;
		}

	}
	 */

}//class
