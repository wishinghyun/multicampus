package workbook;

public class Company {
	private double salary;					//�⺻��
	private double annualIncome;			//��ҵ�
	private double afterTaxAnnualIncome;	//���� ���� �� ��ҵ��� ��
	private double bonus;					//���ʽ�
	private double afterTaxBonus;			//���� ���� �� �� ���ʽ��� 
	
	public Company() {
		
	}
	public Company(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public double getAfterTaxAnnualIncome() {
		return afterTaxAnnualIncome;
	}
	public double getAfterTaxBonus() {
		double afterTaxBonus = getBonus()*0.945;
		return afterTaxBonus;
	}
	public double getIncome() {
		double income = salary*12;
		return income;
	}
	public double getAfterTaxIncome() {
		double getAfterTaxIncome = getIncome()*0.9;
		return getAfterTaxIncome;
	}
	public double getBonus() {
		double getBonus = getSalary()*4*0.2;
		return getBonus;		
	}
	
}
