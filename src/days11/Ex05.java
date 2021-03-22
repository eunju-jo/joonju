package days11;

import java.io.IOException;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) throws IOException {

		//189쪽 : 배열의 길이 변경하기
		Scanner scanner = new Scanner(System.in);
		int [] m = new int[3]; // [] [] []
		int idx = 0;
		char con = 'y';
		do {
			System.out.printf("[%d]번째 요소의 정수 값을 입력하세요:", idx);
	
			//배열의 방이 부족한지 여부를 체크해서 (방이 다 차면) 배열의 크기를 3개씩 증가시키겠다. 
			if( m.length == idx ) { //3번째 방 - [3] - 방이 부족해지는 순간
				int [] temp = new int[m.length+3];
				//배열 복사하는 for문
/*				for (int i = 0; i < m.length; i++) {
					temp[i] = m[i];
				} */
				System.arraycopy(m, 0, temp, 0, m.length); //Ex05_02 참고
				m=temp;
			}
			//방이 다찰 때마다 3개씩 늘리겠다.,하는 윗코딩이 중요함
			//하지만 	성능 떨어뜨리기 때문에 아예 첨부터 넉넉하게 잡는게 좋음
			
			m[idx++] = scanner.nextInt();
//			idx++; 위에 후위형으로 올림
			//
			System.out.print("\t >계속하시겠습니까?	");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)== 'Y');
		
		System.out.println("=======");
		
	 for (int i = 0; i < m.length; i++) {
		System.out.printf(">m[%d] = %d\n",i,m[i]);
	}
	
	 //배열을 [3]으로 잡아놔서 (0~2) 3번방(4번째) 에도 입력하면 오류떨어짐. 방 크기보다 크기 때문에
	 
	 
	}

	
	
}
