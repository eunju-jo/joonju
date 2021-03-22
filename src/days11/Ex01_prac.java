package days11;

public class Ex01_prac {

	public static void main(String[] args) {

		//50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1
		// /5 /2 /5 /2 /5 /2
		int money = 125760;
		int unit = 50000;
		int count;
		boolean sw = false;
		while (unit>=1) {
			
			count = money / unit;
			System.out.printf("%d원권 : %d장\n" ,unit ,count);
			money = money % unit;
			if(!sw) unit = unit / 5;
			else unit = unit /2;
			sw = !sw;
		}
		
		
	}//main

}//class
