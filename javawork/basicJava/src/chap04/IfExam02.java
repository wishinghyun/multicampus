package chap04;

// if���� ��ø�ؼ� ����ϴ� ���� - gender�� age�� �Ǵ��ؼ� ����� ����ϴ� ����
import java.util.Scanner;

// Ctrl + shift + f �� ������ �ڵ带 ����
public class IfExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("���ڴ� 1,3 ���ڴ� 2,4�� �Է��� ��");
		System.out.print("������ �Է��ϼ���:");
		int sex = key.nextInt();

		if (sex < 1 || sex > 4) {
			System.out.println("���ڸ� �߸��Է�");
		} else {
			System.out.print("���̸� �Է��ϼ���:");
			int age = key.nextInt();
			if (sex == 1 || sex == 3) {
				if (age >= 1 && age < 20) {
					System.out.println("û�ҳⳲ��");
				} else {
					System.out.println("���γ���");
				}
			} else {
				if (age >= 1 && age < 20) {
					System.out.println("û�ҳ⿩��");
				} else {
					System.out.println("���ο���");
				}

			}
		}

	}

}
