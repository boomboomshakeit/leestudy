package member;

public class MemberEx {

	public static void main(String[] args) {
		
		/*
		List, Set, Map
		
		Map 순서가 없고 key로 접근이 가능(반복x), 저장시엔 배열명.put
		= json
		
		순서 배열명. get(i), 저장시엔 배열명.add
		List : 줄 + Member 칸 => 홍길동 ,1234
		홍길동, 1234 => List<Member>
		홍길동, 1234 => List<Member>
		홍길동, 1234 => List<Member>
		*/
				
		MemberDao dao = new MemberDao(); //이거 만들고 다오에 생성자 만듬
		
		dao.putMember("u1", new Member("홍길동", "1234")); //u1이라는 키에 홍길동,1234	라는 값이 들어감
		dao.putMember("u2", new Member("김철수", "0000"));
		dao.putMember("u3", new Member("이영희", "5678"));
		
		dao.showInfo();

		System.out.println("-----------------------------");
		boolean result = dao.deleteMember("u1");
		if(result == true) {
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("존재하지 않는 키 입니다.");
		}
		dao.showInfo();

	}

}
