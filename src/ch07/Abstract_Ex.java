package ch07;

//상속 : abstract
//CRUD - 모든 프로그램에 기본 : 팀장이 사용하는 이름을 표준화 한다고 가정...
abstract class CRUD {
	abstract void creat();
	abstract void read();
	abstract void update();
	abstract void delete();
	
}

//인사과 프로그램
class Insa_Pro extends CRUD{

	@Override
	void creat() {
		System.out.println("인사과 회원가입이 완료되었습니다.");
	}

	@Override
	void read() {
		System.out.println("인사과 회원을 조회합니다.");
	}

	@Override
	void update() {
		System.out.println("인사과 회원정보를 수정합니다.");
	}

	@Override
	void delete() {
		System.out.println("인사과 회원정보를 삭제합니다.");
	}
	
}

//자재과 프로그램
class Jajae_Pro extends CRUD{ //오버라이딩은 쓰든 안쓰든 무조건 해야됨, 빼면 오류남

	@Override
	void creat() {
		System.out.println("자재과 회원가입이 완료되었습니다.");
	}

	@Override
	void read() {
		System.out.println("자재과 회원을 조회합니다.");
	}

	@Override
	void update() {
		System.out.println("자재과 회원정보를 수정합니다.");
	}

	@Override
	void delete() {
		System.out.println("자재과 회원정보를 삭제합니다.");
	}
	
}

public class Abstract_Ex {

	public static void main(String[] args) {
		//다형성으로 표시
		CRUD insa = new Insa_Pro();
		CRUD jajae = new Jajae_Pro();
		
		insa.creat();
		jajae.creat();
		
		insa.read();
		jajae.read();
		
		insa.update();
		jajae.update();
		
		insa.delete();
		jajae.delete();
		
				

	}

}
