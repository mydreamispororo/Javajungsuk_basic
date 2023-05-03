package ch04;

import java.util.Scanner;

public class Switch_Ex {

	public static void main(String[] args) {
		//1,2,3 봄	4,5,6 여름	7,8,9 가을	10,11,12 겨울
		//조건 : 부등호 x
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재는 몇 월 인가요? > ");
		
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 3:
			System.out.println("지금은 봄 입니다.");
			break;
			
		case 4:
		case 5:
		case 6:
			System.out.println("지금은 여름 입니다.");
			break;
			
		case 7:
		case 8:
		case 9:
			System.out.println("지금은 가을 입니다.");
			break;
			
		case 10:
		case 11:
		case 12:
			System.out.println("지금은 겨울 입니다.");
			break;
			
		default:
				System.out.println("현재 월을 다시 입력해 주세요");
			break;
		
				
				
				
				
		}
		
	}

}
