package generic;

import java.util.ArrayList;
import java.util.List;

class Fruit3 {
	
	void furit3() {
		System.out.println("과일입니다.");
	}
}

class Pencil3 {
	
	void pencil3() {
		System.out.println("연필입니다.");
	}
}

class Box3<T> {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class Generic {

	public static void main(String[] args) {
		
		//List<Member> list = new ArrayList<>();
		Box3<Fruit3> box1 = new Box3<>();
		box1.setT(new Fruit3());
		
		Fruit3 f2 = box1.getT();
		System.out.println(f2);
		
		
		
		
		
		
	}

}
