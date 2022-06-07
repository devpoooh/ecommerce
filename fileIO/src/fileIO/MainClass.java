package fileIO;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

//파일 입출력
public class MainClass {
	public static void main(String[] args) throws Exception {
		/*
		File file = new File("c:\\");
		
		String filelist[] = file.list(); //파일리스트
		
		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]); //파일리스트 출력
		}*/
		
		/*
		File fileList[] = file.listFiles();
		
		for (int i = 0; i < fileList.length; i++) {
			if(fileList[i].isFile()) { //파일이니
				System.out.println("[파일]"+fileList[i].getName());
			}else if(fileList[i].isDirectory()){//폴더니
				System.out.println("[폴더]"+fileList[i].getName());				
			}else { //예외. 히든
				System.out.println("[??]"+fileList[i].getName());								
			}
		}
		*/
		
		//파일 생성
		File newfile = new File("c:\\Temp\\newfile.txt");
		
		if(newfile.createNewFile()) {		//한번 파일 생성되면 실패 뜸
			System.out.println("파일 생성 성공");
		}else {
			System.out.println("파일 생성 실패");
		}
		
		//폴더 생성
		File newDir = new File("c:\\Temp\\subDir"); //폴더 안에 폴더는 생성이 안됨 ex) \\Temp\\sub\\Dir
		if(newDir.mkdir()) { //newDir.mkdirs()를 사용하면 폴더 안에 폴더도 생성이 가능하다.
			System.out.println("폴더 생성 성공");
		}else {
			System.out.println("폴더 생성 실패");
		}
		
		//파일 존재 여부
		if(newfile.exists()) {
			System.out.println("파일 존재");
		}else {
			System.out.println("파일 없음");
		}
		
		//읽기 전용
//		newfile.setReadOnly(); //파일을 새로 저장이 불가함
		
		//쓰기 전용
		newfile.setWritable(true); //true일때 쓰기 전용
		
		//삭제
		newfile.delete(); //파일 삭제
	}
}
