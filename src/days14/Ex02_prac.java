package days14;

public class Ex02_prac {

	public static void main(String[] args) {
//[수열]=등차수열. 항term(각 항목)	
// out 1 + 2 + 4 + 7 + 11 + 16 + 22+ ...?? = ??
// inc 1 2 3 4 5 씩 증가		
		
		//1+2+4+7+11+16+22+29+37+46+56+67+79+92+=469
		//이게 결과
		
//		1  1
//	 	2 +2   
//		4 +3   
//		7 +4   
//		i  j
//
		int out = 1;
		int inc = 1;
		int sum = 0;
		
		while (out<=100) {
		
			sum += out;
			System.out.print(out +"+");
			out += inc; //1+1=2 . 2+2=4 . 4+3=7
			inc++;
		}
		System.out.println("=" + sum);
		
	}//ma

}
