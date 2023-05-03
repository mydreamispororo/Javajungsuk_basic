package ch05;

public class Array_Ex01 {

	public static void main(String[] args) {
		//배열의 선언 : 배열 공간
		//타입[] 배열명 = new 타입[배열개수]; 공간은 1 배열의 이름은 0
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i);
		}
		System.out.println("--------------------------");
		
		int[] arr1 = new int[3];
		//값 초기화
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		//배열을 선언하면 동시에 초기화
		int[] array = new int[] {1, 2, 3};
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("--------------------------");
		
		//문자 배열로 char
		char[] array2 = new char[] {'a', 'b', 'c', 'd', 'e'};
		for(int i = 0; i < array2.length; i++) {
			System.out.println((int)array2[i]);
		}
		System.out.println("--------------------------");
		
		//for(타입 변수 : 배열이름)
		for(char c : array2 ) {
			System.out.println(c);
		}
		
		double[] d = new double[5];
		for(int i = 0; i < d.length; i++) {
			d[i] = 0.1;
			
		}
		
		for(double d1 : d) {
			System.out.println(d1);
		}
		
		
		
		
		

	}

}
