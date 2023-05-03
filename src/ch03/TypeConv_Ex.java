package ch03;

public class TypeConv_Ex {

	public static void main(String[] args) {
		//실수 12.12 -> 정수로 변환(데이터 손실) 12
		double d = 12.12; //8byte : 부동소수점 : 지수부 가수부(IEEE)
		int i = (int)d; //() 소괄호 붙이면 명시적 형변환
		System.out.println(d);
		System.out.println(i); //4byte
		
		int x = 10;
		int y = 4;
		//결과 실수
		
		//기본은 무조건 정수
		System.out.println(x / (double)y);
		
		byte b = 10; //1byte : 8bit -> 2의 8승 = 256
		byte c = 13;
		System.out.println((byte)(b * c));
		
		
		
		
		
		
		
		
		

	}

}
