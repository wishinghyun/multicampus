package chap04;
//ForExam03�� While������ ����
public class WhileExam01 {
	public static void main(String[] args) {
		int sum = 0;
		int even = 0;
		int odd = 0;
		int sumVal = 1;
		while (sumVal<=100) {		
			sum = sum + sumVal;
			sumVal++;
			if (sumVal%2==0) {
				even = even + sumVal;
			}else {
				odd = odd +sumVal;
			}
		}
		System.out.println("����:"+sum);
		System.out.println("¦����:"+even);
		System.out.println("Ȧ����:"+odd);
	}

}
