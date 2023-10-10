package tut03;


public class Tut01Ex {

	public static void main(String[] args) {

		
		//아이디와 비밀번호가 모두 일치하면 "마이페이지로 이동합니다."
		//일치하지 않으면 "로그인정보를 확인하세요."
		//회원가입 정보(아이디, 비) = 로그인 정보(아이디, 비번)
		//database 값을 저장하는 변수 일므은 단어와 단어가 이어질 때 _
		
		//회원가입정보(DB) : 저장
		String db_userid = "koreait";
		String db_passwd = "12345";
		int point = 1000;
		
		//로그인정보(DB) : 입력
		String userid = "koreait";
		String passwd = "12345";

		if (db_userid.equals(userid) && db_passwd.equals(passwd)) {
			System.out.println(db_userid + "회원님 안녕하세요. 마이페이지로 이동합니다.");
			System.out.println("보유하신 포인트는 : " + (point += 100) + "점 입니다.");
		} else {
			System.out.println("로그인정보를 확인하세요.\n로그인 페이지로 이동합니다.");
			System.out.println("보유하신 포인트는 : " + point + "점 입니다.");
		}
		//자동 정열 cmd + shift + f

//		String login = (db_userid.equals(userid) && db_passwd.equals(passwd)) ? db_userid + "회원님 안녕하세요. 마이페이지로 이동합니다." : "로그인정보를 확인하세요.\n로그인 페이지로 이동합니다.";
//		System.out.println(login);
		
		
	}

}

