package sample09;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		// Sorting: 정렬

		int number[] = { 4, 3, 5, 2, 1 };

		// 선택정렬
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				// swap
				if (number[i] > number[j]) { // 앞에 있는 요소가 더 클때 교환
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(number));

		/*
		 * work1 1. 몇개를 정렬하시겠습니까? >> 2. 개수에 맞게 배열 할당 3. 개수만큼 입력받기 >> 4. 오름 or 내림 선택 5.
		 * 정렬처리 6. 결과 출력
		 */

		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("몇개를 정렬하시겠습니까? "); System.out.print("입력: "); int n =
		 * sc.nextInt(); int[] arr = new int[n];
		 * 
		 * System.out.printf("%d개의 요소를 입력하십시오. : ",n); for (int i = 0; i < n; i++) {
		 * arr[i]=sc.nextInt(); }
		 * 
		 * //오름 or 내림 System.out.print("오름차순 정렬이면 1, 내림차순 정렬이면 2를 입력해주세요. : "); int cho
		 * = sc.nextInt();
		 */

		// 선택정렬
		/*
		 * for (int i = 0; i < arr.length-1; i++) { for (int j = i+1; j < arr.length;
		 * j++) { if(cho==1) { //오름차순 if(arr[i] > arr[j]) { int temp = arr[i];
		 * arr[i]=arr[j]; arr[j]=temp; } }else if(cho==2) { if(arr[i] < arr[j]) { //내림차순
		 * int temp = arr[i]; arr[i]=arr[j]; arr[j]=temp; } }
		 * 
		 * } }
		 */
		// 숫자인지 확인해주기
		System.out.println("몇개를 정렬하시겠습니까? ");
		System.out.print("입력: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int w = 0;
		String strNum[] = null;
		while (w < n) {
			System.out.print((w + 1) + "번째 수: ");
			String numStr = sc.next();

			boolean b = true;
			for (int i = 0; i < numStr.length(); i++) {
				int asc = (int) numStr.charAt(i);
				if (asc < 48 || asc > 57) { // 숫자가 아님
					b = false;
					break;
				}

				if (!b) { // false일때
					System.out.println("숫자만 입력해주세요");
					continue;
				}

				arr[w] = Integer.parseInt(numStr);
				w++;

			}
		}
		System.out.print("오름(1) or 내림(2) : ");
		boolean updown=true; //오름이면 true
		String ud=sc.next();
		if(ud.equals("2")) { //내림이면 false
			updown=false;
		}
		
		//선택정렬
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if(updown) {					
					if (number[i] > number[j]) { 
						int temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}else {
					if (number[i] < number[j]) { 
						int temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}
			}
		}
		
		System.out.println("결과: " + Arrays.toString(arr));
	}
}
