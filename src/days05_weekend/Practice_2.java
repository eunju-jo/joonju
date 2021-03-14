package days05_weekend;

public class Practice_2 {

	public static void main(String[] args) {
		//while문 사용해 1~10=55출력. 
		//continue문 써서 짝수의 합 구하세요.
		//continue 앞의 조건이 맞지 않으면 뒤에는 실행되지 않음

		int i=0, sum=0;
		while(++i<=10) {
			if(i%2!=0) continue;
			System.out.printf("%d+", i);
			sum+=i;
		}
		System.out.printf("\b=%d",sum);





	}//main	

}
