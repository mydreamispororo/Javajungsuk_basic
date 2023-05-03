package ch07;

class Members{
	//필드
	int num1;
	int num2;
	
	//메소드
	public void add(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
		System.out.println(this.num1 + this.num2);
	}
}

public class Field_Ex {

public static void main(String[] args) {
	Members m = new Members();
	m.add(10, 20);

}
}