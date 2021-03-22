package days11_night;

import java.util.Scanner;

public class Ex02_04_re {

	public static void main(String[] args) {
		//an에서 a = 밑수, n= 지수
		//두 정수(밑수,지수)를 입력받아서 누승을 계산. 
		
		System.out.println("두 정수(밑수와 지수)를 차례로 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		
		double recur = recursivePower(a,n);
		System.out.println(recur);
		
		double pow = power(a,n);
		System.out.println(pow);
		
	}

	private static double power(int a, int n) {

	double result = 1;
	for (int i = 0; i < Math.abs(n); i++) { //음수일 경우를 위해 절대값 함수 사용
		result *= a;
	}
	return n < 0 ? 1 / result : result;
	
	}

	//2^3 = 2* 2* 2* 
	private static double recursivePower(int a, int n) {
		double result;
		if(n > 1) result = a * recursivePower(a, n-1);
		else if(n == 1) result = a;
		else if(n < 0) {
			result = 1 / recursivePower(a, -1*n);
		}
			else  result = 1; //0인 경우
		
		return result;
	}

}
