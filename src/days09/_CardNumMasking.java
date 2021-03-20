package days09;

/**
 * @author 조은주
 * @date Mar 18, 2021 - 11:27:35 PM
 * @subject 카드번호 "5423-1234-3333-4321" 중 4자리씩 랜덤으로 마스킹하기	
 * @content Ex04
 *
 */
public class _CardNumMasking {

	public static void main(String[] args) {
		
		String card = "5423-1234-3333-4321";
		String [] cards = card.split("-"); // 넷씩 잘라서 cards 배열에 넣을 것임 cards[0]~ cards[3]
		//System.out.println(cards[0])   == "5423"

		//cards 배열의 첨자값과 같은 0~3사이의 난수만들어서 *로 초기화 할것임
		int idx = (int)(Math.random()*4); //idx = 별로 바꿀 위치값(0~3사이)
		cards[idx] = "****";

		String changeCard = String.join("-", cards); //쪼인한거 반환하기 위한 코딩
		System.out.println(changeCard);
		//결과: 5423-1234-3333-4321

	}

}
