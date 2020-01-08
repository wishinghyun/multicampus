package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsertTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		PreparedInsertTest obj = new PreparedInsertTest();
		System.out.println("*******�Խñ� ���************");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("����:");
		String title = key.next();
		System.out.print("����:");
		String content = key.next();
		System.out.println();
		obj.insert(id, title, content);
	}
	public void insert(String id, String title,String content) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		PreparedStatement stmt = null;
		/*String sql
		= "insert into tb_board values(board_seq.nextval,'"+
				id + "','" + title + "','" + content 
				+"',sysdate,0)";*/
		String sql 
		= "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			//1. PreparedStatement����
			stmt = con.prepareStatement(sql);
			//2. ?�� �� �����ϱ�
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			//3. �����ϱ�
			int result = stmt.executeUpdate();
			System.out.println(result+"�� �� ���Լ���");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();//��������
		}finally {
			try {
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			}catch (SQLException e) {
				e.printStackTrace(); 
			}
		}
	}
	
}










