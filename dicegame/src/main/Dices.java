package main;

public class Dices {
	// 주사위 두개
	int dice1;
	int dice2;

	// random 발생
	public int random() {
		return (int) (Math.random() * 6) + 1;
	}

	// 주사위 합 유효성
	public int diceSum(int dice1, int dice2) {
		return dice1 + dice2;
	}

	// 주사위 세팅
	public int diceSet() {

		boolean b = false;
		int sum=0;
		
		while (!b) {
			dice1 = random();
			dice2 = random();

			sum = diceSum(dice1, dice2);

			if (sum != 2 && sum != 12) {
				b=true;
			}
		}
		
		return sum;

	}

	// 값 비교
	public void diceCompare() {

	}

	// 결과
	public void result() {

	}
}
