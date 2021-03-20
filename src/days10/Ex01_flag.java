package days10;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 19, 2021 - 10:38:41 AM
 * @subject flag 설명 (카드번호 마스킹)	
 * @content
 *
 */
public class Ex01_flag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String card = getCard();
		System.out.println(" = End =");
		
	}//main

	public static String getCard() {

		String card;
		String regex = "\\d{4}-\\d{4}-\\d{4}-\\d{4}";
		Scanner scanner = new Scanner(System.in);
		boolean flag = false; 
		do {
			if(flag) System.out.println("[다시 입력]"); //1. 처음돌땐 이게 안나왔음 좋겠음
			//ㄴ> 2. 만약에 flag = true일 때만 찍어라라고 하고 싶은데 어디서 만들까 고민해보니 while()	 칸이 좋겠음
			System.out.println(">카드번호 입력: ");
			card = scanner.nextLine();
			//3. flag = true; 이거를 여기 쓰는거랑 밑에 'flag =' 여기다가 쓰는거랑 같은거
		} while (flag = !card.matches(regex));//false에다가 not 하니까 true  __ 2.를 위한 것
		//true로 만들건데 그거를 flag 에 담겠다
		//양식에 일치하면 반복할 필요 없으니 일치하지 않을 때 반복하도록
		//일치하지 않으면 반복하겠다!!!!
		
		//그치,, 치라고 했는데 맞게 치면은 card 리턴하고 나가면 되는데
		//틀리게 쳤으니 다시랑 입력 다시 띄워야 하는 것. 그래서 정규표현식에 일치하지 않는 동안 while식 반복하는 것
		
		return card;
	}

}//class
