package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedDeleteTest {
	public void delete(int boardnum) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "delete from tb_board where boardnum = ? ";
		/*
		 * StringBuffer sql = new StringBuffer(); sql.append("delete tb_board ");
		 * sql.append("where boardnum=22");
		 */
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("���Ἲ��" + con);
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, boardnum);
			int result = stmt.executeUpdate();
			System.out.println(result + "�� ���� �����ƽ��ϴ�");
		} catch (ClassNotFoundException e) {
			System.out.println("�ε�����");
		} catch (SQLException e) {
			System.out.println("�������");
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		PreparedDeleteTest de = new PreparedDeleteTest();
		System.out.print("��ȣ: ");
		int boardnum = key.nextInt();
		System.out.println();
		de.delete(boardnum);

	}

}
