package days11_night;

import java.io.IOException;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Ex05_re {

	public static void main(String[] args) throws IOException {
		//189쪽 : 배열의 길이 변경하기
		//배열의 방이 부족한지 여부를 체크해서 (방이 다 차면) 배열의 크기를 3개씩 증가시키겠다. 
	
		int [] m = new int[3];
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		char con = 'y';
		
		do {
			System.out.printf("[%d]번째 요소의 정수 값을 입력하세요. ", idx);

			if (m.length == idx) {
				int [] temp = new int[m.length+3];
				
				System.arraycopy(m, 0, temp, 0, m.length);
				m = temp;
			}
			m[idx++] = sc.nextInt();
			System.out.println("\t >계속하시겠습니까? : ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
		
		System.out.println("==============");
		
		for (int i = 0; i < m.length; i++) {
			System.out.printf(">m[%d] = %d\n", i, m[i]);
		}
		
	}

}
