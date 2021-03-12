package days03;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오후 3:00:22
 * @subject 3일-5번: 산술 오버플로우
 * @content 정석 p63 '정수형의 선택기준'
 *
 */
public class Ex05 {
	public static void main(String[] args) {

//		byte b = 130;
		//ERR:Type mismatch: cannot convert from [int] to byte

		int i = Integer.MAX_VALUE;
		int j = 100;
		
		long l =(long) i + j; 
			//대입연산자: 우측항 먼저 연산. int+int = int : 넘친 int 값을 long에 담아봤자 애초에 잘못된 값..
			//이럴 때 i나 j를 강제형변환 long+int = long
		
			/*(long)(i+j)랑 (long) i +j 차이
			->전자는 (i+j)를 우선 처리 후 long 캐스팅하는것이므로
			 잘못되버린 값에 캐스팅하는 것. long 씌워도 의미없게 됨 */
		
		System.out.printf("%d + %d = %d \n", i, j, l);
	
		//2147483647 + 100 = -2147483549 
		//표현범주 넘치니(오버플로우) 음수가 나와버림..
		//오버플로우든 언더플로우든 에러가 나는게 아니고 잘못된 값이 나와버림
		
	}
}
