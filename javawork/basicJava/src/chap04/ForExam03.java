package chap04;

public class ForExam03 {
	public static void main(String[] args) {
		int sumVal =0;    //����
		int evenSumVal=0; //¦����
		int oddSumVal=0;  //Ȧ����
		for (int i = 1; i<=100; i++) {
			sumVal = sumVal + i;
			if (i%2==0) {
				evenSumVal = evenSumVal+i;
			}else {
				oddSumVal = oddSumVal+i;
			}
			}
		System.out.println("����:"+sumVal);
		System.out.println("¦����:"+evenSumVal);
		System.out.println("Ȧ����:"+oddSumVal);
		}
		
	}

