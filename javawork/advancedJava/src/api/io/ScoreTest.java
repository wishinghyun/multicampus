package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoreTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		String[] data = null;
		try {
			br = new BufferedReader(new FileReader("src/data/score.txt"));
			int total = 0;
			while(true) {
				String line = br.readLine();
				if(line==null) {
					break;
				}
				data = line.split(",");
				total = total + Integer.parseInt(data[1]);
				System.out.println(data[0]+"�� ������ "+data[1]+"��");
			}
			System.out.println("����:"+total);
			System.out.println("���=>"+(total/3));
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
