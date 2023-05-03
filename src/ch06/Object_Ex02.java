package ch06;

class Login{
	String email;
	String passwd;
	String title;
	String ver;
	
	String db_email = "korea@korea.com";
	String db_passwd = "12345";
	
	
	public Login() {}


	public Login(String title) {
		this.title = title;
	}
	
	public Login(String title, String ver) {
		this(); //위에있는거랑 똑같으니까 그걸 가져온다는 메소드
		this.ver = ver;
	}
	
	//이메일 비밀번호 비교해서 일치하면 1, 아니면 0
	public int loginCheck(String email, String passwd) {
		int chk = 0;
		if(email.equals(db_email) && passwd.equals(db_passwd)) {
			chk = 1;
		
		}else {
			chk = 0;
			
		}
		return chk;
	}
	
}
	

public class Object_Ex02 {

	public static void main(String[] args) {
		//Login : email, passwd
		Login loginChk = new Login("korea it", "v1");
		int status = loginChk.loginCheck("korea@korea.com", "12345");
		
		if(status == 1) {
			System.out.println("Login 되었습니다.");
		}else {
			System.out.println("다시 시도해 주세요");
		}
		
		
		
		
		
	}

}
