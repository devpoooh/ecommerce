package fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import BaseballDao.BaseballDao;
import human.Human;

public class FileProc {
	File file;
	
	BaseballDao dao = new BaseballDao(); //crud 관리
	
	// file 생성
	public static void createFile() {
		String filename = "baseballMember";

		File newfile = new File("c:\\Temp\\" + filename + ".txt");

		// 파일 존재 여부
		if (isFile(newfile)) {
			System.out.println("파일이 존재합니다.");
			return;
		} else {
			try {
				newfile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 파일 입출력
	public static void saveFile(List<Human> list) throws IOException {
		String filename = "baseballMember";

		File savefile = new File("c:\\Temp\\" + filename + ".txt");
		
		if (!isFile(savefile)) {
			System.out.println("저장할 파일이 존재하지 않습니다.");
		}
		
		//파일에 쓰기
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(savefile)));
		for(Human h:list) {
			pw.println(h.getId()+" "+h.getName()+" "+h.getAge()+" "+h.getHeight());
		}
		pw.close();
		
		System.out.println("데이터 저장 완료");
	}

	public List<Human> readFile() throws IOException {
		String filename = "baseballMember";

		File readfile = new File("c:\\Temp\\" + filename + ".txt");
		
		if (!isFile(readfile)) {
			System.out.println("불러올 파일이 존재하지 않습니다.");
		}
		
		BufferedReader br = new BufferedReader(new FileReader(readfile));
		
		//읽어들인 배열만큼 list에 저장
		Human readHuman = new Human();
		List<Human> readList = new ArrayList<Human>();
		String str;
		while((str=br.readLine())!=null) {
			String[] arr = str.split(" ");
			readHuman.setId(Integer.parseInt(arr[0]));
			readHuman.setName(arr[1]);
			readHuman.setAge(Integer.parseInt(arr[2]));
			readHuman.setHeight(Double.parseDouble(arr[3]));
			readList.add(readHuman);
		}
		br.close();
		
		return readList;
	}
	
	//file 존재 여부
	public static boolean isFile(File file) {
		//파일이 존재하지 않으면
		if (!file.exists()) {
			return false;
		}
		
		return true;
	}

}
