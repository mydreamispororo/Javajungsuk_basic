package ch02;

public class Swap_Ex {

	public static void main(String[] args) {
		//swap 임시 변수 필요 = tmp
		//두 숫자를 변수에 담아 서로 바꾸기
		//num1 = 10 num2 = 5 -> num1 = 10 num = 5
		
		int x, y;
		x = 10;
		y = 5;
		System.out.println(x);
		System.out.println(y);
		
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println(x);
		System.out.println(y);
		
		
		
		
		

	}

}
