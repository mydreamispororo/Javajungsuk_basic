package ch07;

class Human{
	String username;
	int age;

	public void eat() {
		System.out.println("부모에서 출력되는 eat 메소드");
	}
	
	public void sleep() {
		System.out.println("부모에서 출력되는 sleep 메소드");
	}
}

class Students extends Human{
	String stdNum;

	@Override
	public void eat() {
		System.out.println("학생이 식사를 합니다.");
	}
	
}

class Person extends Human{
	String PersonNum;

	@Override
	public void eat() {
		System.out.println("일반인이 식사를 합니다.");
	}

	@Override
	public void sleep() {
		System.out.println("일반인이 피곤해서 잠을 잡니다.");
	}
	
}

public class Human_Ex {

	public static void main(String[] args) {
		Students std = new Students();
		std.username = "학생이름";
		std.age = 20;
		
		System.out.println(std.username + " / " + std.age);
		std.eat();
		System.out.println("------------------------------");
		
		Person p = new Person();
		p.username = "일반인1";
		p.age = 100;
		
		System.out.println(p.username + " / " + p.age);
		p.eat();
		p.sleep();
		
		//왼쪽에 부모를 적고 오른쪽에 출력할 생성자
		//다형성
		
		/*Students std = new Students();
		Human h1 = new Students();
		
		Person p = new Person();
		Human h2 = new Person();*/
		
		

		
		
	}

}
