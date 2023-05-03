package ch06;

public class Arr_Ex {

	public static void main(String[] args) {
		//배열선언 -> 값을 초기화 : 일반
		int[] num = new int[3];
		num[0] = 100;
		num[1] = 200;
		num[2] = 300;			
		
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
			sum += num[i];
			System.out.println(sum);
		}
		
//		for(int n : num) { //foreach
//			System.out.println(n);			
//		}
		
		//배열선언 + 값 초기화 : 알고리즘
		double[] d = new double[] {1.1, 2.2, 3.3};
		for(double result : d) {
			System.out.println(result);
		}
		
		for(int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}

}
