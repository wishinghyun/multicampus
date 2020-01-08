package oop.chap07;

public class IceCream extends Dessert{
	private int calorie;
	public IceCream() {
		
	}
	
	public IceCream(String productName, int price, int count, int calorie) {
		super(productName, price, count);
		this.calorie = calorie;
	}

/*	public IceCream(String productName, int price, int count, int calorie) {
		super(productName,price,count);
		this.calorie = calorie;
	}*/
	public static void print(){
		System.out.println("======================================");
		System.out.println("�ֹ��׸�\t����\t����\tĮ�θ�");
		System.out.println("======================================");
	}
	public void printProductInfo() {
		super.printProductInfo();
		System.out.println("\t"+calorie+"kcal");
	}
	
	
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	
	
	
	
	
	
	
}
