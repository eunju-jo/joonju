package days08;

/**
 * @author 조은주
 * @date Mar 17, 2021 - 4:16:50 PM
 * @subject [1,1] 찍어서 형태 확인 	
 * @content
 *
 */
public class Ex06 {
	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {//행row 개수
			for (int j = 1; j <=5; j++) {//열col(column)개
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}

	
	}
}
