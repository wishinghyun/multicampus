package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanTest4 {
	public static void main(String[] args) {
		//ApplicationContext���� ����� �� ����
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("/config/bean.xml");
		//�⺻������ singleton�̹Ƿ� getBean�� 3�� ȣ���ص�
		//MyBeanStyleB��ü�� �� ���� �����Ǿ� ȣ��ȴ�
		//���� init�� �� �� ȣ��ȴ�
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean2");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean2");
		MyBeanStyle obj3 = (MyBeanStyle)factory.getBean("myBean2");
		run(obj1);
		show(obj1);
		
		//�����̳ʿ� ���� ������ ��ü�� �Ҹ�Ǵ� ������ �����̳ʰ� �Ҹ�ɶ�
		factory.close();
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
