package days04_prac;

public class Ex06 {
	public static void main(String[] args) {
		//for문

//		1~10 합계 출력
		
		int sum = 0;
		
		for (int i = 1; i <=10; i++) {
			if (i==10) {
				System.out.print(i);
			}
			if (i!=10) {
				System.out.print(i +"+");
			}
			sum += i;
		}
		System.out.print(" = " + sum);

	}
}
