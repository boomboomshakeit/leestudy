package emp.service;

import java.util.Scanner;

import emp.vo.Employee;

public class EmployeeSrv {
	
	Scanner sc = new Scanner(System.in);
	Employee[] emp = null;
	
	public void menu() {
		//1.사원생성 | 2.사원등록 | 3.사원목록 | 4.종료
		System.out.println("**********Welcome To Employees System**********");
		System.out.println("1.사원생성"); //create
		System.out.println("2.사원등록"); //add
		System.out.println("3.사원목록"); //list
		System.out.println("4.종료");
	}
	
	public void empCreate() {
		System.out.println("사원생성페이지");
		System.out.println("");
		System.out.println("등록할 사원 수 > ");
		int count = sc.nextInt();
		emp = new Employee[count]; //스캐너에 입력된 문자를 정수로 바꾼 것을 배열에 넣음
		System.out.println(emp.length + "명의 사원을 등록할 수 있습니다.");
		System.out.println("");
	}
	
	public void empAdd() {
		System.out.println("사원등록페이지");
		System.out.println(emp.length + "명의 사원을 등록합니다.");
		for(int i = 0; i < emp.length; i++) {
			emp[i] = new Employee(10001L, "인사과", "홍길동", 1000000); //사원을 등록시킴
		}
		System.out.println("사원이 등록되었습니다.");
	}
	
	public void empList() {
		System.out.println("사원목록페이지");
		
		System.out.println(emp.length + "명의 사원목록을 출력합니다.");
		
		for(Employee person : emp) {
			System.out.println(person);
			System.out.println("-----------------------------");

		}

	}
}
