package days11_night;

public class Ex01_re_money {

	public static void main(String[] args) {
		//7. 화폐 매수 구하기
		//	    화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 50원, 10원, 5원, 1원
		//	    입력) > 금액 입력 ? 125760
		//		출력) > 5만원:2개, 1만원:2개, 5천원:1개..

		// /5 /2 /5 /2 /5 /2


		/*		int money = 125760;
		int unit = 50000;
		int count;
		int plusA;
		//		money / unit = 몫 == 5만원 개수
		//		money % unit = 나머지 25760원
		//		나머지 = money;
		boolean sw = false;
		for (int i = 1; i <=10; i++) {
				count = money / unit ;
				System.out.printf("%d원 : %d매\n", unit, count);
				plusA = money % unit ;
				money = plusA;
				sw = !sw;
				unit /= (sw ? 5 : 2);

			}

		 */ //다시 연습 아래에		


		//7. 화폐 매수 구하기
		//	    화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 50원, 10원, 5원, 1원
		//	    입력) > 금액 입력 ? 125760
		//		출력) > 5만원:2개, 1만원:2개, 5천원:1개..



		int money = 125760;
		int unit = 50000;
		int count;
		int plusA = money % unit;
		boolean sw = false;

		for (int i = 0; i <10; i++) {
			
				count = money / unit; 
				System.out.printf("%d원 : %d매\n", unit, count);
				money %=unit;
				sw = !sw;
				unit /= sw? 5 : 2; //이 부분 빼고 다 동일하니 삼항연산자 처리해서 if문 아웃

				
				//아래 코딩을 축약한게 위 형태
/*			if(!sw){
				count = money / unit; 
				System.out.printf("%d원 : %d매\n", unit, count);
				money %=unit; // money = plusA(나머지) = money % unit  --> money = money % unit
				unit /= 5;
				} else {
				count = money / unit; 
				System.out.printf("%d원 : %d매\n", unit, count);
				money %=unit;
				unit /= 2;
				}
				sw = !sw;
*/
		}
				
				
		}

	}

}

