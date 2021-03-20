package days10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex00 {

	public static void main(String[] args) {

		int [] lotto = new int[6];

		fillLotto(lotto);

		printLotto(lotto);


	}//main

	private static void printLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]",lotto[i]);
		}
		System.out.println();
	}

	private static void fillLotto(int[] lotto) {

		//0.0 <= Math.random()) < 1.0

		//lotto[idx]=n; 을 채우기 위해 idx랑 n 선언
		int idx = 0;
		int n;
		Random rnd = new Random();
		
		while (idx<=5) { //idx 증가시키면서 5번째방 채울 때까지 반복
			n = rnd.nextInt(45)+1;
			if(!isDuplicateLottoCheck(lotto, idx, n)) { //(isDupli가 not이면 if문 true되서 돌음)
			lotto[idx]=n;
			idx++;
			}
		}//while

	}//fillLotto
	
public static boolean isDuplicateLottoCheck(int [] lotto, int idx,int n) {
	for (int i = 0; i < idx; i++) {
		if(lotto[i] == n )return true; //중복이 되면 true
		//idx가 0일 때는 i<0 조건 어차피 안맞으니 실행안됨
		}
	return false;
}
	

}//class
