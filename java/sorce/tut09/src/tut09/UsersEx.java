package tut09;

import java.util.ArrayList;
import java.util.List;

class Users {
	//필드(맴버변수) : 공유 변수
	String userid;
	String passwd;
	int age;
	
	
	//생성자 : 객체 초기화 -> public 으로 시작하고 클래스 이름과 동일 리턴 X
	public Users() {}
	
	public Users(String userid, String passwd, int age) {
		this.userid = userid;
		this.passwd = passwd;
		this.age = age;
	}

	//캡슐화(데이터보호) 처리 : 가져오기 : getter, 저장하기 : setter
	
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



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	
	//메소드
	@Override
	public String toString() { //표준화
		return "Users [userid=" + userid + ", passwd=" + passwd + ", age=" + age + "]";
	}
	
	
//	public Users() {}
//	
//	
//	public Users(String userid) {
//		this.userid = userid;
//	}
//
//
//	public Users(String userid, String passwd) {
//		this.userid = userid;
//		this.passwd = passwd;
//	}
//	
//	public Users(String userid, String passwd, int age) {
//		this.userid = userid;
//		this.passwd = passwd;
//		this.age = age;
//	}
//
//
//	public Users(String userid, String passwd, int age) {
//		this.userid = userid;
//		this.passwd = passwd;
//		this.age = age;
//	}
//	//getter, setter : 입출력 처리
//	public String getUserid() {
//		return userid;
//	}
//
//
//	public void setUserid(String userid) {
//		this.userid = userid;
//	}
//
//
//	public String getPasswd() {
//		return passwd;
//	}
//
//
//	public void setPasswd(String passwd) {
//		this.passwd = passwd;
//	}
//
//
//	public int getAge() {
//		return age;
//	}
//
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	//메소드
//	@Override
//	public String toString() {
//		return "Users [userid=" + userid + ", passwd=" + passwd + ", age=" + age + "]";
//	}


}

public class UsersEx {

	public static void main(String[] args) {
		
		//회원가입 1명을 처리하시오
		//생성자를 이용해서 저장
		//getter, setter을 이용해서 저
		
		//Users[] user = new Users[1]; //회원 한명 저장(아이디, 비밀번호, 나이)
//		user[0].userid = "코리아아이티"; //필드 직접 저장 x
//		user[0].passwd = "1234";
//		user[0].age = 10;
		
		//생성자를 이용해서 초기화(값 입력)
		//user[0] = new Users("코리아아이티", "1234", 20);
		//System.out.println(user[0].toString()); // toString으로 값 출력
		
//		Users[] user = new Users[2];
//		user[0] = new Users("아이디1", "비번", 10);
//		user[1] = new Users("아이디2", "비번", 20);
//		System.out.println(user[0].toString());
//		System.out.println(user[1].toString());
		
//		Users[] user = new Users[3];
//		user[0] = new Users();
//		user[1] = new Users();
//		user[2] = new Users();
//		
//		user[0].toString();
//		user[1].toString();
//		user[2].toString();
		
//		Users[] user = new Users[3];
//		for(int i = 0; i < user.length; i++) {
//			user[i] = new Users(); //왜 이구문 이 필요한지..
//			user[i] = new Users("아이디"); 
//			user[i] = new Users("아이디", "비번");
//			user[i] = new Users("아이디", "비번", 10); 
//		}
//		
//		user[0] = new Users("서울아이티");
//		
//		user[0].setUserid("코리아아이티");
//		System.out.println(user[0].getUserid());
		
		
		
		//3명의 회원을 생성자로 저장 후 출력
		Users[] user = new Users[3];
		
		//List<Users> list = new ArrayList<>();
		
		//3명 -> 초기화 3번
		user[0] = new Users("a", "b", 10);
		user[1] = new Users("c", "d", 20);
		user[2] = new Users("e", "f", 30);
		
		for(int i = 0; i < user.length; i++) {
			user[i] = new Users("아이디"+i, "비번"+i, 0+i);
			System.out.println(user[i].toString()); 
		}
		
		
		System.out.println("----------------------------");
		
		for(int i = 0; i < 3; i++) {
			//set을 이용해서 저장
			user[i] = new Users(); //초기화를 무조건 해줘야한다 안해주면 null이 나옴
			user[i].setUserid("부산");
			user[i].setPasswd("1234");
			user[i].setAge(10);
			
			System.out.println(user[i].toString());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
