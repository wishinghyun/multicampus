package app1;
/*
 * 	���յ��� �ص��� ���� ���α׷�
 * 	=> Ŭ�������� ���յ��� ���ϰ� �������� ����
 * 	=> ���Ǵ� Ŭ������ �����ϸ� �� Ŭ������ ����ϰ� �ִ� ��� �ҽ��� �����ؾ� �Ѵ�
 * 	      ��, �����ؾ� �ϴ� ������ �о�����
 * 	   oopƯ���� ����Ǿ� ���� �ʴ�
 */
public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanStyleB obj = new MyBeanStyleB();
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyleB obj) {
		System.out.println("******************");
		obj.hello("����");
		obj.hello("����");
		System.out.println("******************");
	}
	public static void show(MyBeanStyleB obj) {
		System.out.println("====================");		
		obj.hello("����");
		obj.hello("����");
		System.out.println("====================");		
	}
}
