package lamda;

//disp()
interface MyLamda {
	
	void disp();
}


//람다식으로 화면 출력(syso)
public class LamdaEx { //인터페이스는 임플리먼츠를 달아야하지만 람다는 달지 않음

	public static void main(String[] args) {
		//화살표 함수 뒤에 중괄호는 한줄일 때는 생략
		
		//인터페이스를 구현해서 출력함
		
		//람다는 내용이 없기 때문에 객체 생성 불가 new 사용 불가
		//MyLamda m = () -> {작업내용};
		MyLamda m = () -> {
			System.out.println("Koreait Academy");
		};
		m.disp();
		
		System.out.println("------------------------------");
		
		MyLamda m2 = () -> System.out.println("코리아아이티 아카데미"); //한줄 일때는 중괄호 생략
		m2.disp();
		
		System.out.println("------------------------------");
		
		MyLamda m3 = () -> {
			String str = "코리아아이티 아카데미2";
			System.out.println(str);
		};
		
		m3.disp();
	}

}
