package chap04;
//�Է¹��� �������� ���
import java.util.Scanner;

public class ForExam02 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("��� ��:");
		int num1 = num.nextInt();
		for (int i = 1; i <=9; i++) {
			System.out.println(num1+"*"+i+"="+num1*i);
		}
	}

}
