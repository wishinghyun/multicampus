package chap04;

import java.util.Scanner;
//��øif�� - if�� �ȿ� if�� �����ϰ� ����ϱ� (��� ����� ��ø�� �� �ִ�)
public class IfTest03 {
	public static void main(String[] args) {
//		Scanner�� ������ �Է� �޾� 90�� �̻��̸� "���"�� ����ϰ�
//		90�̸��̸� "�����"�� ����ϼ���
		Scanner key = new Scanner(System.in);
		System.out.print("��������:");
		int result = key.nextInt();
		
		System.out.print("����Ƚ��:");
		int count = key.nextInt();
		if (result>=90) {
			System.out.println("���");
		}else {
			if(count>=3) {
				System.out.println("ó������ �ٽ� ����...");
			}else {
				System.out.println("�� ���� �����...");
			}
		}
	}

}
