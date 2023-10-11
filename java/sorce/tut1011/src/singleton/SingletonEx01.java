package singleton;

class SingletonTest {
	
//	public SingletonTest() {}
	
	//필드
	private static SingletonTest st = new SingletonTest();
	private SingletonTest() {} //db커넥션 연결 되었다고 가정...
	
	public static SingletonTest getInstance() {//instance = 연결
		return st;
	}
}

public class SingletonEx01 {

	public static void main(String[] args) {
		
		//생자를 호출하면 호출하는 개수 객체
		
		//A
//		SingletonTest st1 = new SingletonTest();
//		
		//B
//		SingletonTest st2 = new SingletonTest();
//		
//		System.out.println(st1);
//		System.out.println(st2);
//		System.out.println(st1 == st2);

		SingletonTest st1 = SingletonTest.getInstance();
		SingletonTest st2 = SingletonTest.getInstance();
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st1 == st2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
