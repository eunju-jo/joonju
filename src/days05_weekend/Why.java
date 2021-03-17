package days05_weekend;

/**
 * @author 조은주
 * @date 2021. 3. 12 - 오후 2:20:16
 * @subject 5일 Ex06 왜저러나 -why 해결 완~!
 * @content
 *
 */
public class Why {

	public static void main(String[] args) {

		//1~10까지 정수 합
		
//		int sum=0;
//		for (int i = 1; i <=10; i++) {
//			sum+=i;
//			System.out.printf("%d + ",i );
//		}
//		System.out.printf("\b = %d\n", sum);
		

		//문: 1-10까지 홀수의 합

//		int sum = 0;
//		for (int i = 1; i <=10; i++) {
//			if (i%2 !=0) {
//				sum +=i;				
//				System.out.printf("%d + " ,i);
//			}
//		}
//		System.out.printf(" \b= %d\n", sum);
		
		int sum = 0;
		for (int i = 1; i <=10; i+=2) { //if(i%2==0)이런식으로 하는거보다 i+=2가 더 간결하고 덜 돌음. 이게 젤 좋은 코딩이래
			
				System.out.printf("%d + " ,i);
				sum += i;
			}
//		System.out.printf(" \b= %d\n", sum);
		
		//return문 : 리턴값을 가지고 함수를 빠져나갈 때(보통 프로그램 종료)
		//break문 : 제어문 빠져나갈 때
		//if(i==5) break;
//		int sum = 0;
//		for (int i = 1; i <=10; i++) {
//			if (i%2 !=0) {
//				sum +=i;				
//				System.out.printf("%d + " ,i);
//			}
//		}
//		System.out.printf(" \b= %d\n", sum);
	
		
		//continue문 : 
//		int sum = 0;
//		for (int i = 1; i <=10; i++) {
//			//if(i%2==0) continue;
//			//만약 i가 짝수라고 한다면 출력x,누적x, 명령 {}끝내고 i++증감식으로 가세요
//			//반복문에서 continue가 나오면 반복문 실행말고 다시 증감식으로(맨앞) 가란소리
//			if (i%2 !=0) {
//				sum +=i;				
//				System.out.printf("%d + " ,i);
//			}
//		}
//		System.out.printf(" \b= %d\n", sum);
//		
		
		//while 1-10 합은 55출력
		//continue 써서 짝수 합 출력
//		int i = 0, sum = 0;
//		
//		while (i++<=10) {
//			if(i%2 ==1) continue;
//			System.out.printf("%d + " ,i);
//			sum +=i;		
//		}
//		System.out.printf(" \b= %d\n", sum);
		
		
		
		
		
		
		
	}//main

}
