package chap04;
//break�� ���� - break���� ����� ���� ����������
public class GuGu_Break {
	public static void main(String[] args) {
		for (int dan = 2; dan <= 9; dan++) {
			if( dan == 5) {
				break;
			}
			for (int i = 1; i <= 9; i++) {
				/*if(dan==5) { break���� ���� for�� ����Ǿ� �����Ƿ�
					break;     �ݺ����� ������� �ʴ´�
				}*/
				System.out.print(dan + "x" + i + "=" + i * dan + "\t");
			}
			System.out.println();
		}
	}

}
