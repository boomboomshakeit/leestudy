package tut03;

public class StringEx3 {

	public static void main(String[] args) {
		
		// 걑은 타입을 이름 하나로 많은 데이터를 다루기 위해 필요 - 배열[] + for
		// 다른 타입을 다루기 위해서는 객체 - for 

		//소문자 -> 대문자
		//값.toUpperCase();
		String title = "korea it academy";
		System.out.println(title.toUpperCase());
		
		System.out.println("---------------------------");
		
		//split , ; | 등으로 사용 가능              스플릿 다시보기!!!!!!!!!!!!!!
		String menus = "Home:Company:Contact:Help";
		
		//System.out.println(menus.split("|")); // 이렇게 할 시에는 메모리 주소가 나옴 
		
		String[] s = menus.split(":"); //메뉴를 파이프 기준으로 쪼개시오
		
		//System.out.println(s[1]); //2번째 것을 뽑는것
		
		/*
		향상된 for(데이터타입 별명 : 배열이름) {
			출력코드
		}
		*/
		
//		for(String result : s) {
//			System.out.println(result);
//		}
		
		/*
		for(int i = 0; i < s.length; i++) {
			System.out.println(s.[i]);
		}
		*/
		
		System.out.println(s.length); //나눈 것의 길이를 구하는 것 
		
		
		System.out.println("---------------------------");
		
		//정수 생성 후 초기값은 100
		//출력 : 생성된 변수의 초기값은 100입니다.
		
		int num = 100;
		System.out.println("초기값은 " + num + "입니다.");
		
		//decimal : 10진수 printf에서는 이렇게 사용
		System.out.printf("생성된 변수의 초기값은 %d 입니다.\n", num);
		
		
		String str = "부산";
		
		/*
		 * 2진수 -> binary => 01010101
		 * 8진수 -> Oct => 01 010 101
		 * 16진수 -> hex => 0101 0101 -> 0 ~ 9 , a(10) b(11) c d e f(15)
		 * EX) RGB fff = 255 255 255
		 * 10진수 -> dec 
		 */
		
		System.out.printf("내가 사는 곳은 %s입니다.", str);
		
		
		
		
		
		
		
		
		
		
		
	}

}
