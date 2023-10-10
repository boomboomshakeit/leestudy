package tut12;

public class MemberEx {

	public static void main(String[] args) {
		
		//줄(dao) -> 칸(member)
		MemberDao md = new MemberDao();
		
		md.addMember(new Member("홍길동", "1111"));
		md.addMember(new Member("김철수", "2222"));
		
		md.showInfo(); //전체를 볼때는 매개변수 필요없음
		
		md.deletMember("김철수");
		
		md.showInfo();
	}

}
