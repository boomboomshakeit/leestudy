package lamda;

/*
 * Hello
 * World
 * Hello World
 */
//인터페이스 : 두개의 문자열 매개변수
interface ConcatStr {
	
	void makeConcat(String s1, String s2);
}

//구현(클래스 - 생성자 가능) : 두개의 문자열을 연결(+) - 강제 오버라이딩
class ConcatStrImpl implements ConcatStr {

	@Override
	public void makeConcat(String s1, String s2) {
		
		System.out.println(s1 + " " + s2);
	}
	
	
}

public class LamdaEx6 {

	public static void main(String[] args) {
		
		ConcatStrImpl csi = new ConcatStrImpl();
		csi.makeConcat("Hello", "World");
		
		System.out.println("--------------------");
		
		ConcatStr cs = (str1, str2) -> {
			System.out.println(str1 + " " + str2);
		};
		cs.makeConcat("코리아아이티", "아카데미");
	}

}
