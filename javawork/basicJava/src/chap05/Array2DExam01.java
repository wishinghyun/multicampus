package chap05;

/*2���� �迭����
 * [�������]
1	2	3	4	5
6	7	8	9	10
11	12	13	14	15
16	17	18	19	20
21	22	23	24	25

*	2	3	4	5
6	*	8	9	10
11	12	*	14	15
16	17	18	*	20
21	22	23	24	*
*/
public class Array2DExam01 {
	public static void main(String[] args) {
		
		
		// 3. 2���� �迭�� ����� �����͸� ������¿� ���� ����ϱ�
		// 1. 2���� �迭�� ����
		int[][] myarr = new int [5][5];
		// 2. 2���� �迭�� ���� �����ϱ� - setting
		int value = 1;
		for (int j = 0; j < myarr.length; j++) {
			for (int i = 0; i < myarr[j].length; i++) {
				myarr[j][i] = value;
				value++;
				System.out.print(myarr[j][i] + "\t");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for (int j = 0; j < myarr.length; j++) {
			for (int i = 0; i < myarr[j].length; i++) {
				if(i==j) {
					System.out.print("*"+"\t");
				}else {
					System.out.print(myarr[j][i] + "\t");
				}
					
			}
			System.out.println();
		}

	}
}
