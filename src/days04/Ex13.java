package days04;

/**
 * @author 조은주
 * @date 2021. 3. 11 - 오후 5:11:45
 * @subject 4일-13: for 반복문
 * @content
 *
 */
public class Ex13 {

	public static void main(String[] args) {

		//반복문 : for 문
		//반복규칙찾는게 제일 중요
		
		//for 컨.스페이스

		//체크되는 순서 [4] 후로는 [1] 빼고 계속 반복(거짓일때까지)
		//for( [1]초기식 ; [2]조건식 ; [4]증감식 ) { [3]수행문  }
		
		//for (int i = 1; i<=10; i++) 같음
		//조건식: 참 또는 거짓으로 판단되는. [2]에서 거짓이 되면 실행 전혀 안하고 빠져나옴
/*		for (int i = 0; i <10; i++) {
			System.out.println("홍길동" + i);
		} */
		

		int sum = 0;
		for (int i = 1; i <=10; i++) {
			if (i==10) {
				System.out.print(i);
			}
			if (i!=10) {
				System.out.print(i + "+");
			}
			sum +=i; //sum = sum+i;
		}
		System.out.println("=" + sum);
		
			}//main
}//class
