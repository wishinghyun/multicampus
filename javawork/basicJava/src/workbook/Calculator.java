package workbook;

public class Calculator {
	public double divide(int a, int b) {
		double result = 0.0;
		try {
			result = a / b;
		} catch (Exception e) {
			System.out.println("Exception�� �߻� �Ͽ����ϴ�. �ٽ� �Է��� �ּ���");
		}
		return result;
	}

}
