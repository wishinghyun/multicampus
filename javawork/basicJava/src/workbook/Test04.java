package workbook;
//p58
public class Test04 {
	public static void main(String[] args) {
		Student04 s1 = new Student04("ȫ�浿", 15, 171, 81);
		Student04 s2 = new Student04("�ѻ��", 13, 183, 72);
		Student04 s3 = new Student04("�Ӳ���", 16, 175, 65);
		
		Student04[] str = new Student04[3];
		str[0] = s1;
		str[1] = s2;
		str[2] = s3;
		System.out.println("�̸�      ����     ����    ������");
		for(int i=0;i<str.length;i++) {			
			System.out.println(str[i]);
		}
		
		System.out.println("������ ���: "+(s1.getAge()+s2.getAge()+s3.getAge())/3.0);
		System.out.println("������ ���: "+(s1.getHeight()+s2.getHeight()+s3.getHeight())/3.0);
		System.out.println("�������� ���: "+(s1.getWeight()+s2.getWeight()+s3.getWeight())/3.0);
	}

}
