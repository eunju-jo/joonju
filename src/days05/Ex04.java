package days05;

/**
 * @author 조은주
 * @date 2021. 3. 12 - 오후 2:11:02
 * @subject 중요하니 꼭 제대로 이해, 복습하기(위에 ()랑 밑에 찍히는 거랑 다르게 쓴다는거)
 * @content
 *
 */
public class Ex04 {
public static void main(String[] args) {
	//1+2+..+10=55 while문 

	//while (조건)에 i++이 들어간다면?
	//2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + =0 이렇게 나옴
	//어떻게 수정?
	
	//while 조건식 체크할 때: 증가된 후 비교할지, 증가되기 전 비교할지 전위/후위형에 따라 다름

	int i = 0, sum =0;
	//다른 개발자가 여기 ()에 코딩 저렇게 많이함..그래서 알아야함
	//멍청이 같다고 생각하지말고,, 증감연산자 코딩 많이 해봐야 적응됨
	while (i++<10) { //i=1       1<=10 일까 0<=10일까 여기는 [0<=10]
		
		sum += i; 
//		sum +=++i; -> 결과 65나옴 (잘못된값)

		
		System.out.printf("%d + ", i);

		//위처럼 해도 sum+=i; i++; 이랑 동일한 값
		
		//i++;
	} System.out.printf("\b=%d\n", sum);
	
	//int =0 ~ while (++i<=10) { //i=1       1<=10 일까 0<=10일까 여기는 [1<=10]
	//위에식 비교할 때랑 밑에 막상 찍히는 값이랑 다르다는거 이해(폰 녹화 다시 보기)
	
}//main
}
