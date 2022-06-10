package fileio;

import java.io.File;
import java.io.IOException;

public class FileProc {
	File file;
	
	//file 생성
	public static void createFile() {
		String filename = "baseballMember";
		
		File newfile = new File("c:\\Temp\\"+filename+".txt");
		
		//파일 존재 여부
		if(newfile.exists()) {
			System.out.println("파일이 존재합니다.");
			return;
		}else {
			try {
				newfile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//파일 입출력
	public void saveFile() {
		// TODO Auto-generated method stub
		
	}

	public void readFile() {
		// TODO Auto-generated method stub
		
	}

	
}
