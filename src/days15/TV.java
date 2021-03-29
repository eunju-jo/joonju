package days15;

public class TV {

	//필드
	public String color = "red";
	public boolean power;
	public int channel = 10;
	
	//메서드
	//필드, 메서드 같은 이름 쓸 수는 있으나 안쓰는게 더 좋은 코딩 
	
	
	public void power() {
		power = !power;
	}
	
	//alt + shift + s  --- 맥에서 cmd + shift + /해서 검색
	// generate 쳐서 using field클릭 -> 자동완성
	public TV(String color, boolean power, int channel) {
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	//super~에서
	public TV() {
	}

	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
	
	
	
}
