package chap04;

import java.util.Scanner;

public class IfExam01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		int num = key.nextInt();
		if (num<0) {
			System.out.println(num+"�� �����Դϴ�");
		}else {
			if(num>0 && num%2==1) {
				System.out.println(num+"�� �����Դϴ�");
			}else {
				System.out.println(num+"�� ¦���Դϴ�");
			}
		}
	}

}
