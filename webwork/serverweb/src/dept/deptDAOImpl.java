package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;

public class deptDAOImpl implements deptDAO {
	//delete
	public int delete(String deptNo) {
		int result = 0;
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "delete from mydept where deptno = ?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptNo);
			result = ptmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	//전체 목록 출력
	public ArrayList<deptDTO> getDeptList(){
		ArrayList<deptDTO> deptlist = new ArrayList<deptDTO>();
		deptDTO dept = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "select * from mydept";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				dept = new deptDTO(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5));
				deptlist.add(dept);
			}
			return deptlist;
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		return deptlist;
	}
	//부서등록
		public int insert(deptDTO user) {
			int result = 0;
			Connection con = null;
			PreparedStatement ptmt = null;
			String sql = "insert into mydept values(?,?,?,?,?)";
			try {
				con=DBUtil.getConnect();
				ptmt = con.prepareStatement(sql);
				ptmt.setString(1, user.getDeptNo());
				ptmt.setString(2, user.getDeptName());
				ptmt.setString(3, user.getLoc());
				ptmt.setString(4, user.getTel());
				ptmt.setString(5, user.getMgr());
				result = ptmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				DBUtil.close(null,ptmt, con);
			}
			return result;
		}
	}
