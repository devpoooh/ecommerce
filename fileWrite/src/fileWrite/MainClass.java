package fileWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//파일 쓰기
public class MainClass {
	public static void main(String[] args) throws Exception {
		File file = new File("c:\\Temp\\newfile.txt");
		
		FileWriter fWriter;
		
		/*
		fWriter = new FileWriter(file); 
		fWriter.write("hello"+"\n");
		fWriter.write("안녕하세요");
		fWriter.close(); //닫기 필수
		*/
		
		//추가 기입 --> 효율적이지 않음
		fWriter = new FileWriter(file,true);
//		fWriter.write("반갑습니다.");
//		fWriter.close();
		
		//이 방법을 더 선호
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		pw.println("안녕하세요");
		pw.println("hello");
		pw.close();
	}
}
