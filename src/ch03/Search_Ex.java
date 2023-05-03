package ch03;

import java.util.Scanner;


public class Search_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문자를 입력 char A -> 숫자
		//문자를 입력 char Z -> 숫자
//		char a = 'A';
//		System.out.println((int)a); //65
//		
//		char z = 'Z';
//		System.out.println((int)z); //90
//		
//		char a1 = 'a';
//		System.out.println((int)a1); //97
//		char z1 = 'z';
//		System.out.println((int)z1); //122
//		
//		//if 논리 연산자 && ||
//		
//		char ch = 'a';
//		
//		if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
//			System.out.println("입력하신 문자는 영어입니다.");
//		}else {
//			System.out.println("입력하신 문자는 영어가 아닙니다.");
//		}
		
		//선택변수
		//문자 변수에 저장
		//1. 영어 확인 2. 종료
		//while -> switch -> if
		
		
		boolean run = true;
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1. 영어 판독   2. 프로그램 종료");
			System.out.println("-----------------------");
			
			System.out.print("메뉴를 선택해 주세요 > ");
			int sel = sc.nextInt();			
			
			switch(sel) {
			case 1:
				System.out.print("판독할 문자 입력 > ");
				String word = sc.next();
				
				char ch = word.charAt(0); //띄어쓰기를 기준으로 첫글자만 가져오기

				System.out.println();
				System.out.println("영어인지 확인합니다.");
				System.out.println();
				
				if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
				System.out.println("입력하신 문자는 영어입니다.");
				
			}else {
				System.out.println("입력하신 문자는 영어가 아닙니다.");
			}
			
			break;

			default:
				System.out.println("잘 못 입력하셨습니다.\n 시스템을 종료합니다.");
				System.exit(0);
				
			}
			
			
			
			
		}
		
		
		
		
		
	}

}
