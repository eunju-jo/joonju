package days10;

/**
 * @author 조은주
 * @date Mar 19, 2021 - 3:42:38 PM
 * @subject break문 개념 다시 확인
 * @content
 *
 */
public class Ex05 {

	public static void main(String[] args) {
//구구단 가로 출력 
		
	OUT:
	for (int i = 2; i <=9; i++) {
		for (int j = 1; j <=9; j++) {
			System.out.printf(" [%02d * %02d = %02d] ", i, j, i*j);
			if(j == 5) break OUT; //##기본 break문: 가장 가까운 조건문을 break함(j for문)	
			//OUT: 붙이면 바깥 라벨한데까지 끝나서 2절x5 출력되고 끝
		}
		System.out.println();
	}
		
		
	}

}
