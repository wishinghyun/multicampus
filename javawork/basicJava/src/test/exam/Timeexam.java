package test.exam;
public class Timeexam{
	public static void main(String[] args){
		//time������ ����� ���� �� �������̴�.
		//___��___��___��   �� ���·� ����ϱ�
		int time = 8888;
		int x = time/3600;
		int y = (time-x*3600)/60;
		int z = time%60;
		System.out.println(x+"�� " + y+"�� "+ z+"��");
	
	}
}
