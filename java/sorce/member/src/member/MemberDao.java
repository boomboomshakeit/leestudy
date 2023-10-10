package member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MemberDao {
	
	Map<String, Member> map = null;
	
	public MemberDao() {
		map = new HashMap<>();
	}
	
	public void putMember(String id, Member m) {
		map.put(id, m);
	}
	
	public boolean deleteMember(String uid) {
		//Map loop사용 안함
		//true, false
		if(map.containsKey(uid)) {
			map.remove(uid);
			return true;
		}
		
		return false;
	}
	
	public void showInfo() {
		/*
		 * 배열명.forEach((key, value)-> {
		 * 		출력코드 = 배열명.get;
		 * })
		 */
		map.forEach((k, v) -> {
			Member mem = map.get(k); //키의 값을 멤버 안에 담음
			mem.disp();
		});
	}
}
