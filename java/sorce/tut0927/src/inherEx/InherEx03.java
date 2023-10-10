package inherEx;


public class InherEx03 {

	public static void main(String[] args) {
		
		//interface, abstract -> 객체 생성해서 사용x(new x)
		//본체({} x)
		
		Student std = new Student();
		std.eat();
		std.study();
		std.stdId = " A200100001";
		std.name = "홍길동";
		std.age = 20;
		std.eat();
		std.sleep();
		
		System.out.println("--------------------");
		
		Employee emp = new Employee();
		emp.eat();
		emp.work();
		emp.empId = "100500001";
		emp.name = "나출근";
		emp.age = 30;
		emp.eat();
		emp.sleep();
		
		
		
		
		
	}

}
