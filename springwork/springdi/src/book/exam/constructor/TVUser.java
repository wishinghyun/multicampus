package book.exam.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 *  �����������̳ʿ� ���� �����ؼ� ��ü�� ���޹޾� ����� �� �ֵ��� �����ϱ�
		 *  Dependency Lookup����
		 *  �������� : config/bean.xml
		 *  �� ��� : 
		 *  	SamsungTV => samsung
		 *  	LgTV => lg
		 *  
		 *  getBean���� ���ͼ� �۾��ϵ��� �ڵ� �����ϱ�
		 */
		
		ApplicationContext factory = 
					new GenericXmlApplicationContext("/config/bean.xml");
		Brand tv = factory.getBean("tv",Brand.class);
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
	}

}
