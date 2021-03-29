package days16;

public class Ex08_02 {

	public static void main(String[] args) {

		//287쪽 
/*		1. 가변인자(varargs)와 오버로딩
		2. 가변인자 선언 형식  -> 타입...변수명
		3. JDK 1.5이후 가변인자 가능(variable arguments)
			가변인자: 기존에는 메서드의 매개변수 갯수가 고정되어 있었으나 동적으로 지정해줄 수 있게 한 기능.
		4. 가변인자는 항상 마지막 매개변수로 선언해야 함
*/
		
											//Object...args (모든 자료형 타입 다 적용가능) // 자동 업캐스팅
		System.out.printf("%s %d %c %b \n", "kenik", 10, 'A', true);
		
		
		
		//ㄱ. 두 정수 합
		int result = add(10,20);
		System.out.println(result);
		//ㄴ. 세 정수 합
		result = add(1,2,3);
		System.out.println(result);
		//ㄷ. 네 정수 합
		result = add(1,2,3,4);
		System.out.println(result);
		
	}
	//가변 배열 --> 오버로딩 일일이 할 필요 없어짐 	
	private static int add( int...m ) {
		int result = 0;
		for (int i = 0; i < m.length; i++) {
			result += m[i];
		}
		return  result;
	}
	
	//오버로딩 (첫번째는 타입이 다른것, 아래 세개는 갯수가 다른 것)
/*	
	private static int add(int [] m ) {
		int result = 0;
		for (int i = 0; i < m.length; i++) {
			result += m[i];
		}

		return result;
	}
	

	private static int add(int i, int j, int k, int l) {
		
		return i+j+k+l;
	}

	private static int add(int i, int j, int k) {
		return i+j+k;
	}

	private static int add(int i, int j) {
		//이거보다 아래가 더 좋은 코딩
//		int result = i + j;
//		return result;
		
		return i+j;
	}
*/
}
