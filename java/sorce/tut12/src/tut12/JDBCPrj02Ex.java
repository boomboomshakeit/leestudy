package tut12;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.xdevapi.Statement;

public class JDBCPrj02Ex {

	public static void main(String[] args) {
		
		JDBCPrj02Ex jdbc = new JDBCPrj02Ex();
		jdbc.insertDB();
	}
	
	public void insertDB() {
		try {
			
			
			//데이터베이스 연결 성공 시...
			//1.Class.forName();
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pwd = "12345678"; //비밀번호 내가 생성한걸로 해야함 기억 꼭할 것
			
			//연결객체
			//2.DriverManager.getConnecttion(url, id, pwd);
			DriverManager.getConnection(url, id, pwd);
			System.out.println("성공");
			
			//정상적으로 연결 된다면 Connection 객체로 받아주기
			Connection conn = DriverManager.getConnection(url, id, pwd);
//			//conn : 데이터베이스에 연결되었으니까...
			String sql ="INSERT INTO register VALUES(101, '홍길동', '1234')";
//			
//			//위 변수에 저장된 쿼리를 실행하는 craeStatement() 객체 사용
			java.sql.Statement stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("회원가입이 완료되었습니다.");
//			
			//3.createStatement("INSERT INTO ...");
			
			//4.
		}catch(Exception e) {
			System.out.println("데이터베이스 접속 실패...");
		}
	}

}
