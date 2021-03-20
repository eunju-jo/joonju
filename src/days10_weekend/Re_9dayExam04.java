package days10_weekend;

import java.util.Scanner;

public class Re_9dayExam04 {

	public static void main(String[] args) {
//		4. 카드 번호를 입력받아 
//	    예)  String card ="7655-8988-9234-5677";
//	    유효성 검사를 한 후 
//	    임의의 자리 4자리를 **** 로 출력하는 코딩을 하세요.
		
		String card = " ";
		card = getCard(card);
		
		System.out.println(maskingCard(card));
		
		
	}//main

	private static String maskingCard(String card) {
		String [] cards = card.split("-");
		int idx = (int)(Math.random()*4);
		cards[idx] ="****";
		
		String changedCard = String.join("-", cards);
		
		return changedCard;
	}
	

	private static String getCard(String card) {
		Scanner scanner = new Scanner(System.in);
		String regex = "\\d{4}-\\d{4}-\\d{4}-\\d{4}";
		boolean flag = false;
		
		do {
			if(flag) System.out.println("** 입력 양식 오류. 다시 입력하세요 **");
			System.out.println("카드 넘버를 입력하세요(예:5415-2421-4415-5553) : ");
			card = scanner.nextLine();
			
		} while (flag = !card.matches(regex));
		
		
		
		return card;
	}

}//class
