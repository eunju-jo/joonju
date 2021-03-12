package days02;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오전 1:16:53
 * @subject 2일-함해보세영
 * @content 나열 순서에 따라 어떻게 출력되는지 확인.
 * 					문자열이 먼저 올 때, 숫자가 먼저 올 때에 따라 연산 방법이 달라지니 유의
 *
 */ 
public class StringEx {
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");		
		System.out.println(7 + "");
		System.out.println(" " +7);
		System.out.println(""+7);
		System.out.println("" +"");
		System.out.println();
		System.out.println(7 + 7 +""); // 숫자가 먼저오고 문자열 오면 덧셈 연산이 우선
		System.out.println(""+ 7 + 7); //문자열이 온후로 되면 연결해서 나열하는 연산이 우선
		
		/*마지막 두줄
		 * [결과값]
		 * 14
		 *	77
		 */
	}
}
