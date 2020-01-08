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
			//select���� ����
			ResultSet rs =  stmt.executeQuery();
		//	System.out.println("rs:"+rs);
			//ResultSet�� ���ڵ尡 �����ϴ� ���� �ݺ����� ����
			while(rs.next()) {//=> ���ڵ带 ��ȸ�ϱ� ���ؼ��� 
				              //   ���ڵ尡 �� ���� �ݵ�� Ŀ���� �̵����Ѿ��Ѵ�.
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






