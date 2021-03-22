package days11_night;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex05_rere {

	public static void main(String[] args) throws IOException {

		//배열의 방이 부족한지 여부를 체크해서 (방이 다 차면) 배열의 크기를 3개씩 증가시키겠다. 
		
		int [] m = new int[3];
		Scanner scanner = new Scanner(System.in);
		int idx = 0;
		char yn ;
		
		do {
			System.out.printf("[%d]번째 자리에 들어갈 정수를 입력하세요. : ", idx);
			
			if(idx == m.length) {
				int [] temp = new int[m.length+3];
				System.arraycopy(m, 0, temp, 0, m.length);
				m = temp;
			}
			m[idx++]=scanner.nextInt();
			System.out.println("> 계속 입력하시겠습니까?(y, n): ");
			yn = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(yn) == 'Y');
		
		System.out.println("=============");
		
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d] = %d\n", i, m[i]);
		}
		
		
		
	}//main

}//class
