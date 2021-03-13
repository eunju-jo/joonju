package days05_weekend;

public class Ex03 {
	public static void main(String[] args) {


		//while문은 조건이 true인동안 실행됨
		boolean flag = false;		
		// !false => true

		//이렇게 할 경우 무한 출력,,, 실행하지 말기 
//		while(!flag) {
//			System.out.println("홍길동");
//		}
//
//		System.out.println(" END ");


		// count 값이 10이 되면 while문 빠져 나오도록 하자.       break;
		// count 변수의 초기값을 1이 아니라 0부터 시작
		
//		int count = 0;
//		
//		while (true) {
//			++count;
//			System.out.printf("%s-%d ", "홍길동",count);
//			
//			if (count > 10) {
//		System.out.println("\n프로그램 종료");break;
//			}
//		}
		

		int count = 1;
		while (count<=10) {
			System.out.printf("%d-%s ",count, "홍길동");
			count++;
			}
		}
		
		
	
	}//main

