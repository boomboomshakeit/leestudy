package tut08;

class Const {
	/*
	//default 생성자 생략 가능 그 외의 생성자는 만들어서 사용
	public Const() {}
	
	public Const(String str) { // 클래스 이름과 같으면 생성자 다르면 메소드
		System.out.println(str);
	}
	
	public Const(String str, String domain) {
		System.out.println("" + str + "," + domain + "");
	}
	*/
	
	public Const(String str) {//생성자 - 클래스와 이름이 같음
		System.out.println(str);
	}
	
	public Const(String str, String tel) {//생성자 - 클래스와 이름이 같음
		this(str);
		System.out.println(tel);
		//this(str);
		//this(tel); 이것들도 가능
	}
	
	public Const(String str, String tel, String addr) {//생성자 - 클래스와 이름이 같음
		this(str, tel);
		System.out.println(addr);
	}
	
	public int add(int num1, int num2) {//메소드
		return num1 + num2;
	}
	
	public String close(String str) {//메소드
		return str; 
	}
}

public class ConstEx {

	public static void main(String[] args) {
		/*
		Const c = new Const();
		
		
		//초기값 : 코리아아이티 출력 -> 작업
		Const c2 = new Const("코리아아이티");
		
		//초기값 : 코리아아이티, 도메인 출력 -> 작업
		Const c3 = new Const("코리아아이티", "koreait.com");
		*/
		
		
		//코리아아이티 계산기 Ver1.0 - 생성자
		//정수 + 정수 = 정수 메소드
		//프로그램 종료 - 메소드
		
		Const cal = new Const("코리아아이티 계산기 Ver1.0");
		System.out.println(cal.add(100, 200));
		System.out.println(cal.close("프로그램 종료"));
		
		System.out.println("-----------------------------");
		
		//코리아아이티, 전화번호
		Const seoul = new Const("코리아아이티 계산기 Ver1.0", "02 - 123 - 4567");
		
		System.out.println("-----------------------------");
		
		//코리아아이티, 전화번호, 주소
		Const gwangju = new Const("코리아아이티 계산기 Ver1.0", "02 - 123 - 4567", "광주광역시");
				
		
		
		
		
		
		
		
	}

}
