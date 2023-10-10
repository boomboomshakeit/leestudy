package tut10;

public class Register {
	
	//1.필드
	//2.생성자 : 기본생성자
	//3.getter, setter
	//4.메소드
	
	private String email;
	private String passwd;
	private String username;
	
	public Register() {}

	public Register(String email, String passwd, String username) {
		this.email = email;
		this.passwd = passwd;
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String disp() {
		return "이메일 : " + getEmail() + ", 비밀번호 : " + getPasswd() + ", 이름 : " + getUsername();
	}
	
	
}
