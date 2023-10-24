package testex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

class boom {
	
	void insert() throws SQLException {
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4", "root", "12345678");
			stmt = conn.createStatement(); //크리에이트
			String sql = "INSERT INTO mem VALUES(NULL, '아무개', '5678')"; //넣고
			stmt.execute(sql); //엑스큐트
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void select() throws SQLException {
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4", "root", "12345678");
			
			String sql = "SELECT * INTO mem"; //찿기하고
			stmt = conn.createStatement(); //크리에이트
			rs = stmt.executeQuery(sql); //엑시큐트
			while(rs.next()) { //찾아오고
				System.out.println(rs.getInt(1) +"," + rs.getString(2) + ", " + rs.getString(3));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class uuin2 {

	public static void main(String[] args) throws SQLException {
		boom bo = new boom();
//		bo.insert();
		bo.select();
		
		
		
	}

}
