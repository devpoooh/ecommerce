package fileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainClass {
	public static void main(String[] args) throws Exception {
		File file = new File("c:\\Temp\\newfile.txt");
		
		//한글자씩 읽기
		FileReader fr = new FileReader(file);
		int ch;
		
		while((ch=fr.read())!=-1) { //읽은 값이 -1일때까지 한글자씩 읽기
			System.out.println((char)ch);
		}
		fr.close();
		
		//한문장으로 읽기
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String str = "";
		while((str=br.readLine())!=null) {
			System.out.println(str); //txt의 한 줄씩 출력해준다.
		}
		br.close();
	}
}
