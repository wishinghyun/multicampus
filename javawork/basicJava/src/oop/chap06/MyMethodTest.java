package oop.chap06;

//MyMethod Ŭ�������� ������ �޼ҵ带 ����ϴ� Ŭ����
public class MyMethodTest {
	public static void main(String[] args) {
		System.out.println("****���α׷� ����****");
		MyMethod m = new MyMethod();

		// 1. �Ű������� ���� void�� �޼ҵ��� ȣ��
		m.display();
		System.out.println("****step1****");
		m.display();
		System.out.println("****step2****");
		m.display();

		// 2. �Ű������� 1��, ���ϰ��� ���� �޼ҵ��� ȣ��
		m.display("��");
		m.display("��");
		m.display("��");

		// 3. ���ϰ��� ���� �Ű������� 2���� �޼ҵ��� ȣ��
		// m.display(50,"��"); //display(int,String)
		m.display("��", 30);
		m.display("��", 50); // display(String,int)

		// �Ű������� ���ϰ��� �ִ� �޼ҵ��� ȣ��
		// ���ϰ��� ���� ��� ���ϰ��� ������ Ÿ���� ������ �����ؼ� �����ؾ� �Ѵ�
		// �Ǵ� �ٸ� �޼ҵ��� �Ű������� ������ �� �ִ�
		int result = m.add(100, 200);
		System.out.println("�޼ҵ� ȣ�� ���=>" + result);

		System.out.println("�޼ҵ� ȣ�� ���=>"+m.add(100, 200));
	}

}
