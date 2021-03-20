package days10;

import java.util.Scanner;

/**
 * @author 조은주
 * @date Mar 20, 2021 - 8:57:30 PM
 * @subject 카드 번호 입력받기(getCard); 입력받은값이 맞는지 확인받기(checkCard);
 * @content
 *
 */
public class Re_Ex01_checkCard {
	public static void main(String[] args) {

		String card = getCard();
		checkCard(card);
		

	}//main
	
	private static void checkCard(String card) {
		char yn = 'a';
		do {
			System.out.print(card + " 이 번호가 맞습니까? (y/n) : ");
			Scanner scanner = new Scanner(System.in);
			yn = scanner.next().charAt(0);
			if(yn =='y' || yn == 'Y') System.out.println("본 카드번호로 저장되었습니다.");
			else if(yn == 'n' || yn == 'N') {
				System.out.println("그럼요?");
				getCard();
			}
			else {
				System.out.println("y 나 n 중에서 입력해주세요.");
				checkCard(card);
			}
			
		} while (yn =='n' || yn == 'N');
	}


	private static String getCard() {
		Scanner scanner = new Scanner(System.in);
		String card;
		boolean flag = false;
		String regex = "\\d{4}-\\d{4}-\\d{4}-\\d{4}";
		do {
			if(flag)System.out.println("\n" + "*양식 오류. 다시 입력하세요*"); 
			//if(flag)를 붙인건 다시 입력하라는 문장을 두번째 돌때만 실행시키고 싶은데,,에서 출발한것임
			//맨처음 돌때는 처음 선언한것처럼 flag=false니까 실행하지 않음 _if문은 ()내용이 true여야 실행하니까
			//다음 돌 때는 (상황:while-잘못입력을 했고)(코딩:flag가 true여야 저 문장을 실행하는데)
			//[[flag가 트루다 = !card.matches(regex) = 양식에 맞지 않게 입력을 했다]]
			//do {}맨 끝에 flag = true;로 줘서 다음에 돌 때 저걸 띄우도록 설정을 해도 되지만
			// (다음 또 돈다는건 while()조건인 '양식에 맞게 입력하지 않았다 = flag' 가 선행되는 것)
			//간결성을 위해서 while에 있는 !card.matches(regex)를 flag에 대입시켜서 문장을 줄이고 쓴게 이거!

			System.out.print("카드번호를 입력하세요 (예:5462-3312-4021-1154) : ");
			card = scanner.nextLine();
			
		} while (flag=!card.matches(regex));
		
		return card;
	}



}//class
