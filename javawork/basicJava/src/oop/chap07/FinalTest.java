package oop.chap07;
final class FinalSuper{
	public final void display() {
		System.out.println("super display");
	}
}
class FinalSub extends FinalSuper{//finalŬ������ ����� �Ұ���
	static final int NUM = 100;

	@Override
	public void display() {//final�޼ҵ�� �������̵� �� �� ����
		System.out.println("display");
	}
	
}
public class FinalTest {
	public static void main(String[] args) {
		FinalSub obj =  new FinalSub();
//		obj.NUM = 1000; //����̹Ƿ� ���� ���� �� �� ����
		System.out.println(FinalSub.NUM);
		obj.display();
	}

}
