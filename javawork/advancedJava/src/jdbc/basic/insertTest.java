package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql 
			= "insert into tb_board values(board_seq.nextval,'jang','����','����',sysdate,0)";
		try {
			// 1. ����Ŭ ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε� ����");
			// 2. DBMS�� �����ϱ� - ���� ������ ����
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���Ἲ��"+con);
			// 3. sql�� �����ϱ� ���� ��ü�� ���� - ���������� ������Ѿ� �ϹǷ�
						// 								Connection��ü�� �̿��ؼ� ����
			Statement stmt = con.createStatement();
			System.out.println("SQL�� �����ϱ� ���� ��ü����:" + stmt);
			// 4. sql�����ϱ�
			int result = stmt.executeUpdate(sql);
			// 5. ��� ó���ϱ�
			System.out.println(result+"�� �� ���Լ���");
		}catch(ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		}catch(SQLException e) {
			System.out.println("���� ����");
			e.printStackTrace();//��������
		}
	}

}
