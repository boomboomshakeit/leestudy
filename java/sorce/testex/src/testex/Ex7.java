package testex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

class Ex7_1 {
	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Ex7_1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

class EE {
	
	void insertDB() throws SQLException {
		
	
	Connection conn = null;
	java.sql.Statement stmt = null;
	ResultSet rs = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "12345678");
		
		String sql = "SELECT * FROM mem ORDER BY id DESC";
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {//한줄 씩 값을 가져와서...
			System.out.println("아이디 : " + rs.getInt(1) + ", 이름 : " + rs.getString(2) + ", 나이 : " + rs.getInt(3));
			System.out.println("---------------------------------------");
		}
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	}

}
public class Ex7 {
	
	public static void main(String arg[]) throws SQLException {
		
		EE e = new EE();
		e.insertDB();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
