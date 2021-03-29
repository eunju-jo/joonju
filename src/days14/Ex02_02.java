package days14;

public class Ex02_02 {

	public static void main(String[] args) {
		//골뱅이
		//대각선
		//순서도 그리는거 구글링해보기
		//1+2+3+..+ = ???              <=100
		
		//[수열]=등차수열. 항term(각 항목)	
		// out 1 + 2 + 4 + 7 + 11 + 16 + 22+ ...?? = ??
		// inc 1 2 3 4 5 씩 증가

//		1  1
//	 	2 +2   1+2 -1
//		4 +3   2+3 -1
//		7 +4   4+4 -1
//		i  j
		// i[1]= i[0] + j[1] -1 
//본인 생각으로 로직 만들어서 할 줄 알아야 함

		int sum = 0, out = 1, inc = 0; //증가치 j
		
		while ((out += inc++)<=100) {
			System.out.printf("%d+",out);	//1+
			sum += out;
		}
		System.out.printf("\b=%d\n",sum);
	//초기값 뭐 줬냐에 따라 달라지니 남이 한 것도 이해할줄 알아야 함 		
		
	}

}
