package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedSelectTest {
	public void select() {
		Connection con = null;
		PreparedStatement stmt = null;
		String url = "jdbc:oracle:thin:@70.12.115.57:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select id,title,content from tb_board";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = 
				DriverManager.getConnection(url, user, password);
			stmt = con.prepareStatement(sql);			
			//select문을 실행
			ResultSet rs =  stmt.executeQuery();
		//	System.out.println("rs:"+rs);
			//ResultSet에 레코드가 존재하는 동안 반복문을 실행
			while(rs.next()) {//=> 레코드를 조회하기 위해서는 
				              //   레코드가 한 개라도 반드시 커서를 이동시켜야한다.
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println(rs.getString(3)+"\t");
				/*System.out.println(rs.getString("content")+"\t");
				System.out.print(rs.getDate(5)+"\t");
				System.out.println(rs.getInt(6));*/
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {		
		PreparedSelectTest se = new PreparedSelectTest();		
		se.select();
	}
}






