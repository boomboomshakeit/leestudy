package generic;

class Fruit2 {
	
	void fruit2() {
		System.out.println("과일입니다.");
	}
}

class Pencil2 {
	
	void pencil2() {
		System.out.println("연필입니다.");
	}
}

class Box {
	
	//저장할때는 문제가 없지만 출력 시 형 변환을 해야함
	private Object obj; //어떤 객체가 들어오든지 다 저장이 가능함

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
}

public class Object01 {

	public static void main(String[] args) {
		
		Box box = new Box();
		box.setObj(new Fruit2());
		Fruit2 f2 = (Fruit2) box.getObj();
		
		System.out.println(f2);
		
		System.out.println("-------------------");
		
		Box box2 = new Box();
		box.setObj(new Pencil2());
		Pencil2 p2 = (Pencil2) box.getObj();
		
		Object str = "koreait";
		String s = (String) str;
		System.out.println(s);
		
		Object i = 100;
		Integer num = (Integer) i;
		System.out.println(num);
		
		
		
	}

}
