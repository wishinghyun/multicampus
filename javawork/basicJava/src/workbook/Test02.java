package workbook;
//p55
public class Test02 {
	public static void main(String[] args) {
		//Company�� salary�� double�̰� �Է¹��� money�� int�̹Ƿ�
		//�ڵ�casting�� �ȴ�
		int money = Integer.parseInt(args[0]);
	Company c = new Company(money);
	System.out.println("�� �⺻�� ��: "+c.getIncome()+" ����: "+c.getAfterTaxIncome());
	System.out.println("�� ���ʽ� ��: "+c.getBonus()+"	   ����: "+c.getAfterTaxBonus());
	System.out.println("�� ���޾� ��: "+(c.getAfterTaxIncome()+c.getAfterTaxBonus()));
}
}