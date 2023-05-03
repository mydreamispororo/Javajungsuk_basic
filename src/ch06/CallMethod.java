package ch06;

class Cal {
	public void print() {
		System.out.println("KOREA IT ACADEMY");
	}
	
	public int sum(int x, int y) {
		return x + y;
	}
	
}

public class CallMethod {

	public static void main(String[] args) {
		//static메소드가 메소드를 호출할 때는 static
		//값을 누적할 때는 static ex) static int sum = 0;
		//static 키워드는 new를 써서 호출할 수 있지만, 클래스이름.메소드() 사용을 권장
				
		CallMethod.disp();
		System.out.println(CallMethod.add(100, 200));
		
		Cal c = new Cal();
		c.print();
		System.out.println(c.sum(100, 200));
		
		
		
		
	}
	
	//num1 + num2 = 
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	
	//disp
	public static void disp() {
		System.out.println("코리아아이티 아카데미");
	}
}
