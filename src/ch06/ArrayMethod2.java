package ch06;

import java.util.Arrays;

class ToStringArr {
	
	public void printArr(int[] arr) {
//		System.out.println(Arrays.toString(arr));
//		for(출력데이터타입 변수 : 배열명) {
//			System.out.println(변수);
//		}
		
		for(int a : arr) {
			System.out.println(a);
		}
		
		int sum = 0;
		double avg = 0;	
		for(int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println("학생수  : " + arr.length + "명");
		System.out.println("합계 : " + sum + "점");
		System.out.println("평균 : " + sum / (double) arr.length + "점");
		
	}
}


public class ArrayMethod2 {

	public static void main(String[] args) {
		//임의 정수 5개를 입력받아 배열을 문자열로 변환하여 출력하시오
		//Arrays.toString(); : 메소드 만들어서 사용
		
		int[] arr = new int[] {1, 2, 3, 4, 5};
		
		ToStringArr tsa = new ToStringArr();
		tsa.printArr(arr);
		
		
		
		
		
		
		
		

	}

}
