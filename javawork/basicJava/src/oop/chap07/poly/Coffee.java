package oop.chap07.poly;

public class Coffee extends Beverage{
	static int amount;
	public Coffee() {
		
	}
	public Coffee(String name) {
		super(name);
		amount++;//Coffee�� �ǸŵǸ� 1�� ����
		calcPrice();//�ֹ��Ǵ� ������ ������ ���
	}
	//static����� �������ϱ� ���ؼ� static�޼ҵ带 �����ؼ� �������Ѵ�
	public static int getAmount() {
		return amount;
	}
	@Override
	public void calcPrice() {
		if(getName().equals("Cappuccino")) {
			price = 3000;
		}else if(getName().equals("CafeLatte")) {
			price = 2500;
		}else if(getName().equals("Americano")) {
			price = 1500;
		}
		
	}
	
}






