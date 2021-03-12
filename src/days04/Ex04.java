package days04; //days04 패키지(관련있는 클래스 묶어둔 것) 선언부

/**
 * @author 조은주
 * @date 2021. 3. 11 - 오후 12:20:07
 * @subject 4일-4번 : 단항 연산자 - 증감연산자: ++ --
 * @content 증감연산자  ++ --
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		//단항연산자 ++ -- [증감연산자] 93p
		//전위형과 후위형의 차이점 ***
		
		int x = 10;
		//기억공간 1 증가시키는 것 네가지 다 기억
		x = x+1;
		x +=1;  //+= 복합대입연산자
		x++; //후위형 증감연산자
		++x; //전위형 증감연산자
		
		// += 복합대입연산자 => 윗줄과 100% 똑같은 코딩. 
		//변수명이 길어지거나 한다면 훨씬 더 간결하고 짧은 코딩
		
		System.out.println(x);
		
		x = x-1;
		x -= 1;
		x--;
		--x;
		System.out.println(x);
		
		//어떤 기억공간의 값을 n만큼 증가
		int n = 10;
		x = x+n;
		x += n;
		
		x *= 10; //  x = x * 10
		x /= 10; //   x = x / 10
		
		
	}

}
