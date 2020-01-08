package oop.chap07.poly;

public abstract class Beverage {
	private String name;
	protected int price;
	
	public Beverage(){
		
	}
	public Beverage(String name) {
		super();
		this.name = name;
	}
	
	public abstract void calcPrice();
	public void print() {
		System.out.println("����� "+name+"�̸�, ������ "+price);
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
