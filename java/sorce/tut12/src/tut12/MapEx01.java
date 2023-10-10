package tut12;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		
		//Map - HashMap
		//101 -> 서울
		//102 -> 부산
		//103 -> 대구
		//104 -> 서울
		
		//Map<key, value> map = new HashMap<k, v>();
		
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "서울");
		map.put(102, "부산");
		map.put(103, "대구");
		
		//System.out.println(map.toString());
		/*
		배열명.forEach((키별명, 값별명) -> {
			출력코드;
		});
		*/
		map.forEach((k,v) -> {
			System.out.println("키는 " + k + ", 값은 " + v);
		});
		
		System.out.println("---------------------");
		
		/*
		userid1 -> 홍길동
		userid2 -> 김철수
		userid3 -> 이영희
		*/
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("userid01", "홍길동");
		map2.put("userid02", "김철수");
		map2.put("userid03", "이영희");
		
		map2.put("userid04", "이영희");
		
		map2.forEach((key, value) -> {
			System.out.println("key는 " + key +  ", value는 " + value);
		});
		
		System.out.println(map2.containsValue("김철수2")); //value에 그 값이 있는지 없는지 확인하는 거
		
		System.out.println(map2.containsKey("userid01")); //key에 그 값이 있는지 없는지 확인하는 거
		
		
		
		
		
		
	}

}
