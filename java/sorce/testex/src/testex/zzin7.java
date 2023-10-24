//package testex;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import com.mysql.cj.jdbc.Driver;
//
////이렇게 넣으면댐
//class insertdb {
//	void insertdb() throws SQLException {
//		
//		Connection conn = null;
//		java.sql.Statement stmt = null;
//		ResultSet rs = null;
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "12345678");
//			stmt = conn.createStatement();
//			String sql = "INSERT INTO mem VALUES(NULL, '이태훈', 21)";
//			stmt.execute(sql);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
//	void selectdb() throws SQLException {
//		Connection conn = null;
//		java.sql.Statement stmt = null;
//		ResultSet rs = null;
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root", "12345678");
//			String sql = "SELECT * FROM mem";
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			
//			while(rs.next()) {//한줄 씩 값을 가져와서...
//				System.out.println("아이디 : " + rs.getInt(1) + ", 이름 : " + rs.getString(2) + ", 나이 : " + rs.getInt(3));
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//}
//
//
//public class zzin7 {
//
//	public static void main(String[] args) throws SQLException {
//		
//		insertdb in = new insertdb();
////		in.insertdb();
//		
//		in.selectdb();
//
//	}
//
//}
