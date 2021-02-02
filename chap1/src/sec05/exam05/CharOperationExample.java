package sec05.exam05;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1; //char c1 = 66으로 컴파일됨(B의 유니코드 숫자)
		char c2 = 'A';
		int c3 = c2 + 1;   //char변수가 산술연산에 사용되면, int타입으로 변환되므로 연산결과는 c2=int 타입이 됨
		char c4 = (char) (c2+1);
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		System.out.println("c4: " + c4);
	}
}
