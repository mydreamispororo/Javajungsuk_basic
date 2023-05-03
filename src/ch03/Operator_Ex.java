package ch03;

public class Operator_Ex {

	public static void main(String[] args) {
		int x, y; //정수가 저장될 메모리 공간이 할당
		x = y = 3;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("-------- 증감연산자 --------");
		//변수에 저장했다가 사용하면 문제x
		int i = 5;
		int j = 0;
		
		j = ++i;
		System.out.println(j);

		System.out.println(i++);
		System.out.println(i);
	
		System.out.println("--------------------");
		
		//프로그램은 특별한 지정을 하지 않으면 int로 저장을 함.
		System.out.println(5 / 2); //정수를 실수로 변환할 때는 제수에 형 변환한 작업
		System.out.println(5 / (double) 2);
		System.out.println(5 / (float) 2);
		
		System.out.println("--------------------");
		
		//저장공간이 1byte = 8 = 2*2*2*2*2*2*2*2 = 256
		byte a = 10;
		byte b = 13;
		byte c = (byte) (a * b); //130 -> 126
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		

	}

}
