package chap05;
//2�����迭�� ����� ������ �ʱ�ȭ�ϱ�
public class Array2DTest03 {
	public static void main(String[] args) {
		int[][] myarr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},				
			}; //int[][] myarr = new int [3][5]
		
		int[][] myarr2 = {
				{1,2,3},
				{6,7,8,9},
				{11,12,13,14,15},				
			}; //int[][] myarr = new int [3][]
		
		
		// myarr�� myarr2�� �迭�� �迭�� ����� ���� ����ϱ�
		for(int row=0;row<myarr.length;row++) {
			for(int i = 0;i<myarr[row].length;i++) {
				System.out.print(myarr[row][i]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		for(int row=0;row<myarr2.length;row++) {
			for(int i = 0;i<myarr2[row].length;i++) {
				System.out.print(myarr2[row][i]+"\t");
			}
			System.out.println();
		
		}
	}

}
	
	
	
	
	
	
	
	
