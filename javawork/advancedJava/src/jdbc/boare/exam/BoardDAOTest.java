package jdbc.boare.exam;

import java.util.Scanner;

import jdbc.basic.PreparedDeleteTest;
import jdbc.basic.PreparedInsertTest;
import jdbc.basic.PreparedSelectTest;
import jdbc.basic.PreparedUpdateTest;

public class BoardDAOTest {
/*	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		System.out.println("*******�Խñ� ���************");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("����:");
		String title = key.next();
		System.out.print("����:");
		String content = key.next();
		System.out.println();
		dao.insert(id, title, content);
	}
}*/

/*	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("��ȣ:");
		int boardnum = key.nextInt();
		System.out.println();
		dao.update(id, boardnum);
}
}*/
	
/*	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		System.out.print("��ȣ: ");
		int boardnum = key.nextInt();
		System.out.println();
		dao.delete(boardnum);

	}*/
	
	public static void main(String[] args) {		
		PreparedSelectTest se = new PreparedSelectTest();		
		se.select();
	}

}
