package ch04;

import java.util.Scanner;

public class IF_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String grade = "";
		
		//90이상 A+, 80이상 B+, 70이상 C+, 그 외에 F		
		
		System.out.print("점수(정수)를 입력해 주세요 >> ");
		score = sc.nextInt();
		
		
//		if(score >= 90) {
//			grade = "A+";
//		}else if(score >= 80) {
//			grade = "B+";
//		}else if(score >= 70) {
//			grade = "C+";
//		}else {
//			grade = "F";
//		}
//		System.out.println(grade + "입니다.");
		
		//90이상인 점수 중 95 이상이면 A+ 90이상이면 A
		//80이상인 점수 중 85 이상이면 B+ 80이상이면 B
		//70이상인 점수 중 75 이상이면 C+ 70이상이면 C
		//나머지는 F
		
		char opt = 0; //if ~ else 전역변수		
		
		if(score >= 90) {
			grade = "A";
			if(score >= 95) {
				opt = '+';
			}else if(score >= 90) {
				opt = '+';
			}
		}else if(score >= 80) {
			grade = "B";
			if(score >= 85) {
				opt = '+';
			}else if(score >= 80) {
				opt = '-';
			}
		}else if(score >= 70) {
			grade = "C";
			if(score >= 75) {
				opt = '+';
			}else if(score >= 70) {
				opt = '-';
			}
		}else {
			grade = "F";
		}
//		System.out.println("입력하신 점수의 성적은 " + grade + opt +  " 입니다.");
		System.out.printf("점수 등급은 %s%c 입니다.", grade, opt);
		
		
		
	}

}
