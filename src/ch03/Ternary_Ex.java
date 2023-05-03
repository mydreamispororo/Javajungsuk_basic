package ch03;


public class Ternary_Ex {

	public static void main(String[] args) {
		//조건 ? 참 : 거짓
		//아이디 비밀번호 비교해서 참이면 마이페이지 : 로그인
		String db_userid = "koreait";
		String db_passwd = "12345";
		
		//from -> input
		String userid = "koreait";
		String passwd = "12345";
		
		//login
		if(db_userid.equals(userid) && db_passwd.equals(passwd)) {
			System.out.println("마이페이지로 이동합니다.");
			
		}else {
			System.out.println("로그인 해 주세요");
		}
		
		String result = (db_userid.equals(userid)) ? "마이페이지로 이동합니다." : "로그인 해 주세요";
		System.out.println(result);
		
		System.out.println("-------------------------------------");
		
		//true, false
		boolean isFlag = true; //반전
		
		if(isFlag) {
			System.out.println(!isFlag);
		}else {
			System.out.println("");
		}
		System.out.println((isFlag) ? !isFlag : "");
		
		
		
		
		
		
	}

}
