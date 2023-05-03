package ch06;

import java.util.Scanner;

class Cals {
	public int sum(int x, int y) {
		return x + y;
	}
	
	public int sub(int x, int y) {
		return x - y;
	}
	
	public int mul(int x, int y) {
		return x * y;
	}
	
	public double div(int x, int y) {
		return x / (double) y;
	}
	
	public void disp(int x, int y) {
		System.out.println(sum(x, y)); 
		System.out.println(sub(x, y)); 
		System.out.println(mul(x, y)); 
		System.out.println(div(x, y)); 
	}

}

public class Cals_Ex {

	public static void main(String[] args) {
		//객체 이용해서 사칙 연산 프로그램을 작성하시오 + - * /
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========== 사칙연산 프로그램 ==========");
		Cals cal = new Cals();
		
		System.out.print("값1 > ");
		int x = sc.nextInt();
		System.out.print("값2 > ");
		int y = sc.nextInt();
		
//		System.out.println("x + y = " + cal.sum(x, y));
//		System.out.println("x - y = " + cal.sub(x, y));
//		System.out.println("x * y = " + cal.mul(x, y));
//		System.out.println("x / y = " + cal.div(x, y));
		
		//disp();
		cal.disp(x, y);
		
		
	}

}
