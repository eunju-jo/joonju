package days11_night;

public class Ex02_03_re {

	public static void main(String[] args) {
//		팩토리얼 재귀함수로 만들기
		
		int result = factorial(3); //6
		result = factorial(0); //1
		result = factorial(-3); //1
		System.out.println(result);
		
		int result2 = recursiveFactorial(3);
		System.out.println(result2);
		
	}

	private static int recursiveFactorial(int i) {
		if(i == 1 || i == 0) return 1;
		else return i * recursiveFactorial(i-1);
		
	}

	private static int factorial(int idx) {
		int result = 1;
		
		for (int i = 1; i <=idx; i++) {
			 result *= i;
			 }
		return result;
	}

}
