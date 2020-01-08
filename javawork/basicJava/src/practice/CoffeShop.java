package practice;

public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop��������****");
		Beverage[] beverage = new Beverage[5];
		beverage[0] = new Coffee("Cappuccino");
		beverage[1] = new Coffee("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		getSalesInfo(beverage);

		System.out.println("�� �Ǹ� �ݾ�==>" + getTotalPrice(beverage));
		System.out.println("Coffe�� �Ǹ� ����=>" + Coffee.amount + "��");
		System.out.println("Tea�� �Ǹ� ����=>" + Tea.amount + "��");

	}

	// ����� ���� ������ ���ϰ� �Ǹ������� ����� �� �ֵ��� getSalesInfo�޼ҵ带 �ۼ��ϼ���
	public static void getSalesInfo(Beverage[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+" ��° �Ǹ� �����");
			arr[i].print();
		}
	}

	// ����� ���� �� �Ǹűݾ��� ���� �� �ֵ��� getTotalPrice�޼ҵ带 �ۼ��ϼ���.
public static int getTotalPrice(Beverage[] arr2) {
	int totalPrice = 0;
	for (int j = 0; j < arr2.length; j++) {		
		totalPrice = totalPrice + arr2[j].getPrice();
		
	}
	return totalPrice;
}

}




