package workbook;
//47p
public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();
		account.setAccount("441-0290-1203");
		account.setBalance(500000);
		account.setInterestRate(0.073);
		
		System.out.println("��������: "+account.getAccount()+" �����ܾ�: "
														+account.getBalance());
		
		account.deposit(20000);
		System.out.println("��������: "+account.getAccount()+" �����ܾ�: "
				+account.getBalance());
		
		System.out.println("����: "+account.calculateInterest());
		
		
	}
	

}
