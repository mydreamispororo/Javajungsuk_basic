package ch05;

public class Array_Ex02 {

	public static void main(String[] args) {
		int[] scores = new int[] {20, 30, 40, 50, 60};
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("합계 : " + sum);
		
		avg = sum / (double)scores.length;
		System.out.println(avg);
	}

}
