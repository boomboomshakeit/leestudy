package tut08;

class Register {
	
	//필드 : 캡슐화
	private String userid;
	private String pssswd;
	private int point;
	//생성자
	/*
	public Register() {}//이름은 클래스 이름과 똑같이
	
	public Register(String title) {
		System.out.println(title);
	}
	
	*/
	/*
	public Register(String userid, String passwd, int point) {
		//this.필드 = 파라미터
		this.userid = userid; //this를 붙히면 구분할 수 있음
		this.pssswd = passwd;
		this.point = point;
	}
	*/
	/*
	public Register() {
		
	}
	public Register(String userid, String passwd, int point) {
		this.userid = userid;
		this.pssswd = passwd;
		this.point = point;
		
	}
	*/
	public Register(String userid, String pssswd, int point) {
		this.userid = userid;
		this.pssswd = pssswd;
		this.point = point;
	}
	
	
	
	//getter, setter
	
	



	//메소드
	public void disp() {
		System.out.println("아이디는 " + this.userid + ", 비밀번호는 " + this.pssswd + "포인트 " + this.point); ///생성자가 필드에 저장되기 때문에 필드에 있는 것을 가져와서 출력함
	}
	
	@Override
	public String toString() {
		return "Register [userid=" + userid + ", pssswd=" + pssswd + ", point=" + point + "]";
	}
	
	
}

public class RegisterEx {

	public static void main(String[] args) {
		
		//회원가입 프로그램 : 객체 회원 1명 정보
		//아이디(String), 비번(String), 포인트(int)를 저장하고 출력하는 프로그램
		
		//Register person = new Register("회원가입을 진행합니다...");
		
		//Register p1 = new Register("koreait", "1234", 1000);
		
		Register p1 = new Register("korea", "1234", 1000); // private시 3개짜리 생성자를 만들어야함
		p1.disp(); // 메소드에 있는 값 출력 
		
		System.out.println(p1.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
