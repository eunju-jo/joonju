package days04;

import java.util.Scanner;

public class Fish {
public static void main(String[] args) {
	

	String input = "1 fish 2 fish red fish blue fish";
	Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
	//delimiter : 구분자(설정 안하면 기본=스페이스)
	//스캐너는 반드시 닫아야함.(밑에 s.close();가 관련문)

	System.out.println(s.nextInt());
	System.out.println(s.nextInt());
	System.out.println(s.next());
	System.out.println(s.next());

	s.close();
}
}