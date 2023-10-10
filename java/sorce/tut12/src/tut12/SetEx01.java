package tut12;

import java.util.HashSet;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {

//		Set -> HashSet
//		Set<> set = new HashSet<>();
		//HashSet 정수 저장
		//HashSet 문자열 저장
		//삭제, 출력
		
		Set<Integer> set = new HashSet<>();
		//배열명.add(값);
		set.add(100);
		set.add(200);
		set.add(300);
		
		//값을 배열 형태로...
		System.out.println(set.toString());
		System.out.println(set.size());
		
		System.out.println("------------------------");
		
		HashSet<String> hm = new HashSet<>();
		hm.add("Seoul");
		hm.add("Busan");
		hm.add("Seoul"); //중복된 값 허용 X
		System.out.println(hm.toString());
		System.out.println(hm.size());
		
		//hm.remove(0);
		hm.remove("Seoul");
		
		for(String str : hm) {
			System.out.println(str);
		}
		
		//검색 배열명.contains(검색어)
		Set<String> set2 = new HashSet<String>();
		set2.add("Red");
		set2.add("Green");
		set2.add("Blue");
		
//		System.out.println(set2.contains("Black"));
//		System.out.println(set2.contains("Red"));
		
		set2.remove("Green");
		System.out.println(set2.size());
		set2.removeAll(set2);
		System.out.println(set2.size());
	}

}
