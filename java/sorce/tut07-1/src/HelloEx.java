
public class HelloEx {

	
		//접근제한자 리턴타입 메소드명(매개변) {
			//return 변수명;
			//}
			
			
			//접근제한자 - public(아무나) private(나만 : 캡슐화)
			//리턴타입 - syso를 쓸거면 void를 사용, syso안쓸거면 타입을 적어야함
			
//	public void disp(String title) {
//			System.out.println("" + title + "아카데미");	
//	}
	
	public void title(String str) {
		//부산 koreait 아카데미
		//서울 koreait 아카데미
		//광주 koreait 아카데미
		System.out.println("" + str + "코리아아이티 아카데미");
	}
	
	public void info(String tel, String addr) {
		System.out.println("전화번호 : " + tel);
		System.out.println("주소 : " + addr);
	}
	
	public static void main(String[] args) {
		
		//단순 출력
		//System.out.println("코리아아이티 아카데미");
		
		//다른 메소드를 가져다 쓰려면....
		//메소드가 있는 클래스명을 사용한다.
		//클래스명 이름 = new 클래스명();
//		HelloEx he = new HelloEx();
//		he.disp();
		
		//HelloEx he = new HelloEx(); //안에 있는 것을 사용할 수 있게 
		//보낼 때 값 -> 받을 때는 타입 변수
		//he.disp("서울"); //메소드를 동적으로 처리하기 위해
		//he.disp("부산"); //he 안에 disp를 가지고옴
		
		//코리아아이티 아데미 : sysout
		//전화번호, 주소
		//코리아아이티 아카데미 : susout
		
		//HelloEx 클래스 안의 내용 전체를 가져온다
		HelloEx busan =  new HelloEx();
		busan.title("부산");
		busan.info("051 - 123 - 5678", "부산광역시");
		busan.title("부산");
		
		System.out.println("---------------------------------");
		
		HelloEx seoul = new HelloEx();
		seoul.title("서울");
		seoul.info("02 - 123 - 4567", "서울특별시");
		seoul.title("서울");

		System.out.println("---------------------------------");

		HelloEx gwangju = new HelloEx();
		gwangju.title("광주");
		gwangju.info("063 - 123 - 4567", "광주광역시");
		gwangju.title("광주");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
