package test;

import java.sql.Date;
import java.util.Scanner;

import jdbc.member.exam.MemberDAO;
import jdbc.member.exam.MemberDAOImpl;
import jdbc.member.exam.MemberDTO;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	CustomerDAO dao = new CustomerDAOImpl();
	public void insertMenu(){
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("����:");
		String name = key.next();		
		System.out.print("�Ի���:");
		int regdate = key.nextInt() 	
		System.out.print("����Ʈ:");
		String point = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		CustomerDTO customer = new CustomerDTO(id, pass, name, regdate, point, addr);
		int result = dao.insert(customer);
		if(result>0) {
			System.out.println("�Խñ۵�� ����");
		}else {
			System.out.println("�� ��� ����");
		}
	}
	public void updateMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.update(id, addr);
		if(result>0) {
			System.out.println("�Խñۼ��� ����");
		}else {
			System.out.println("�� ���� ����");
		}
	}
	public void deleteMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.delete(id);
		if(result>0) {
			System.out.println("�Խñۻ��� ����");
		}else {
			System.out.println("�� ���� ����");
		}
	}
}
