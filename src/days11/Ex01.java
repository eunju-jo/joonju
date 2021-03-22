package days11;

/**
 * @author 조은주
 * @date Mar 22, 2021 - 10:12:06 AM
 * @subject 아침문제 6-1	
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		//1-2+3-4+5-6+7-8+9-10=-5
		//홀- += 누적
		//짝+ -= 누적

//[1] 첫번째 방법		
/*		int sum = 0;	
		for (int i = 1; i <=10; i++) {
			if (i%2 != 0) {
				System.out.printf("%d-", i);
				sum += i;
			} else {
				System.out.printf("%d+", i);
				sum -= i;
			}
		}	
		System.out.printf("\b=%d\n",sum);
*/

//[2] 두번째 방법 (스위치 변수)- 각각 한번씩 돌아가면서 실행하도록
		
/*		int sum = 0;
		boolean sw = false; //트루 줘도 상관없음
		for (int i = 1; i <=10; i++) {
			if (!sw) { //sw == false랑 같은 말
				System.out.printf("%d-", i);
				sum += i;
				//sw = true;
			} else {
				System.out.printf("%d+", i);
				sum -= i;
				//sw = false;
			}
			sw = !sw; //현재 스위치 상태의 반대로 바꾸자 
			//위에 sw =true/false 각각 줘서 일일이 바꾸는거 보다 가독성 굿
		}	
*/		

		
//6-2. 1/2+2/3+3/4+... +8/9+ 9/10=???
		//분자i=1          9
		//분모 => i+1
		//i / i+1인데 (i+1)괄호 안치면 나누기 먼저 연산해서 잘못연산됨
		
		
/*		double sum = 0; //int 로 선언하면 값 제대로 안담김 
		for (int i = 1; i <=9; i++) {
			System.out.printf("%d/%d+",i,i+1);
			sum += (double) i/(i+1);
		}
		System.out.printf("\b=%f\n",sum);
		
*/
		
//7. 화폐 매수 구하기
//	    화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 50원, 10원, 5원, 1원
//	    입력) > 금액 입력 ? 125760
//		출력) > 5만원:2개, 1만원:2개, 5천원:1개..
		//금액을 50,-로 나눈 몫이 5만원 개수 --반복
		
		//몫 = money / 50000; //2
		//나머지 = money % 50000 = 25,760 --> /10000으로 계산
		//money = 나머지;

		//몫 = money / 10000; // 만원짜리 개수 2
		//나머지 = money % 10000;
		//money = 나머지; ------반복
		
/*		int []unit = { 50000, 10000, 5000, 1000, 500, 100, 50, 5, 1};
		int money;
		for (int i = 0; i < unit.length; i++) {
			int digit = money / unit[i];
			int mod = money % unit[i];
			money = mod;
		}
*/		
		int money = 125760;
		int unit = 50000;
		int cnt; 
		boolean sw = false ;//기본값이 false라 그냥 쓰는거
		
		//스위치 변수 사용해서 번갈아서 하도록
		while (unit>=1) {
			cnt = money / unit;
			System.out.printf("%d원 : %d개\n",unit, cnt);
			money %= unit; // money = money % unit;
			//if(!sw) unit = unit / 5; 
			//else unit = unit / 2; 
			unit /= ( sw ? 2: 5); //위ㅇㅔ거 삼항연산자로 	
			sw = !sw;
		}
		
/*		unit = unit / 5; //10000
		unit = unit / 2; //5000
		unit = unit / 5; //1000
		unit = unit / 2; //500 ....  */
		
	}//main

}//class
