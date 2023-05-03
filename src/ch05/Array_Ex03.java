package ch05;

import java.util.Arrays;

public class Array_Ex03 {

	public static void main(String[] args) {
		//배열에 3개 값을 입력한 후
		//제일 큰 값 구하기
		//제일 작은 값 구하기
		int[] scores = new int[] {5, 10, 20, 30, 60, 68, 55, 40};
		int max = scores[0];
		int min = scores[0];
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
			}else if(scores[i] < min){
				min = scores[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("---------------------------------");
		
		//Boolean 타입
		//배열을 문자열로 출력
		boolean[] b = new boolean[] {true, false};
		System.out.println(Arrays.toString(b));
		
		for(boolean bool : b) {
			System.out.println(bool); //하나하나 값을 출력함
		}
		System.out.println(Arrays.toString(scores));
		
		
		
		
				
		
		
		
		
		
		
		
		
		

	}

}
