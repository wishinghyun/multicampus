package api.util;

import java.util.ArrayList;

public class ArrayListTest03 {
	public static void main(String[] args) {
		String[] arr = {"java","oracle","jdbc","html5","css","java"};
		ArrayList<String> list = changeData(arr);
		//��ȯ�Ǿ� ���ϵ�  ArrayList�� ����� ���� ������ ����ϱ�		
		for (String data : list) {
			System.out.println("���:"+data);
		}
		System.out.println("=============================");
		int size = list.size();
		for(int i=0;i<size;i++) {
			System.out.println("���:"+list.get(i));
		}
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
	}
	//�迭�� ArrayList�� ��ȯ�ؼ� �����ϴ� �޼ҵ�
	public static ArrayList<String> changeData(String[] arr){
		ArrayList<String> list = new ArrayList<String>();
		//�Ű������� ���޵� �迭���� �����͸� ������ ArrayList�� �����ϴ� �ڵ�
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		
		return list;
	}
}
