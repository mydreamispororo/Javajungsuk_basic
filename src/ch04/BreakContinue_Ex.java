package ch04;

public class BreakContinue_Ex {

	public static void main(String[] args) {
		//break; 바로 밑에 중괄호를 빠져 나감(if문을 빠져 나감)
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				break;
				
		}
			System.out.println(i);
			
			
		}
		System.out.println("반복문 종료");
		
		//continue : 해당 조건을 건너 뜀
		for(int i = 0; i < 10; i++) {
			if(i == 5) continue;
			System.out.println(i);
				
		}
		
		//while문을 이용해서 0 ~ 10 더하는 프로그램
		//더하거나 계산하거나 한 후 결과가 하나만 나올 때는 바깥 에 변수 작성
		int sum = 0;
		int num = 0;
		
		while(num < 10) {
			if(num == 5) break;
			
			num++;
			
			sum += num;
		}
		System.out.println("총 합계 : " + sum);
				}

}

