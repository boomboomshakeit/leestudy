package tut12;

public class Member {
	
	private String userid;
	private String passwd;
	
	//생성자
	public Member() {}

	public Member(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}
	
	
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	//메소드를 통해 출력 코드
	public void disp() {
		System.out.println("아이디 : " + userid + ", 비밀번호 : " + passwd);
	}
}
