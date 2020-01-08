package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.boare.exam.BoardDTO;
import jdbc.boare.exam.DBUtil;

public class CustomerDAOImpl implements CustomerDAO{
	public int insert(CustomerDTO customer) {
		System.out.println("dto���޼ҵ�:"+customer);
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;//�޼ҵ� �������� ����� ����
		String sql 
		= "insert into customer values(?,?,?,?,?,?)";
		try {
			con = DBUtil.getConnect();//DBMS����
			stmt = con.prepareStatement(sql);
			stmt.setString(1, customer.getId());
			stmt.setString(2, customer.getPass());
			stmt.setString(3, customer.getName());
			stmt.setDate(4, customer.getRegdate());
			stmt.setInt(5, customer.getPoint());
			stmt.setString(6, customer.getAddr());
			result = stmt.executeUpdate();
			System.out.println(result+"�� �� ���Լ���");
		}catch(SQLException e) {
			e.printStackTrace();//��������
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}	
	
	public int delete(String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		String sql = "delete from customer where id = ? ";
		
		try {
			con = DBUtil.getConnect();
			System.out.println("���Ἲ��" + con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			result = stmt.executeUpdate();
			System.out.println(result + "�� ���� �����ƽ��ϴ�");
		} catch (SQLException e) {
			System.out.println("�������");
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	
	
	public int update(String id, String addr) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		String sql = "update customer set  = ? where boardnum = ? ";

		try {
			con = DBUtil.getConnect();
			System.out.println("���Ἲ��" + con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setInt(2, boardNum);
			result = stmt.executeUpdate();
			System.out.println(result + "�� ���� �����ƽ��ϴ�");		
		} catch (SQLException e) {
			System.out.println("�������");
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	
	
	public int insert(String id, String title,String content) {		
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;//�޼ҵ� �������� ����� ����
		String sql 
		= "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {
			con = DBUtil.getConnect();//DBMS����
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			result = stmt.executeUpdate();
			System.out.println(result+"�� �� ���Լ���");
		}catch(SQLException e) {
			e.printStackTrace();//��������
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
}
