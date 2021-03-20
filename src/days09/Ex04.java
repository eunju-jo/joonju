package days09;

/**
 * @author 조은주
 * @date Mar 18, 2021 - 2:47:20 PM
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		//신용카드 넘버
		String card = "5423-1234-3333-4321";
		//               0    1   2     3 번방
		
		
		//랜덤하게 특정 위치의 4자리 카드번호가 ****로 출력되게 마스킹 처리
		//어떤 자리를 하든 일단 한자리 난수를 발생시켜서 가져오기
		//1~4가 아닌 0~3 사이의 난수 발생시킬 것.
		// 왜?--> 이따 split 기준으로 card 잘라서 배열에 넣을것이기 때문(배열 index=0부터 시작하니까 맞추려고)
		
		String [] cards = card.split("-"); // 넷씩 잘라서 cards 배열에 넣을 것임
//		System.out.println(cards[0]); //5423
	
		//cmd + shift + b 브랙포인트 켜는 단축키
		//토글(toggle): Breakpoint [cmd + f11]로 	디버그 실행
		//토글은 저기서 멈춰라. 브렉포인트=중단점
		//왜 오류가 났는지 브렉포인트에서 확인할거임 (이제 연필안쥐고,,)	
		//디버그에서 나갈때 오른쪽 위에 벌레에서 J로 바꿔줘야 됨
		
		//0~3 난수만들어서 별로 바꿀거임
		int idx = (int)(Math.random()*4); //idx = 별로 바꿀 위치값
		cards[idx] = "****";
//		System.out.println(idx); //0~3 사이 숫자 반환
		
		//무식한 코딩,,
//		System.out.printf("%s-%s-%s-%s\n",cards[0], cards[1], cards[2], cards[3]);

		//String 클래스에 join() 메서드(암기)
		//String.join("-", cards); // card라는 배열을 -로 쪼인하겠다 . 위에 주루룩 쓴거 내용
		
		String changeCard = String.join("-", cards); //쪼인한거 반환하기 위한 코딩
		System.out.println(changeCard);
		
		//System.out.println("<li>" + String.join("</li></li>", cards));
		//나중에 검은 점 리스트로 웹 표시되는 방법
		
		
	}//main

}//class
