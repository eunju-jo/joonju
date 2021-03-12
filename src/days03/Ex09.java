package days03;

/**
 * @author 조은주
 * @date 2021. 3. 10 - 오후 4:13:05
 * @subject 3일-9번: 논리연산자
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {

//		1.  일반 논리 연산자  
//	    ㄱ. 일반 논리 AND 연산자 - && (논리곱 연산자) (1x1만 1이니까)
//
//	: '둘다 참일 때'만 참이 나옴.  
//	true && true =>true  
//	true && false =>false  
//	false && false =>false  
//	false && true =>false
//

System.out.println( 13<5 && 15>4); //false
//각 연산에 굳이 ()안해도 된다는건 논리연산자가 비교보다 우선순위가 낮다는 뜻

//
//	ㄴ. 일반 논리 OR 논리 연산자 - || (논리합 연산자)
//
//	: '둘 중 하나라도 참'일 때 참  
//	true && true =>true  
//	true && false =>true  
//	false && false =>true  
//	false && true =>false
//
	System.out.println( 13>5 || 15<4); //true
//
//	ㄷ. 부정(NOT) 연산자 - !  
//	not 붙여서 반대로 바꾸거나 부정해서 연산에 사용하겠다
//
//	!true = false  
//	!false = true
//
//	2.  비트 논리 연산자  
//	    ㄱ. 비트논리 AND 연산자 - &  
//
//	System.out.println(10 & 5);
//
//	10 이진수로 = 0000 1010  
//	4  이진수로 = 0000 0100  
//	                 0000 0000
//
//	ㄴ. 비트논리 OR 연산자 - |  
	System.out.println(10 | 5);  
//
//	10 이진수로 = 0000 1010  
//	4 이진수로 = 0000 0100  
//	                0000 1110
//
//	ㄷ. 비트 부정 연산자 - ~ (틸드 연산자)  
	System.out.println(~10); //\[결과\] -11  
//
//	// ~0000 1010  
//	\*\* 1111 0101\*\* ->이거에 2의 보수법  
//	\=> -11  
//
//	#### 효율적인 연산(short circuit evaluation) 의미
//	: 짧게 회로(노선)를 평가하는 것. 하나만 참이면 되는 연산이라면 앞의 값에서 판단이 서면 뒤의 값은 계산하지 않음.
//
	System.out.println( 13<5 && 15>4); //false  
//
//	\-> 둘다 참이어야 하는데 앞이 거짓이면 뒤에 연산안하고(처리 자체가 안됨) 넘어감 ★
//
//
//	ㄹ. XOR 연산자 - ^
//
//	eXclusive OR 연산자(XOR)여서 비트논리에만 있어서 비트 굳이 안씀  
//	exclusive = 배타적인.  
//	0,1 두 값이 '서로 다를 때' 참이다.
//	
	}

}
