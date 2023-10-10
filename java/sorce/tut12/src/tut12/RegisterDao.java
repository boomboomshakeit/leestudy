package tut12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RegisterDao {

	Set<Register> set = null;//줄만들기
	
	public RegisterDao() {//생성자
		set = new HashSet<>();//줄만들기
	}
	
	public void addRegister(Register r) { //레지스터에서 받는것
		set.add(r); 
	}
	
	//List index 번호로 구분
	//Set 값(객체)로 구분
	//Map key 구분
//	public boolean deleteRegister(int num) {
//		//향상된 for
//		for(Register r : set) {
//			if(num == r.getId()) {
//				set.remove(r);//r은 객체이기 때문에 객체로 지움
//				return true;
//			}
//		}
//		return false;
//	}
	
	public boolean deleteRegister(int num) {
		Iterator<Register> ir = set.iterator(); //set안에 있는 것을 객체 형태로 만듬
		while(ir.hasNext()) {
			Register reg = ir.next();
			int tmp = reg.getId();
			if(num == tmp) {
				set.remove(reg);
				return true;
			}
		}
		return false;
	}
	
	
	public void showInfo() {
		for(Register reg : set) {
			reg.disp();
		}
	}
}
