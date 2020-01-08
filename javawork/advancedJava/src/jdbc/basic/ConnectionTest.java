package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//����Ŭ�� �����ϱ�
public class ConnectionTest {
	// 127.0.0.1 = localhost = ���� �۾����� �� pc
	public static void main(String[] args) {
		// ���Ṯ�ڿ� - � DBMS�� �����Ŀ� ���� ������ �޶�����
		// String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		// String url = "jdbc:oracle:thin:@70.12.115.57:1521:xe";
		// ���ݿ� �ִ� ���� DB���� ip
		String url = "jdbc:oracle:thin:@70.12.115.58:1521:xe";
		// ���Ӱ���
		String user = "scott";
		// ������ ������ �н�����
		String password = "tiger";
		try {
			// 1. ����Ŭ ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε� ����!!");
			
			// 2. DBMS�� �����ϱ� - ���� ������ ����
			// ==> DBMS�� �����ϰ� ���������� ConnectionŸ������ ��ȯ�Ѵ�
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ����!!" + con);
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��ε� ����");
		} catch (SQLException e) {
			System.out.println("���� ����" + e.getMessage());
		}
	}

}
