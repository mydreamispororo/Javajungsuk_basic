package ch03;

import java.util.Scanner;

public class Opt_Ex {

	public static void main(String[] args) {
		//Scanner 정수를 입력 받아서 짝수(Even)인지 홀수(Odd)인지 표시하시오
		
		//숫자나 객체는 == 동등비교(!= : 같지않다), 문자나 문자열은 equals()
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 > ");
//		
//		int num = sc.nextInt();
//		
//		if(num % 2 == 0) {
//			System.out.println("짝수입니다.");
//			
//		}else {
//			System.out.println("홀수입니다.");
//		}
		
		while(true) {
			//1 누르면 확인
			//2 정지
			System.out.print("메뉴선택(정수) > ");
			int select = sc.nextInt(); //무한루프 scanner를 만나면 멈춤
			
			switch(select) {
			
			case 1:
				System.out.println("-------------------------");
				System.out.println("1. 숫자를 분석합니다.");
				System.out.println();
				
				System.out.print("홀짝 구할 숫자 > ");
				int num = sc.nextInt();
				
				
				if(num % 2 == 0) {
					System.out.println("짝수입니다.");
					System.out.println();
					
				}else {
					System.out.println("홀수입니다.");
					System.out.println();
				}
				
				break;
				
			default:
				System.out.println("-------------------------");
				System.out.println("2. 시스템을 종료합니다.");
				System.out.println();
				System.exit(0);
				break;
			
			
			
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}













