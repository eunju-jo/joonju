package days14;

public class Ex03_prac {

	public static void main(String[] args) {
		//1+1+2+3+5+8+13+21.. ==?
		//앞 두개의 합이 다음수
		//항의 갯수가 15개까지의 합

		//규칙1. 첫번째항, 두번째항은 각각 1로 정해져있음.(fixed)
		//		이를 기준으로해 3번째항부터 출력	
		
//		i-1 + i-2 = i.
				
		int [] m = new int[15];
		int sum = 0;

		m[0] = m[1] = 1;
		int cnt = 2;
		int rr =0;
		while (cnt <15) {
			m[cnt] = m[cnt-1] + m[cnt-2];
			cnt++;
		}
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[rr++]+"+");
			sum += m[i];
		}
		System.out.println("="+sum);

//1+1+2+3+5+8+13+21+34+55+89+144+233+377+610+=1596
	}

}
