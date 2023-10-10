package tut1005;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

//동작을 별도 클래스 작업
class DBDao {
	
	void insertDB() throws ClassNotFoundException, SQLException { // I/O
		/*
		 1. 연결 : Connection 객체
		 2. 쿼리실행 : insert, update, delete, select 동작.. clone(). : Statement
		 3. 결과 출력 : ResultSet
		 */
		Connection conn = null;
		java.sql.Statement stmt = null; //연결객체.state
		
		//Class.forName()
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/grp";
		//String url = "jdbc:mysql://127.0.0.1:3306/grp"; 이렇게도 사용가능
		String uid = "root";
		String pwd = "12345678";
	
		//접속 정보
		conn = DriverManager.getConnection(url, uid, pwd);
		//System.out.println("연결"); //실행 확인
		stmt = conn.createStatement(); //쿼리 실행하기 위한 사전작업
		
		//쿼리 실행
		String sql = "INSERT INTO member VALUES(NULL, '김유신', now(), now());";
		stmt.execute(sql);
		System.out.println("Insert Complete");
		//Comment 출력
		
	}
}


public class JDBCPrj03 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DBDao dbdao = new DBDao();
		dbdao.insertDB();
		
	}

}
