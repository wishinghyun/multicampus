package oop.chap06;

//Person Ŭ������ ����ϴ� Ŭ����
public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person("�嵿��","�����",45);
		System.out.println(p.getName()+","+p.getAddr()+","+p.getAge());
		Person pp = new Person("������","�����",27);
		System.out.println(pp.getName()+","+pp.getAddr()+","+pp.getAge());
		
		/*Person p1 = new Person();
		p1.setName("�嵿��");
		p1.setAddr("�����");
		p1.setAge(45); // age������ private���� ����Ǿ� �����Ƿ� ������ �� ����
					 // ���� Ŭ���������� ������ �� ����
		System.out.println("����:" + p1.getName());
		System.out.println("�ּ�:" + p1.getAddr());
		System.out.println("����:" + p1.getAge());

		Person p2 = new Person();
		p2.setName("������");
		p2.setAddr("�����");
		p2.setAge(25);
		System.out.println("����:" + p2.getName());
		System.out.println("�ּ�:" + p2.getAddr());
		System.out.println("����:" + p2.getAge());*/
	}

}
