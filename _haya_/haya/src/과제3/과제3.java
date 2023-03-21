package 과제3;

import java.util.HashMap;
import java.util.Scanner;

public class 과제3 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String>map=new HashMap<String, String>();
		
		map.put("Lee", "1234"); // > 잘못된 ID
		map.put("Kim", "1236"); // > 비밀번호 불일치
		map.put("Cho", "1239"); // > 로그인 성공
		
		System.out.println("ID 입력");
		String id=scan.nextLine();
		System.out.println("비밀번호 입력");
		String password=scan.nextLine();
		
		switch(id) {
		case "Lee": 
			System.out.println("잘못된 ID");
			break;
		case "Kim":
			System.out.println("비밀번호 불일치");
			break;
		case "Cho":
			if(map.get("Cho").equals("1239")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호 불일치");
			}
			break;
			default:
				System.out.println("잘못된 ID입니다");
		}
	}
}