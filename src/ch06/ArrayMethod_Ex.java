package ch06;

class CalArray{
	
//	접근제한자 리턴타입 메소드명() {}
//	1. ***리턴*** : 메소드 안에서만
//	2. void 빼고 무조건 return
//	3. 메소드 안에 sysout 명령 있으면 void - return x
//	4. 리턴타입
	
//	public void add(int[] scores) {
//		for(int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
//	}

	
	//값을 구하는 메소드 100 + 100 = 200
	public int sum(int[] scores) {
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		return sum;
	}
	
}


public class ArrayMethod_Ex {
	
	public static void main(String[] args) {
		//    타입 변수     생성자
		//메소드의 파라미터는 타입 변수
		//사용하는 메소드 이름의 파라미터는 생성자

		int[] scores = new int[] {10, 20, 30, 40, 50};
//		
//		CalArray cal = new CalArray();
//		cal.add(scores);
//		System.out.println();
		
		//결과표시 : sysout 
		CalArray ca = new CalArray();
		System.out.println(ca.sum(scores));
		
		
		
		
		
	}

}
