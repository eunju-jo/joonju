package days05;

public class Ex02 {

	public static void main(String[] args) {

		int sum=0;
		
		//실수로 for (int i = 1; i <=10; i++) 뒤에 ; 찍는다면 포문 따로 뒤에 { }괄호문 따로 인식되서 그냥 아예 별개로 처리됨
		for (int i = 1; i <=10; i++) {
			System.out.printf("%d + ",i);
			sum +=i;
		}
		System.out.printf("\b=%d\n", sum);
		
	}
}
