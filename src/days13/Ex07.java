package days13;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 24, 2021 - 4:44:50 PM
 * @subject 07_02 내가 하려던거 디버그해보기
 * @content 근본이 잘못됐다.. m.length 개념 이해하면 되었
 *			m.length가 적용되서 출력할 메인부분을 건드려야 하는데 선언된 함수부분 온갖군데에 lotto[][]를 넣어서 온갖 에러 발생
 *			java.lang.ArrayIndexOutOfBoundsException: 3
 */
public class Ex07 {
	public static void main(String[] args) {

		//로또번호 내가 원하는 게임 횟수만큼 찍겠다
		//3* 6
		//[게임횟수][6]게임횟수를 유동적으로 두면 됨
		//문제 게임횟수 입력받아서 게임횟수만큼 로또 번호 난수 출력되도록
		
		System.out.println(">출력을 원하는 로또 개수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);

		int wants = scanner.nextInt();
		int [][] lotto = new int[wants][6];
		
		fillLotto(lotto, wants);
		printLotto(lotto, wants);

		
	}
	private static void printLotto(int[][] lotto, int wants) {
		for (int j = 0; j < lotto.length; j++) {
			for (int i = 0; i < lotto.length; i++) {
				System.out.printf("[%02d]", lotto[wants][i]);
			}
			System.out.println();
		}
	}

	private static void fillLotto(int[][] lotto, int wants) {
			
			int n, idx = 0; //1번째 방부터 하면 됨(0번째방은 그전 데이터 확인할 필요 없으니까)
			int m = 0;
			
			while (idx <=5 && m <=lotto.length) { //몇번만에 할지는 모르지만 idx<=5 동안 채우는거
				n = (int)(Math.random()*45 +1);
				if(! isDuplicateLottoCheck(lotto, idx, n, wants)) { 
						lotto[m][idx] = n; 
						idx++; 
						if(idx == 5) m++;
						
					}
				
			}//while	
			
		
			
		}	
	public static boolean isDuplicateLottoCheck(int [][] lotto, int idx, int n, int wants) {
		for (int i = 0; i < idx; i++) {
			if(lotto[wants][i] == n )return true;
		}
		return false;
	}
	
}
