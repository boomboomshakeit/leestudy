package tut11;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {

		//정수 타입 입력 후 -> 삭제 -> 출력(for1)
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		list.add(100);
//		list.add(200);
//		list.add(300);
//		
//		list.remove(1);
//		list.remove(0);
//		
//		for(int i = 0; i < list.size(); i ++) {
//			System.out.println(list.get(i));
//		}
		
		System.out.println("-------------------");
		
		//문자열 입력, 삭제, 출력
		List<String> aList = new ArrayList<String>();
		
		aList.add("#f 0 0"); //red
		aList.add("#0 f 0"); //green
		aList.add("#0 0 f"); //blue
		
		aList.remove(2);
		aList.remove("#f 0 0");
		for(int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}
	}

}
