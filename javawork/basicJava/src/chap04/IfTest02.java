package chap04;
//if~else���� Scanner
import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
//		Scanner�� ������ �Է� �޾� 90�� �̻��̸� "���"�� ����ϰ�
//		90�̸��̸� "�����"�� ����ϼ���
		Scanner key = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int result = key.nextInt();
		if (result>=90) {
			System.out.println("���");
		}else {
			System.out.println("�����");
		}
	}

}
