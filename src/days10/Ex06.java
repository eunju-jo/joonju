package days10;

/**
 * @author 조은주
 * @date Mar 19, 2021 - 3:44:25 PM
 * @subject 178쪽 예제 : 각각 주석처리해보면서 결과 확인해보기
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		
		Loop1 : for (int i = 2; i <=9; i++) {
			for (int j = 1; j <=9; j++) {
				if(j>5)
					break Loop1;
//					break;
			System.out.println(i+"*"+j+"="+i*j);
			} //end of for i
			System.out.println();
		} //end of Loop1
		
	}

	
}
