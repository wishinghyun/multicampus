package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 	�������� �̿��ؼ� ���α׷��� �����ϱ�
 * 	- new�����ڸ� �̿��ؼ� ��ü�����ϴ� �ڵ带 ���� �������� �ʴ´�(API����)
 * 	- ������ ���ο��� �����ϴ� FactoryŬ������ �̿��ؼ� ��ü�� ���޹޴´�
 */
public class MyBeanTest {
	public static void main(String[] args) {
		//�������� FactoryŬ������ ����
		ApplicationContext factory = 
				new GenericXmlApplicationContext("/config/bean.xml");
		//�ʿ��� ��ü�� factory�� ���� �����´�
		//�������Ͽ� ����� id���� ���� - <bean>�±��� id�Ӽ��� ����
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean");
		//�����Ͻ����� ȣ��
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
