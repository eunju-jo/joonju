package days14;

public class Ex02 {

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

		int sum = 0; //각 항의 합
		int out = 1; //화면에뿌릴 번호 i
		int inc = 1; //증가치 j
		
		while (out<=100) {
			System.out.printf("%d+",out);	//1+
			sum += out;
//			out = out + inc; //1+1=2
//			inc++; 아래 한줄로 축약
			out += inc++;
		}
		System.out.printf("\b=%d\n",sum);
		
		
		
//		int [] i = new int[20];
//		int [] j= {1,2,3,4,5,6,7,8,9,10};
//		int idx = 0;
//		int sum = 0;
//		while (sum<= 100) { 일단 idx<=100이었어야 함
//			i[idx] = 1;
//			i[idx+1] = (i[idx] + j[1]) - 1; 
//			System.out.println(i + "+");
//			sum += i[idx];
//		}
		
	}

}
