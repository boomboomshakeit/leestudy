package tut08;

import java.time.LocalDateTime;

public class LoginEx2 {
	
	

	public static void main(String[] args) {
		
		Login2 log = new Login2();
		log.setEmail("lth");
		log.setPasswd("123");
		System.out.println("--------Getter 출력--------");
		System.out.println(log.getEmail()); //이렇게 할 수도 있음
		System.out.println(log.getPasswd());
		System.out.println(log.getRegist());
		System.out.println("--------메소드 출력--------");
		System.out.println(log.toString()); //내가한거
	}

}
