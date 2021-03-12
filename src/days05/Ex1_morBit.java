package days05;


public class Ex1_morBit {
	public static void main(String[] args) {

		//////////////////////////ex01파일보고 풀이 이해할라면 하고 아님말고;

//	    위의 정수가 메모리에 저장된 뒤에서 8~4 위치의 비트값을 출력하세요.
//	    [][][][][][][][] [][][][][][][][] [][][][][][][][] [*][*][*][*][][][][] 32비트
//	                                                                            별(*)표가 있는 위치의 비트값을 출력하세요.
	
		
		//i값 2진수로 -> 0001 0010 1101 0110 1000 0111
//		int mask = 0xF;
		
		
//		i = i>>4;
		
//		String bin = Integer.toBinaryString(i);
		
//		System.out.printf("X\n", i & mask);
		
//		숫자 10을 0010으로 출력하는거랑 똑같다고?

		
		
		
		int i  = 1234567;
		
		String strI = String.format("%32s", Integer.toBinaryString(i));
		
//		System.out.println(strI.replace(' ', '0'));
		
		//빈값은 쉬프트시 최상위 비트(맨앞에거로) 채워짐
//		i>>4
		
//		1111 -> 16진수F값
		
//		System.out.printf("%32s",Integer.toBinaryString(i));
		
		
		//" " -> 0 바꾸기 replace (a, b)
		
		//printf() f = format(출력서식)
		String msg = "hi~";
		System.out.printf(">> %s <<", msg);
		System.out.println();
		
		//내가 원하는 형식으로 변수에 저장하고 싶을 때 ***
		msg = String.format(">> %s <<", msg);
		
		System.out.println(msg);
		
//		System.out.println(Integer.toBinaryString(i & mask));
		}//main
}