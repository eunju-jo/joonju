package days05;

public class Ex03 {
	public static void main(String[] args) {

		//for문 : 반복문(반복'횟수'가 정해져있는 경우)
		//while문 : 조건반복문 (반복횟수 모름. 반복 '조건'이 정해져있을 때)


		//조건문이 참일 동안 계속 { } 블럭을 반복 처리함
		/*	boolean flag = false;
	while (!flag) {
		System.out.println("홍길동");
	}
	System.out.println("END"); */

		//"홍길동" while문으로 10번 출력

		
/*		
		int count =1;
		while (true) {
			System.out.printf("%d - %s\n" ,count, "홍길동");

			if (count==10) {
				break;
			}
			count++; //를 if문 뒤에 두어야 10까지 찍힘(순서 바꾸면 9까지만 시킴)
						// or count를 이 윗줄에 두고 0부터 시작 (0~9 열번) or count==11
		}

		//구문 순서대로 어떻게 굴러가나 연필잡고 한번 때려봐야함 */
		
		
		
		//위엔 참고만 하고 이렇게 코딩할 것
		int count = 1;
		while (count<=10) {
			System.out.printf("%d - %s\n" ,count, "홍길동");
			count++;
		}
		

	}//main
}
