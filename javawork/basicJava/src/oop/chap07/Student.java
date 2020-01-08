package oop.chap07;
//Test06
public class Student extends Person{
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int korean, int english, int math, int science) {
		super(name,age);//�θ��� private ����� ���� ���������� �ʰ� �����ڸ� ȣ���Ͽ� �����Ѵ�
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public Student(String name,int korean, int english, int math, int science) {
		/*super();
		this.name = name;*/
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public double getAvg() {
		double avg = (this.korean+this.english+this.math+this.science)/4.0;
		return avg;
	}
	public String getGrade() {
		double avg = getAvg(); 
		String grade = "";
		if(avg>=90 & avg<=100) {
			grade = "A����";
		}else if(avg>=70) {
			grade = "B����";
		}else if(avg>=50) {
			grade = "C����";
		}else if(avg>=30) {
			grade = "D����";
		}else {
			grade = "F����";
		}return grade;
	}
	public void print() {
		super.print(); //�θ�Ŭ������ PersonŬ������ print�޼ҵ带 ȣ��
		System.out.println(" ���:"+getAvg()+
							" ����:"+getGrade());
	}
	public static void show() {
		System.out.println("============================");
	}
}












