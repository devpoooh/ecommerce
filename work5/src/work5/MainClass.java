package work5;

import java.util.Scanner;

public class MainClass {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1, num2;
		String oper;
		
		// 함수 -> 입력이 안되면 다시 입력받기
		// 첫번째 수 입력
		System.out.println("첫 번째 수를 입력해주세요.");
		num1=numInput();
		
		// 연산자 입력 -> 정상적인 연산자 입력
		System.out.println("연산자를 입력해주세요.(+ - * / %)");
		oper = operator();

		// 두 번째 수 입력
		System.out.println("두 번째 수를 입력해주세요.");
		num2 = numInput();

		// 연산
		int result = processing(num1, num2, oper);
		
		// 결과 출력
		resultPrint(num1, num2, result, oper);

	}

	// 수 입력
	// 정상적인 수 입력받기
	static int numInput() {
		boolean b = false; // 정상적인 수면 true
		String str = null;
		while (!b) {
			System.out.print("입력: ");
			str = sc.next();

			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c < '0' || c > '9') { // 숫자가 아니므로 다시 입력
					System.out.println("다시 입력해주세요.");
					continue;
				}
			}
			b = true;
		}

		return Integer.parseInt(str);
	}

	static String operator() {
		String oper = null;

		while (true) {
			System.out.print("입력: ");
			oper = sc.next();

			if (oper.equals("+")|| oper.equals("-")|| oper.equals("*") || oper.equals("/") || oper.equals("%")) {
				break;
			}

			System.out.println("다시 연산자를 입력해주세요");

		}

		return oper;
	}

	// 연산처리
	static int processing(int n1, int n2, String oper) {
		int result = 0;

		switch (oper) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/":
			result = n1 / n2;
			break;
		case "%":
			result = n1 % n2;
			break;
		}

		return result;
	}

	static void resultPrint(int n1, int n2, int result, String oper) {
		System.out.printf("%d %s %d = %d\n", n1, n2, oper, result);
	}
}
