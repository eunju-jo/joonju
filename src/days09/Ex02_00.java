package days09;

/**
 * @author 조은주
 * @date Mar 18, 2021 - 11:23:08 AM
 * @subject 9일 : 로또번호 만들어서 배열 생성하기
 * @content
 *
 */
public class Ex02_00 {

	public static void main(String[] args) {

		
		// 로또번호 발생시킴 -> 배열에 추가 -> 인쇄하듯 출력
		//1-45개 정수 중 양수 6개를 뽑는 것 (6/45)
		
		int [] lotto = new int[6]; //선언만 하면 기본값(초기값) 0
		
		//로또 번호 중복된게 나올 수 있음. 그래서 중복제거를 저 메서드에서 할거임 ((이 함수가 중요))
		//[32][22][41][41][04][25]
		fillLotto(lotto);
		
		//출력하는 함수 (그냥 단순프린트 작업)
		printLotto(lotto);
		
		
		
	}//main

	private static void printLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%02d]", lotto[i]);
		}
		System.out.println();
	}

	// [12][0][0][0][0][0]
	//  	^ 몇번방 채울지 오른쪽으로 이동
	
	//1~45 임의의 수(난수)를 lotto 배열에 채워넣는 메서드(함수)	
	//중복제거를 위해 lotto[n]번째 값이 lotto[1~(n-1)]값과 같지 않은지 확인하고! 넣어야 함
	private static void fillLotto(int[] lotto) {
			
		//밑에 세줄 while문 안에 넣어도 무방
		int n = (int)(Math.random()*45 +1); //1-45사이의 숫자 랜덤으로 n에 넣겠다
		System.out.println(n); //출력 확인
		lotto[0] = n; //lotto[0] = 중복확인안해도 되니 랜덤하게 받은 n값 그대로 쓰겠다
		
		//lotto[1] ~ lotto[5] 처리
		int idx = 1; //lotto 1번째 방부터 하면 됨(0번째방은 그전 데이터 확인할 필요 없으니까)
		//조건: (이전데이터랑 중복되지 않게) 5번째방을 채울 때까진 반복
			
		boolean flag = false; //중복이 되지 '않는다'는 뜻으로 false 줌.(중복아님)	
		
		while (idx <=5) { //몇번만에 할지는 모르지만 idx<=5 동안 채우는거 -->for문 안에 i<idx조건
			flag = false; //돌때마다 폴스로 초기화. 이거(돌때마다	 되도록) 초기화 해놔야 에러안남** 
			n = (int)(Math.random()*45 +1); //중복이 안된다? n은 내가 랜덤으로 줄거얌
			System.out.println(n);
			
			//로또번호 이전번호랑 중복체크
			for (int i = 0; i < idx; i++) { //
				if(n==lotto[i]) {
					flag=true; // 중복이 '된다'(true) -> for문 나가라??
					break;
				}
			}
			
			if(!flag){			//(중복되지 않으면)
			lotto[idx]=n;
			idx++;
			}
				//중복체크 여기서 하지말고 위에서 체크하고 집어넣는게 나음
			
		}//while	
		
	
}//class
}