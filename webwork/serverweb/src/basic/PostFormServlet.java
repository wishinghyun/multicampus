package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostFormServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
							throws ServletException,IOException{
		req.setCharacterEncoding("euc-kr");
		String id = req.getParameter("userId");
		String name = req.getParameter("userName");
		String pass = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String[] favo = req.getParameterValues("item");
		
		System.out.println("Customer");
		System.out.println("--------");
		System.out.println("���̵�:"+id);
		System.out.println("����:"+name);
		System.out.println("�н�����:"+pass);
		System.out.println("����"+gender);
		System.out.println("JOB"+job);
		System.out.println("Favorites:");
		for (String string : favo) {
			System.out.print(string);
		}		
	}
}
