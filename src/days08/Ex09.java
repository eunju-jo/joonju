package days08;

import com.sun.javafx.binding.StringFormatter;

import javafx.scene.control.SplitPane.Divider;

/**
 * @author 조은주
 * @date Mar 17, 2021 - 4:37:35 PM
 * @subject 책 170쪽 
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {

//		int money = 231231;
		//          2+3+1+2+3+1 각 값으로 sum 저장하기
		String money = "231231";
//		System.out.println(money/100000);
//		System.out.println(money/10000);
//		System.out.println(money/1000);
//		System.out.println(money/100);
//		System.out.println(money/100);
//		System.out.println(money/10);

		int sum=0;
		for (int i = 0; i < money.length(); i++) {
		System.out.println(money.charAt(i));
		sum += money.charAt(i);
		System.out.println("sum: " + sum);
		}
		
		
		
	}//main

}
