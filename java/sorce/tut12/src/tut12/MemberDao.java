package tut12;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {

	
	//생성자를 통해 List 생성, 저장 메소드, 삭제 메소드, 출력 메소드
	//필드가 있어야 생성자 또는 메서드르 만들 수 있음
	
	List<Member> list = null;
	
	public MemberDao() {
		list = new ArrayList<Member>();
	}
	
	public void addMember(Member mem) { //MemberEx에서 넣었던걸 Member mem 이걸로 받음
		list.add(mem);
	}
	
	public void deletMember(String id) {
		for(int i = 0; i < list.size(); i++) {
			String tmp = list.get(i).getUserid();
			if(id.equals(tmp)) {
				list.remove(i);
				System.out.println("선택하신 회원을 삭제하였습니다.");
			}
		}
	}
	
	public void showInfo() {
		//System.out.println(list.size()); 확인용
		
//		for(Member m : list) { //출력타입은 모르겠으면 무조건 필드이름
//			m.disp(); //disp가 print를 가지고 있기 때문에 print 필요없음
//		}
		for(int i = 0; i < list.size(); i++) {
			//배열명.get(i).disp();
			list.get(i).disp();
			System.out.println("---------------------------");
		}
	}
}


