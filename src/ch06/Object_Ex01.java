package ch06;

//Tv객체 생성 
class Tv {
	//필드 : 색깔, 전원켜기, 채널 위로, 아래로
	String colors;
	boolean power; //!power
	int channel;
	
	public Tv() {}
	
	public Tv(String colors) {
		this.colors = colors;
		
	}

	public void power() {
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
	
	
	
	
}

public class Object_Ex01 {

	public static void main(String[] args) {
		Tv t = new Tv();
		Tv t2 = new Tv("Red");
		
		t2.channel = 1;
		t2.channelUp();
		
		t2.channelDown();
		
		System.out.println("Tv 색상 : " + t2.colors);
		System.out.println("현재 채널 : " + t2.channel);
		
		
		
	}

}
