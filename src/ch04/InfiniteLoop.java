package ch04;

import java.util.Scanner;

public class InfiniteLoop {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		
		while(true) {
			System.out.println("(1) Square");
			System.out.println("(2) Square Root");
			System.out.println("(3) Log");
			System.out.print("원하는 메뉴 (1 ~ 3) 를 선택하세요(종료 : 0) >> ");
			
			int menu = sc.nextInt();
			if(menu == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else if(menu > 3 || menu < 1) {
				System.out.println("메뉴를 잘 못 선택하셨습니다.");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");
			}
		
	}

}

