package ch04;

import java.util.Scanner;

public class WhileLoop_Ex01 {

	public static void main(String[] args) {
		//컴퓨터가 만들어낸 임의 수 10개 중 하나를 맟줌
		//while() 맞출때까지 반복
		Scanner sc = new Scanner(System.in);
		
//		int computer = (int)(Math.random() * 10) + 1;
//		
//		
//		while(computer <= 10) {
//		
//		System.out.print("1 ~ 10 사이의 숫자를 입력하세요 > ");
//		int person = sc.nextInt();
//		
//		if(computer > person) {
//			System.out.println("더 큰 수를 선택하세요");
//		}else if(computer < person) {
//			System.out.println("더 작은 수를 선택하세요");
//		}
//		else {
//			System.out.println("정답입니다");
//		}
		
		//한바퀴 돌 때마다 랜덤 수, 사람이 입력을 받아야 함 = true
		//computer > person : 큰수 computer < person : 작은수
		//맞추면 프로그램 종료, return, break;
		
		int computer = 0;
		int person = 0;		
		boolean isRun = false;
		
		while(!isRun) {
			
			computer = (int)(Math.random() * 6) + 1;
			System.out.print("정수입력 > ");
			person = sc.nextInt();
			
			if(computer > person) {
			System.out.println("큰 숫자를 입력해 주세요.");
			
			}else if(computer < person) {
				System.out.println("작은 숫자를 입력해 주세요.");
			}else {
				System.out.println("정답입니다.");
				return; //break;
			}
			
			
			
			
			
		}
		
	}

}
