package days05;

/**
 * @author 조은주
 * @date 2021. 3. 12 - 오전 11:28:27
 * @subject 1+2+3+..10 = 55 에서 + 찍는거 더 간편한 방법
 * @content
 *
 */
public class Ex01_plus2 {
public static void main(String[] args) {
	

	//		  1+2+3+4+5+6+7+8+9+10=55 출력

	int sum = 0, i =1;
/*
	for (int i = 10; i >=1; i--) {
	
		System.out.println(i);
		sum +=i;
		
	}
	
	*/
	
		//for문 무한루프 하고 싶다면 ( ; ; ) ->빈칸으로 (엄밀히말하면 가운데 조건식만 비우면됨. 다른거 안비워도 ㄱㅊ)
		//이렇게 되면 ERR: Unreachable code (맨밑에 sum 계산 못하니까)
		//초기식자리 생략가능(위에 변수 선언했다면), 증감식도 안쓰고 for 안에 써도됨
/*	for (; i <=10; i++) {
		System.out.printf("%d" ,i);
		sum += i; 
	}*/

	//에러에서 duplicate local variable : duplicate(중 복 이 다 / 이미 선언한거 또 선언했으니 그 변수 선언했는지 봐라)
	
	//for 문 초기화 문장에 여러 변수 선언해도 문제 안됨(int i = 1, sum=0, x=100; i<=10; i++,i+=5)
	//안에 선언할 때랑 밖에 선언할 때 차이점? : for문 안에서만 사용가능한 '지역변수' 밖에서 (아래라면 j) print 못함
	//for문도 한줄이면 { } 생략 가능 (if문 처럼)
	for (int j = 0; j < 11; j++) {
		System.out.printf("%d+",j);
	}
	
		System.out.printf("\b=%d\n", sum); 
	
	
	
	
}//main
}
