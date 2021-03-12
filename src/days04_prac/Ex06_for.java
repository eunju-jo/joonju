package days04_prac;

/**
 * @author 조은주
 * @date 2021. 3. 12 - 오전 3:05:22
 * @subject
 * @content for문 : 1-10 합계, 순서대로 찍기
 *
 */
public class Ex06_for {

	public static void main(String[] args) {
		// 1-10 합계 출력
		
		
		int sum =0;
		
		for (int i = 1; i <=10; i++) {
			sum +=i;
		}
		System.out.println(sum);
		
		
		
/*		//1-10 순서대로 찍어라
		
		int x = 1;
		
		for (int i = 1; i <= 10; i++) {
			if (i==10) {
				System.out.print(x);
			}
			if (i!=10) {
				System.out.print(x +", ");
			}
			x =i;

			//1, 1, 2, 3, 4, 5, 6, 7, 8, 9 아니 결과가 왜저래?????미쳤나봐
		}
	*/
		
		//1-10 순차적 찍기
	      for(int k=1;k<=10;k++)
	        { if (k==10) {
				System.out.println(k);
			}if (k!=10) {
	            System.out.print(k +", ");	
			}
	        }
	      
	      
	      //1-100 합계
	      int ssum = 0;
	        for(int i=1;i<=100;i++)
	        {
	            ssum=ssum+i;
	        }
	        System.out.println("1부터 100까지의 합은 "+sum+"입니다.");



//	출처: https://itpangpang.xyz/49 [ITPangPang]
		
	}

}
