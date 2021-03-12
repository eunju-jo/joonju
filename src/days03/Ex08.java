package days03;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오후 4:06:44
 * @subject 3일-8번: 
 * @content
 *
 */
public class Ex08 {
	public static void main(String[] args) {

		
//		비교 연산자 : 결과값으로 boolean. true or false
//		> < >= <=      ==  !=
		
		System.out.println(4 > 5); 
		System.out.println(4 < 5); //true
		System.out.println(4 >= 5);
		System.out.println(4 <= 5); //true
		
		System.out.println(4 == 5); //주의   ==
		//급히 치다보면 두 수가 같냐고 했는데 =칠수도 있음
		//System.out.println(4 = 5); 
		//ERR: The left-hand side of an assignment must be a variable
		//왼쪽편은 변수여야 한다. 대입연산자이기 때문에 우측항을 왼쪽항에 저장하려면 변수가 있어야 함
		System.out.println(4 != 5); // 주의   !=  (=!아님)
	}
}
