/*
 * 
 */

package ch08;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ex {

	public static void main(String[] args) {
		String[] board01 = new String[] {"가", "나", "다", "라", "마"};
		if(board01.length == 0) {
			System.out.println("등록된 게시물이 없습니다.");
			
		}else {
			System.out.println("등록된 게시물 수 : " + board01.length + "개");
		
			System.out.println("========== 등록된 게시물을 보여줍니다. ==========");
			for(String str : board01) {
				System.out.println(str);
			}
			System.out.println();
			System.out.println();
			
			List<String> list = new ArrayList<>();
			list.add("가");
			list.add("나");
			list.add("다");
			list.add("라");
			list.add("마");
			
			if(list.isEmpty()) {
				System.out.println("가입된 회원이 없습니다.");
			}else {
//				list.clear(); //배열값 전체 삭제
				System.out.println("쇼핑몰 가입 회원 수 : " + list.size() + "명");
				
				System.out.println("========= 회원목록 =========");
				for(String s1 : list) {
					System.out.println(s1);
				}
			}
			
			//배열값 전체를 출력할 때
			System.out.println(list.toString());
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
