package tut08;

public class LoginEx {
	
	//필드 = 맴버변수
	
	
	public static void main(String[] args) {
		
		/*
		//web : 아이디, 비번
		LoginEx web = new LoginEx();
		web.userid = "id1";
		web.passwd = "pwd1";
		
		
		//grp : 아이디, 비번
		LoginEx grp = new LoginEx();
		grp.userid = "id2";
		grp.passwd = "pwd2";
		*/
		
		Login web = new Login();
		web.userid = "aaa";
		web.passwd = "1234";
		web.age = 10;
		System.out.println("아이디는 " + web.userid + "입니다.");
		System.out.println("비밀번호는 " + web.passwd + "입니다.");
		System.out.println("나이는 " + web.age + "입니다.");
		
		System.out.println("------------------");
		
		Login grp = new Login();
		grp.userid = "bbb";
		grp.passwd = "7777";
		grp.age = -10;
		
		// \n \t
		System.out.println("아이디 : " + grp.userid 
				+ ",\t 비밀번호 : " + grp.passwd 
				+ ",\t 나이 : " + grp.age);
		
	}

}
