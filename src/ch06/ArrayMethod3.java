package ch06;

class Cal3 { //메인먼저 작성하지 않음
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public double add(double[] d) {
		double sum = 0;
		for(int i = 0; i < d.length; i++) {
			//sum = sum + d[i];
			sum += d[i];
		}
		return sum;
	}
	
}


public class ArrayMethod3 {

	public static void main(String[] args) {
		Cal3 c3 = new Cal3();
		int num = c3.add(100, 200);
		System.out.println(num);
		System.out.println(c3.add(100, 200));
		System.out.println("----------------------");
		
		double[] d = new double[] {1.1, 2.2, 3.3};
		System.out.println(c3.add(d));
		

	}

}
