package days11_night;

import java.io.IOException;
import java.util.Scanner;

public class Ex05_rerere {

	public static void main(String[] args) throws IOException {

		//입력계속 할지 물어보고 배열 부족하면 추가시키기
		
		int [] m = new int[3];
		int idx = 0; //m[idx] = scanner.int;
		char yn;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.printf("> [%d]번째 자리에 입력할 정수를 입력하세요: ", idx);
			
			if(idx == m.length) {
				int [] temp = new int[m.length+3];
				System.arraycopy(m, 0, temp, 0, m.length);
				m = temp;
			}
			m[idx++] = scanner.nextInt();
			System.out.println("> 계속 입력하시겠습니까? (y, n): ");
			yn = (char)System.in.read();
			System.in.skip(System.in.available());
			
		} while (Character.toUpperCase(yn) == 'Y');
		
		System.out.println("================");
	
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d] = %d\n", i , m[i]);
		}
	
	}

}
