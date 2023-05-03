package ch08.model;

public class Register {
	//회원가입 필드 : 아이디, 비밀번호, 회원가입 유무, 포인트
	String userid;
	String passwd;
	boolean b = false;
	int point = 0;
		
	//생성자 : new를 실행하여 객체를 초기화하는 작업
	public Register() {	} //메소드 본체가 비어있으면 디폴트 생성자

	//메소드 이름은 똑같지만 리턴 타입이나 매개변수의 개수가 다르면 메소드 오버로딩
	public int addpoint(int point) {
		return 0;
	}
	
	public double addpoint(double point) {
		return 0.0;
	}
	

}
