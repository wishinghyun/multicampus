package chap04;

import java.util.Scanner;

//while���� do - while ���� ������
public class DoWhileTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = 0;
		while (num>10) {
			System.out.println("�����Է�:");
//			while���� ������ �������� ������ ������ �ڵ尡 ������� �ʴ´�
			System.out.println("while�� - �����ɹ� :"+num);
		}
//		num = 10;
		do {
			System.out.println("�����Է�:");
			num = key.nextInt();
			System.out.println("do_while�� - �����ɹ�"+num);
		}while(num>10);
	}

}
