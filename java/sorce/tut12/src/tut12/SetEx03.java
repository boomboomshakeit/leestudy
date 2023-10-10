package tut12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member2 {
	private String userid;
	private String passwd;
	
	public Member2(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}
	
	public void disp() {
		System.out.println("아이디 : " + userid + ", 비밀번호 : " + passwd);
	}
}

public class SetEx03 {

	public static void main(String[] args) {

		Set<Member2> set = new HashSet<Member2>();
		
		//add 객체 저장 => new Member("");
		
		set.add(new Member2("홍길동", "1111"));
		set.add(new Member2("김철수", "2222"));
		set.add(new Member2("이영희", "3333"));
		
		for(Member2 m : set) {
			m.disp();
		}
		
		System.out.println("---------------------------");
		
		Iterator<Member2> ir = set.iterator();
		while(ir.hasNext()) {
			ir.next().disp();;
		}
	}

}
