package days14;

public class Ex03 {

	public static void main(String[] args) {
		//1+1+2+3+5+8+13+21.. ==?
		//앞 두개의 합이 다음수
		//항의 갯수가 15개까지의 합

		//규칙1. 첫번째항, 두번째항은 각각 1로 정해져있음.(fixed)
		//		이를 기준으로해 3번째항부터 출력		

		int [] m = new int[15];
		m[0] = m[1] = 1;
		
		for (int i = 2; i < m.length; i++) {
			m[i] = m[i-1]+m[i-2];
		}
		
		int sum = 0; //위에 포문에 합쳐서 썸해도 됨
		for (int i = 0; i < m.length; i++) {
			sum += m[i];
			System.out.printf("%d+",m[i]);
		}
		System.out.printf("\b=%d\n", sum);
		
		
		
		
/*		int first = 1;
		int out = 0;
		int sum= 1;
		int cnt = 0;
		System.out.println(sum += first); //1
		while (cnt<=14) {
			int w = sum+out; //1+1=2
			System.out.println(w);
			sum++; cnt++;
//first 	out	// sum //outbefore
//1	    	1		2		2
//			2		3       
//					5
		}
 */
		
		
	}

}
