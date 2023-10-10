package emp.vo;

import java.time.LocalDateTime;

public class Employee {
	
	private Long id;
	private String depart;
	private String name;
	private int salary;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	public Employee() {}

	public Employee(Long id, String depart, String name, int salary) {
		super();
		this.id = id;
		this.depart = depart;
		this.name = name;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}


	@Override
	public String toString() {
		return "사번 : " + id + ", 부서 : " + depart + ", 이름 : " + name + ", 급여 : " + salary;
	}
	
	
	
	
}
