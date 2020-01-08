package jdbc.member.exam;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	MemberDAO dao = new MemberDAOImpl();
	public void insertMenu(){
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		System.out.print("����:");
		String name = key.next();		
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		MemberDTO user = new MemberDTO(id, pass, addr, name, deptno);
		int result = dao.insert(user);
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
	public void findByAddrMenu(){
		System.out.println("*******����˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		ArrayList<MemberDTO> memberlist = dao.findByAddr(addr);
		int size = memberlist.size();
		for(int i = 0; i < size; i++) {
			MemberDTO member = memberlist.get(i);
			System.out.println(member.getId() + "\t" + member.getPass() + 
				"\t" + member.getName() +"\t"+ member.getAddr() +
				"\t" + member.getDeptno() + "\t" + member.getHiredate() +
				"\t" + member.getPoint());
		}
	}
	
	
	public void selectMenu(){
		System.out.println("*******�����ȸ********");
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		ArrayList<MemberDTO> memberlist = dao.memberList();
		int size = memberlist.size();
		for(int i = 0; i < size; i++) {
			MemberDTO member = memberlist.get(i);
			System.out.println(member.getId() + "\t" + member.getPass() + 
				"\t" + member.getName() +"\t"+ member.getAddr() +
				"\t" + member.getDeptno() + "\t" + member.getHiredate() +
				"\t" + member.getPoint());
		}
	}
	
	public void loginMenu() {
		System.out.println("*******�α���*******");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("��й�ȣ:");
		String pass = key.next();
		MemberDTO member = dao.login(id, pass);
		System.out.println(member.getId() + "\t" + member.getPass() + 
				"\t" + member.getName() +"\t"+ member.getAddr() +
				"\t" + member.getDeptno() + "\t" + member.getHiredate() +
				"\t" + member.getPoint());
	}
}


















