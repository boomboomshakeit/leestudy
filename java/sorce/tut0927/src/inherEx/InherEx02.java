package inherEx;

class Cals {
	//더하기, 빼기
	int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	int sub(int num1, int num2) {
		return num1 - num2;
	}
}

class AdvCals extends Cals {
	int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	int div(int num1, int num2) {
		return num1 / num2;
	}
}

public class InherEx02 {

	public static void main(String[] args) {
		
		Cals cal = new Cals();
		System.out.println(cal.plus(1, 2));
		System.out.println(cal.sub(3, 1));
		
		System.out.println("---------------------");
		
		AdvCals ac = new AdvCals();
		System.out.println(ac.plus(3, 3));
		System.out.println(ac.sub(4, 2));
		System.out.println(ac.mul(5, 5));
		System.out.println(ac.div(6, 6));
		
		
	}

}
