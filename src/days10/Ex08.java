package days10;

/**
 * @author 조은주
 * @date Mar 19, 2021 - 4:49:03 PM
 * @subject 메인함수의 매개변수 (String[] args)
 * @content
 *
 */
public class Ex08 {
	public static void main(String[] args) {

		//메인함수의 매개변수는 어디서 사용하나? 왜 있나. String[] args	
		//메인함수 언제 호출? java.exe Hello 실행
		if( args.length != 3 ) {
			System.out.println("매개변수가 없어 프로그램을 종료합니다."); //두개만 남기면 이렇게 뜸
			return; //함수를 빠져나가기 (break;=조건문을 빠져나가기)
		}

		for(int i = 0; i < args.length; i++){
			System.out.printf("args[%d]=%s\n", i, args[i]);
				}
		
		System.out.println("=end=");


		//package explorer에서 파일에 오른쪽마우스 - run as.. - run configuration 누르고 arguments 입력하면	
		//args[0]=hi
		//args[1]=hello
		//args[2]=안녕!
		//=end= 
		// 이렇게 출력됨!
	}
}  