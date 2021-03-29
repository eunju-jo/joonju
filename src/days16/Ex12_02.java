package days16;

public class Ex12_02 {
	public static void main(String[] args) {

		MyPoint p1 = new MyPoint(1, 2);
		MyPoint p2 = new MyPoint(100, 200);
		
		p1.dispPoint();
		p2.dispPoint();
		
		p1.plusPoint(p2).dispPoint(); // 

		
	}
}
