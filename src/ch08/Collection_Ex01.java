package ch08;

import java.util.ArrayList;
import java.util.List;

public class Collection_Ex01 {

	public static void main(String[] args) {
		//회원가입(userid) - List
		//아이디 저장 - 개수 출력 -> 목록 출력
		List<String> aList = new ArrayList<>();
		aList.add("Busan");
		aList.add("Seoul");
		aList.add("Daegu");
		
//		aList.remove("Seoul");
//		aList.clear(); //전부 다 삭제
		
		if(aList.size() == 0) { //if(aList.isEmpty() ) {}
			System.out.println("등록된 회원이 없습니다.");
		}else {
			System.out.println("등록된 회원수는 " + aList.size() + "명");
			System.out.println("---------- 등록된 회원 목록 ----------");
			for(String s : aList) {
				System.out.println(s);
			}
		}
	}
}