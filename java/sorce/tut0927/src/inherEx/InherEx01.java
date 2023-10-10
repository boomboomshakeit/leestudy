package inherEx;

class Add {
	String title = "계산기 프로그램";
	
	void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//정수 + 정수 = 정수
	int add(int num1, int num2) {
		return num1 + num2;
	}
}

class Desktop extends Add {
	
	void Os() {
		System.out.println("Windows Ver 11....");
	}
}

class Laptop extends Add {
	
	void Os() {
		System.out.println("IOS Ver 17....");
	}
}


public class InherEx01 {

	public static void main(String[] args) {
		/*
		객체 => 상송 => 프로그램 확장(회원가입 -> 게시판 -> 다중 -> 일정......)
		C++ -> 다중상송 -> 상속(자바) : 강제x -> 인터페이스(다중) : 강제성	
							강제성  abstract  
								extends			implements
		*/
		
		Desktop d = new Desktop();
		System.out.println("데스크 탑 컴퓨터");
		d.title = "코리아아이티";
		d.Os();
		d.turnOn();		
		System.out.println(d.title);
		System.out.println(d.add(100, 200));
		d.turnOff();
		System.out.println("--------------------");
		
		Laptop lap = new Laptop();
		lap.turnOn();
		lap.Os();
		System.out.println(lap.title);
		System.out.println(lap.add(1, 2));
		lap.turnOff();
		
		
		
		
	}

}
