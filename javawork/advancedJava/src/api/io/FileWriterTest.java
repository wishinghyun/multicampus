package api.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		//File����� �Ű������� ���޵� ������ ������ �ش� ������ ���� �۾�������
		//���� ��� ���� ������ �����Ͽ� �۾��Ѵ�
		//1. ����open
		//������ �����
		//FileWriter fw = new FileWriter("src/data/output.txt");
		//write�޼ҵ尡 ȣ��ɶ����� ���Ͽ� ������ �߰� - append mode�� true
		FileWriter fw = new FileWriter("src/data/output.txt",true);
		//2. ���Ͽ�����
		fw.write(97);//int������ -> ascii�� �ش��ϴ� ���ڰ� ���
		fw.write("���ڿ� ����\n");
		fw.write("test");
		//3. ����close
		fw.close();
		
	}
}
