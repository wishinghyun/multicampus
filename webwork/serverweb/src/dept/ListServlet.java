package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "list", urlPatterns = { "/dept/list.do" })
public class ListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		deptDAO dao = new deptDAOImpl();
		ArrayList<deptDTO> deptlist = dao.getDeptList();
		
		int size = deptlist.size();
		pw.print("<h1>�μ���Ϻ���</h1>");
		pw.print("<hr/>");
		pw.print("<table border='1' width='500px' style='border-collapse: collapse'>");
		pw.print("<tr>");
		pw.print("<th>�μ��ڵ�</th><th>�μ���</th><th>��ġ</th>");
		pw.print("<th>��ȭ��ȣ</th><th>������</th><th>����</th>");
		pw.print("</tr>");
		for (int i = 0; i < size; i++) {
			deptDTO dept = deptlist.get(i);
			pw.print("<tr>");
			pw.print("<td>"+dept.getDeptNo()+"</td>"
					+"<td>"+dept.getDeptName()+"</td>"
					+"<td>"+dept.getLoc()+"</td>"
					+"<td>"+dept.getTel()+"</td>"
					+"<td>"+dept.getMgr()+"</td>"
					+"<td><a href='/serverweb/dept/delete.do?deptno="+dept.getDeptNo()+"&info=test'>����</a></td>");
			pw.print("</tr>");
		}
		pw.print("</table>");
	}

}
