package chap04;
//While�� ���� - ForTest01.Java ���� �۾��� ������ While ������ ����
//"�ڹ����α׷���" 5�� ���
public class WhileTest01 {
	public static void main(String[] args) {
		int i = 1;
		while(i<=5) {
			System.out.println("�ڹ����α׷���"+i);
			i++; // i = i + 1
		}
		System.out.println("=====================");
		i = 1;
		while(true) {
			if(i>5) {
				break;
			}
			System.out.println("�ڹ����α׷���"+i);
			i++;
		}
	}

}
