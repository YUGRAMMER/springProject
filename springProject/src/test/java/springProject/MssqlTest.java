package springProject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class MssqlTest {
	 private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	 private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=mono;encrypt=true;trustServerCertificate=true";
	 private static final String USER = "mono"; //DB 사용자명
	 private static final String PW = "mono";   //DB 사용자 비밀번호

	 @Test
	 public void testConnection() throws Exception{

		 Class.forName(DRIVER); //com.microsoft.sqlserver.jdbc.SQLServerDriver JDBC Driver class 로딩

		 Connection con = DriverManager.getConnection(URL, USER, PW); // java.sql.Connection 객체생성

		 try{
			 System.out.println(con);
			 
			 System.out.println(con.isClosed()); // connection 닫힘 유무

			 Statement stmt = con.createStatement(); // Statement 객체생성

			 String sql = "select user_no,user_id,user_pw from tb_user"; // 쿼리문

			 ResultSet rs = stmt.executeQuery(sql); // 

			 while(rs.next()) {
				 System.out.println(rs.getInt("user_no")+"///"+rs.getString("user_id")+"///"+rs.getString("user_pw"));
			 }

			 con.close();

			 System.out.println(con.isClosed());
		 }catch (Exception e) {
			 e.printStackTrace();
		 }finally {
			 con.close();
		 }
	}
}