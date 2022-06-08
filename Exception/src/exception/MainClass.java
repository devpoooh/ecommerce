package exception;

//Exception
public class MainClass {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3 };
		
		/*
		try {			
			for (int i = 0; i < 4; i++) {
				System.out.println(array[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("배열 범위 초과");
		}finally { //반드시 실행
			System.out.println("finally");
		}
		*/
		
//		method();
		
		try {
			callClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static void method() throws IndexOutOfBoundsException{
		int array[] = { 1, 2, 3 };
		
		for (int i = 0; i < 4; i++) {
			System.out.println(array[i]);
		}
	}
	
	static void callClass() throws ClassNotFoundException {
		Class.forName("myclass");
	}
}
