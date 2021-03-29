package days14;

public class Ex03_02 {

	public static void main(String[] args) {
		//1+1+2+3+5+8+13+21.. ==?
		//앞 두개의 합이 다음수 (피보나치 수열)	
		//항의 갯수가 15개까지의 합

		//규칙1. 첫번째항, 두번째항은 각각 1로 정해져있음.(fixed)
		//		이를 기준으로해 3번째항부터 출력		

		int f = 1, s = 1, t; //first,second	
		System.out.printf("%d+%d+",f,s);
		int sum = f + s;
		int cnt = 2;
		
		while (cnt <15) { //cnt<=15하면 왜 16번 도는지??
			t = f + s;
			System.out.printf("%d+" , t);
			sum += t;
			cnt++; //2가 돌고 +2// 올라갈 때 cnt3
			f = s;
			s = t;
		}
		
		System.out.printf("\b=%d\n", sum);
	}
	

}
