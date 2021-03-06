package work;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 편의점 지불금액: 3210원 본인금액: 10000원
		 * 
		 * 거스름돈?
		 * 
		 * 5000원 1000원 500원 100원 50원 10원
		 */

		int money = 10000;
		int pay = 3210;

		// 거스름돈
		int result = money - pay;
		System.out.println("거스름돈 -> " + result);

		int m5000 = result / 5000; // 5000원
		result %= 5000;
		int m1000 = result / 1000; // 1000원
		result %= 1000;
		int m500 = result / 500; // 500원
		result %= 500;
		int m100 = result / 100; // 100원
		result %= 100;
		int m50 = result / 50; // 50원
		result %= 50;
		int m10 = result / 10; // 100원
		result %= 10;

		System.out.printf("5000원 -> %d\n1000원 -> %d\n500원 -> %d\n100원 -> %d\n50원 -> %d\n10원 -> %d\n", m5000, m1000,
				m500, m100, m50, m10);

		// Random 함수 <--> Pattern
		// 0 ~ 9
		int r = (int) (Math.random() * 10);
		System.out.println("r = " + r);

		// 10 20 30 40 50 ...
		r = ((int) (Math.random() * 5) + 1) * 10;

		// -1 0 1
		int x = (int) (Math.random() * 3) - 1;
		int y = (int) (Math.random() * 3) - 1;

		// 3, 7, 4, 5, 9
		int arr[] = {3,7,4,5,9};
		int idx = (int) (Math.random() * 5);
		System.out.println("arr = " + arr[idx]);
	}
}
