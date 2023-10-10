package tut12;

public class SetEx04 {

	public static void main(String[] args) {

		RegisterDao dao = new RegisterDao();
		dao.addRegister(new Register(1, "홍길동", "1111"));
		dao.addRegister(new Register(2, "김철수", "2222"));
		dao.addRegister(new Register(3, "이영희", "3333"));
		
		dao.showInfo();
		
		
		boolean result = dao.deleteRegister(2);
		
		if(result )
			System.out.println("삭제되었습니다.");
		else
			System.out.println("없는 회원번호 입니다.");
		
		dao.showInfo();
	}

}
