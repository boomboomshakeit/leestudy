package tut04;

import java.util.Scanner;

public class ContEx3 {

	public static void main(String[] args) {
		
		//grade 0 Gueest, 1 Member, 2 Admin 을 출력하시오
		//switch
		//정수, 문자(char), 문자
		
		int grade = 0;
		
		/*
		switch(값) {
		case 조건: 
			출력코드
			break
		}
		*/
		
		switch(grade) {
			case 0:
				System.out.println("Guest님 안녕하세요.");
				break;
				
			case 1:
				System.out.println("Member님 안녕하세요.");
				break;
			
			default:
				System.out.println("Admin님 안녕하세요.");
				break;
		}
		
		
		System.out.println("-------------------------------------");
		
		//'I' : 입력, "S" : 출력, "U" : 수정, "D" : 삭제
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력(I/i), 출력(s), 수정(u), 삭제(d) > ");
		
		String str = sc.next();
		
		switch(str) {
			case "I":
			case "i":
				System.out.println("데이터베이스에 접속합니다.");
				System.out.println("SQL 입력 명령어 : INSERT INTO member VALUES()");
				System.out.println("회원정보 입력 완료!!");
				break;
				
			case "S":
			case "s":
				System.out.println("데이터베이스에 접속합니다.");
				System.out.println("SELECT * FROM member");
				System.out.println("회원정보 조회 완료!!");
				break;
				
			case "u":
				System.out.println("데이터베이스에 접속합니다.");
				System.out.println("UPDATE member SET");
				System.out.println("회원정보 수정 완료!!");
				break;
				
			case "d":
				System.out.println("데이터베이스에 접속합니다.");
				System.out.println("DElETE FROM member");
				System.out.println("회원정보 삭제 완료!!");
				break;
			
			default:
				System.out.println("잘못된 명령어 입니다.");
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
		}
		
		
		
		
	}

}
