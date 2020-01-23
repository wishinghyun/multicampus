package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//BeanFactory����ؼ� �۾��ϱ�
//1. xml�� spring���� ����� �� �ֵ��� ��ü�� ��ȯ�ϴ� �۾��� �����ϴ� ��ü����
//	 -> ClassPathResource�� xml������ classpath(src)���� ã�´�
//2. �����̳� ��ü�� ����
public class MyBeanTest2 {
	public static void main(String[] args) {
		//1. xml�Ľ�
		Resource res = new ClassPathResource("/config/bean.xml");
		//2. �����̳ʰ�ü�� ����
		BeanFactory factory = new XmlBeanFactory(res);
		//3. �����̳ʰ� �����ϴ� ��ü�� ���޹ޱ�
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
