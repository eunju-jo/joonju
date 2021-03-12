import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex10 {

/*	public static void main(String[] args) {
		int n,m;

		Scanner scanner = new Scanner(System.in);

		System.out.print(">n, m 입력? ");
		String pattern; = "\\s*,\\s* | \\s"; // |:or연산자
		scanner.useDelimiter(pattern); //이거치고 패턴 누르면 패턴패턴 생긴거에서 스트링으로 수정
		//콤마 구분자로 하려면? useDelimiter 2, 5, (이렇게일단 끝에도 ,)
		
		n= scanner.nextInt();
		m= scanner.nextInt();

		System.out.printf(">n%d, m=%d\n", n ,m);

		
		
		
	}//main */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 문자열 입력: ");
//		String message = scanner.next();
		String message = scanner.nextLine();
		System.out.println( message);
		
	}

}
