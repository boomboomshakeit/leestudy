
public class HelloEx2 {
	
//	접근제한 리턴 메소드() { 이것만으로 화면 출력X
//		return 값;
//	}

	public String title(String company) { //이것만으로 화면출력X
		return "" + company + "코리아아이티 아카데미"; //return company; 사용 시 내가 입력한 것이 출력됨
	}
	
	public static void main(String[] args) {
		//코리아아이티 아카데미
		//전화번호, 주소
		//코리아아이티 아카데미
		HelloEx2 he = new HelloEx2(); //클래스  안에 메소드 가져오려면....
		System.out.println(he.title("부산"));
		
		System.out.println(he.title("서울"));
		
		System.out.println(he.title("광주"));
	}

}
