package oop.chap06;

import java.util.Scanner;

public class Person_Insa {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("********�λ�����ý���********");
		System.out.println("1.�λ���");
		System.out.println("2.��������");
		System.out.println("3.����������ȸ");
		System.out.println("4.��������ȸ");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
		int work = key.nextInt();
		switch(work) {
		case 1:
			System.out.println("====�λ���====");
			System.out.print("����:");
			String name = key.next();
			System.out.print("�ּ�:");
			String addr = key.next();
			System.out.print("����:");
			int age = key.nextInt();
			Person p = new Person();
			p.name = name; //Person ��ü�� name ���� = ����ڰ� �Է��� name��
			p.addr = addr;
			p.age = age;
			System.out.println(p.name+","+p.addr+","+p.age);
			
			break;
		case 2:
			System.out.println("======���������ϱ�======");
		}
	}

}
