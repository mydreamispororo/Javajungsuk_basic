package ch04;

public class ForLoop_Ex {

	public static void main(String[] args) {
		//for 10개 출력
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}

		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += i; 
		}
		System.out.println(sum);
		System.out.println("-----------------------------");
		
		//for 홀수만 출력하세요
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0)
			
			System.out.println(i);
		}
		System.out.println("-----------------------------");
		
		//실행시킬 때마다 결과값이 다르게
		//주사위 알고리즘
		//실수 -> 정수
		//
		//System.out.println((int) (Math.random() * 46) + 1);
		for(int i = 0; i <= 5; i++) {
			System.out.println((int) (Math.random() * 46) + 1);
		}
		System.out.println("----------------------------");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("hello");
		}		
		
	}

}
