package chap05;
//�迭�� �ۼ��ϰ� �������ϱ�
public class ArrayExam01 {
	public static void main(String[] args) {
		int[] myarr = new int[10];
		myarr[2] = 100;
		myarr[3] = 200;
		myarr[5] = 300;
		for (int i = 0;i<myarr.length;i++) {
			System.out.println(myarr[i]);
		}
	}

}
