package days08;

public class Ex08 {
public static void main(String[] args) {
	
	int i = 5;
	
	while (i--!=0) {
		System.out.println(i + "- I can do it.");
	}
	
	
	//1. 후행 연산자라 i--에선 일단 5
	//2. i!=0 -> 5!=0 으로 비교
	//3. 이제 후행 -1 되서 4 - I can do it 으로 프린트!

	//결과
//	4- I can do it.
//	3- I can do it.
//	2- I can do it.
//	1- I can do it.
//	0- I can do it.

}
}
