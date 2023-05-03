package ch02;

import java.util.Scanner;

public class TypeConv_Ex {

	public static void main(String[] args) {
		//형 변환
		//정수 -> 실수 -> 정수
		int num1 = 100;
		double d = 123.123456789;
		char c = 'A';
		
		double res1 = num1; //묵시적 형변환(업캐스팅)
		float res2 = (float) d; //명시적 형변환(다운캐스팅)
		int num2 = c;		
		
		//웹 : 객체 타입으로 형 변환
		//웹에서 통신(주고 받을 때) : 무조건 글자로만 전송
		//문자열 -> 정수 : int(기본타입) = Integer.parseInt();
		//정수 -> 문자열 : String.valueOf();
		
		String age = "100";
		int x = Integer.parseInt(age);
		System.out.println(x + 100);
		
		int y = 200;
		String str = String.valueOf(y);
		System.out.println(y + str);
		
		System.out.println("------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 > ");
		int z = Integer.parseInt(sc.next());
		System.out.println(111 + z);
	}

}