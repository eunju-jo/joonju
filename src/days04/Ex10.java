package days04;

import java.util.Scanner;

/**
 * @author 조은주
 * @date 2021. 3. 11 - 오후 4:26:06
 * @subject 4일-10번: 세 정수를 받아서 최대값, 최소값 삼항연산자로 계산
 * @content Ex06 참고해서 작성
 *
 */
public class Ex10 {
	public static void main(String[] args) {

		//131p 예제 3-32 x값의 절대값을 구해서(absX)
		
/*	
 		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x=10;
		y=-5;
		z=0;
		
		//절대값 구하기
		absX = x>=0 ? x: -x; //x값이 양수면 그대로 두고 음수이면 양수로 만듦     
		absY = y>=0 ? y:- y;
		absZ = z>=0 ? z: -z;
		
		//삼항연산자의 중첩
		//x가 양수이면 +, [음수이면 -, 0이면 ' '(빈칸)]-중첩부분 해라
		signX = x>0 ? '+' :(x==0? ' ' : '-'); //x값이 음수이면 양수로 만듦     
		signY = y>0 ? '+':(y==0? ' ' : '-');
		signZ = z>0 ? '+': (z==0? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
																				*/
		
		
//문제: 세 정수 a b c를 입력해서 가장큰수, 가장작은수 구해서 출력

		int a, b, c;
		
		System.out.print(" > 세 정수를 입력하세요 ?");
		
		Scanner scanner = new Scanner(System.in);
		
		String value = scanner.next();
//		String [] values = value.split(",");
		String[] values = value.split("\\s*,\\s*");	
		 
		a = Integer.parseInt(values[0]) ;
		b = Integer.parseInt(values[1]); 
		c = Integer.parseInt(values[2]); 
		//ERR:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
		
		
		int max = a > b ?  a : (b>c? b : c); 
		int min = a > b ? b : (b>c? c : b);
		//a>b		b>c
		System.out.printf("> 가장 큰 값 : %d \n >가장 작은 값: %d \n", max, min);
		
	}
}
