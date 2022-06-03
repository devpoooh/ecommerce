package sample03;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 연산 + - * / %
		 * 
		 * 9/2=4 9%2=1
		 */

		int num1, num2;
		num1 = 3;
		num2 = 2;

		int result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);

		// increment(++), decrement(--)
		num1 = 0;
		num1++;
		System.out.println("num1 = " + num1);
		++num1;
		System.out.println("num1 = " + num1);

		int a, b;
		a = 0;
		b = 0;

		b = a++;
		b = --a;
		System.out.println("a = " + a);// 1
		System.out.println("b = " + b);// 0

		// 논리 연산자
		// &&(AND), ||(OR), !(NOT)
		int num = 5;
		System.out.println(num <= 5); // true
		System.out.println(num > 0 && num <= 5); // true
		System.out.println(num > 10 || num > 0);// true
		System.out.println(!(num > 10 || num > 0)); // false --> num<=10 && num<=0
		System.out.println(num != 9); // true

		// 삼항연산자 --> 람다식
		// 값 = (조건)? 값1 : 값2
		int n;
		n = (num > 0) ? 100 : 20; // 100
		System.out.println("n = " + n);

		char c;
		c = (num < 0) ? 'Y' : 'N';// N
		System.out.println("c = " + c);

		/*
		 * bit 연산: 0, 1 &(and) |(or) ^(xor) <<(left shift) >>(right shift) ~(not)
		 */

		// AND
		int number = 0x71 & 0x85; // 0111 0001 & 1000 0101 = 0000 0001
		System.out.println("number = " + number);
		System.out.printf("%x\n", number);

		// OR
		int number2 = 0x71 | 0x85; // 0111 0001 | 1000 0101 = 1111 0101(245)
		System.out.println("number2 = " + number2);

		// XOR
		int number3 = 0x71 ^ 0x85; // 0111 0001 ^ 1000 0101 = 1111 0100(244) --> 다르면 참
		System.out.println("nember3 = " + number3);

		// <<(left shift) ==> *2
		byte by;
		by = 0x1 << 1;
		System.out.println("by = " + by);

		// >>(right shift) ==> /2
		by = 0x2 >> 1;
		System.out.println("by = " + by);
		
		// ~ 반전 0->1 1->0
		by = ~0x55;
		System.out.println("by = "+by);
		System.out.printf("%x\n",by);

	}

}
