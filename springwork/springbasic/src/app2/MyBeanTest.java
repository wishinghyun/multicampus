package app2;
/*
 * 	oop�� ����Ǿ� �ִ� ���α׷�
 *  oopƯ���� �����ϱ� ���� ����Ŭ������ �����ϰ� MyBeanStyleXXX Ŭ������ ����ϴ� 
 *  �Ű������� Ÿ���� ����Ÿ������ �����Ͽ� �������� �����ߴ�
 *  ���Ǵ� ��ü�� ����Ǵ��� �ڵ带 �����ϴ� ������ �پ���
 *  
 *  �׷��� ���� ��ü�� �����ϴ� �������� �����ؼ� �����ϰ� �ִ�
 *  ����ϴ� ��ü�� �ٲ𶧸��� ��ü�� ���� �����ϴ� �ڵ带 ��� �����ؾ� �Ѵٴ� ������ ������
 *  ����ϴ� ������ ���� new�ؼ� ��ü�� �����ϴ� �ڵ�� �������� �ϴ� �ڵ� 
 */
public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("******************");
		obj.hello("����");
		obj.hello("����");
		System.out.println("******************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("====================");		
		obj.hello("����");
		obj.hello("����");
		System.out.println("====================");		
	}
}
