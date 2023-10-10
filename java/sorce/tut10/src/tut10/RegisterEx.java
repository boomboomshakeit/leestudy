package tut10;

import java.util.Scanner;

public class RegisterEx {

	public static void main(String[] args) {

//		Register r = new Register(); // 초기화
//
//		r.setEmail("hi");
//		System.out.println(r.getEmail());
		
		//Scanner를 이용해서 배열 생성 :3
		//입력 Scanner
		//for
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가입할 회원 수 > ");
		int count = sc.nextInt();
		
		Register[] r = new Register[count]; //객체 개수
		//System.out.println(r.length);
		
		//for 입력
		for(int i = 0; i < r.length; i++) {
			
			System.out.println("이메일 > ");
			String email = sc.next();
			
			System.out.println("비밀번호 > ");
			String passwd = sc.next();
			
			System.out.println("이름 > ");
			String username = sc.next();
			r[i] = new Register(email, passwd, username);
			System.out.println((i+1) + "번째 회원이 등록 되었습니다.");
			System.out.println("");
		}
			System.out.println("회원가입이 완료되었습니다.");	
			System.out.println("");
			System.out.println("--------" + r.length + "명 회원이 출력 되었습니다.--------");
			
			for(Register reg : r) {
				System.out.println(reg.disp());
				System.out.println("-------------------");
			}
	}

}
