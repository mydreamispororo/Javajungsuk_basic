package ch07;

import java.nio.file.spi.FileSystemProvider;

class Animal{
	public void cry() {
		System.out.println("모든 동물은 웁니다.");
	}
	
}

class Birds extends Animal{

	@Override
	public void cry() {
		System.out.println("모든 새는 웁니다.");
	}
	
	
}

class Cats extends Animal{

	@Override
	public void cry() {
		System.out.println("모든 고양이는 웁니다.");
	}
	
	
}

class Dogs extends Animal{

	@Override
	public void cry() {
		System.out.println("모든 강아지는 웁니다.");
	}
	
}



public class MethodOverrid_Ex {

	public static void main(String[] args) {
		Birds b = new Birds();
		Cats c = new Cats();
		Dogs d = new Dogs();
		b.cry();
		c.cry();
		d.cry();
		System.out.println("-------------------------");
		//다형성을 이용해서 출력 : 자식을 부모에 대입해서 출력
		Animal aa = new Birds();
		Animal bb = new Cats();
		Animal cc = new Dogs();
		aa.cry();
		bb.cry();
		cc.cry();
		System.out.println("-------------------------");
		
		//객체를 배열에 담아서 출력 + for
		//기본타입을 제외하면 참조
//		Animal[] animal = new Animal[] {aa, bb, cc}; 
		
		/*
		Animal[] animal = new Animal[3];
		animal[0] = aa; 
		animal[1] = bb;
		animal[2] = cc;
		*/
		
		Animal[] animal = {aa, bb, cc}; //메소드로 사용할 때 말고 단순 출력할 때는 사용해도 됨
		
		for(Animal a : animal) {
			a.cry();
		}
	}

}
