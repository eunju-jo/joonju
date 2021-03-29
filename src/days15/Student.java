package days15;

//학생 클래스 선언
public class Student {

	//필드
	public String name;
	public int no;
	public int kor, eng, mat; //private으로 만들어서 수업진행했음 
	public int tot;
	public int rank;
	public int wrank;
	public double avg;

	//메서드
	public void printSungjuk() { //학생정보 출력
	      System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
	            ,no, name, kor,  eng, mat, tot,avg, rank);
	}
	

	public int getKor() {
		return kor;
	}

	// 이렇게 넣어버리면 더 좋은 설계도면이 됨
	public void setKor(int kor) {
		
		if(0<=kor && kor <= 100) {
			this.setKor(101);
		} else {
			System.out.println("국어 점수 범위 벗어남");
			return;
		}	

	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}
	
	
}

