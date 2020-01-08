package chap08;
//������ ��������
import java.util.Scanner;

public class Prob1 {
	// �ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڷ� ��ȯ�� ���ڿ��� �Է¹ٶ��ϴ�.");
		String str = scan.nextLine();
		int result = 0;
		try {
			result = convert(str);
			System.out.println("��ȯ�� ���ڴ� "+result+" �Դϴ�");
		}catch(IllegalArgumentException e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�. ���ڿ��� �Է����� �ʰ� EnterŰ�� �����̽��ϴ�.");
		}
		
		// ���⸦ �ۼ��Ͻʽÿ�. try-catch�� ����ó��
	}

	// �ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	private static int convert(String str) throws IllegalArgumentException{
		// ���⸦ �ۼ��Ͻʽÿ�.	
		
		if (str == null | str.length() == 0) {
			throw new IllegalArgumentException();
		}
		return Integer.parseInt(str);
	}
}