package days11_night;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class Ex01_re {

	public static void main(String[] args) {

//		6-1. 1-2+3-4+5-6+7-8+9-10=-5 출력되도록 코딩하세요.
		
//		홀수-
//		짝수+

		
		//스위치 변수 사용없이 단순 코딩한 것
/*		
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			
			if(i%2 == 1) {
				System.out.printf("%d-", i);
				sum += i;
			}
			if(i%2 == 0) {
				System.out.printf("%d+", i);
				sum -=i;
			}
			
		}
		System.out.println("=" + sum);
													*/
		
		//스위치 사용
		
/*		int sum = 0;
		boolean sw = false;
		for (int i = 1; i <=10; i++) {
			if (!sw) {
				System.out.printf("%d - ", i);
				sum += i;
			} else {
				System.out.printf("%d + ",i);
				sum -= i;
			}
			sw = !sw;
			
		}
		System.out.println("= " + sum);
		
*/
		
		
		//6-2. 1/2+2/3+3/4+... +8/9+ 9/10=??? 출력되도록 코딩하세요. 
		
		double tot = 0;
		
		for (int i = 1; i <10; i++) {
				System.out.printf("%d/%d + ", i, i+1);
				tot += (double) i/(i+1);
			} 
		System.out.println("= " + tot);
		
		
		
		double sum = 0; //int 로 선언하면 값 제대로 안담김 
		for (int i = 1; i <=9; i++) {
			System.out.printf("%d/%d+",i,i+1);
			sum += (double) i/(i+1);
		}
		System.out.printf("\b=%f\n",sum);
		
		
		
		
		}
		
	}

