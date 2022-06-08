package main;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);

	int coin = 20;
	int bet; // 베팅금액
	int userNumber; // 유저가 선택한 넘버

	// 주사위 두개
	Dice diceOne = new Dice();
	Dice diceTwo = new Dice();

	public void init() {
		diceOne.setNumber();
		diceTwo.setNumber();

		System.out.println("주사위1: " + diceOne.getNumber() + " 주사위2: " + diceTwo.getNumber());
	}

	public void userInput() {
		// betting
		System.out.print("베팅금액 = ");
		bet = sc.nextInt();

		coin -= bet;

		// 주사위의 합
		System.out.print("두 주사위의 합 = ");
		userNumber = sc.nextInt();
	}

	public void finding() {
		int diceNum1 = diceOne.getNumber();
		int diceNum2 = diceTwo.getNumber();

		// 합계
		int diceSum = diceNum1 + diceNum2;

		// 맞춘경우
		if (userNumber == diceSum) {
			if (diceSum == 3 || diceSum == 11) {
				bet *= 18;
			} else if (diceSum == 4 || diceSum == 10) {
				bet *= 12;
			} else if (diceSum == 5 || diceSum == 9) {
				bet *= 9;
			} else if (diceSum == 6 || diceSum == 8) {
				bet *= 7;
			} else if (diceSum == 7) {
				bet *= 6;
			}

			System.out.println("축하합니다!!");
			coin += bet;

		} else { // 실패
			System.out.println("아쉽습니다. 다시 도전하세요.");
		}
	}

	public void result() {
		System.out.println("주사위의 값: " + diceOne.getNumber() + "  " + diceTwo.getNumber());
		System.out.println("합계: "+diceOne.getNumber()+diceTwo.getNumber());
		System.out.println("현재 금액: "+coin);
	}
	
	public void play() {
		while(true) {
			init();
			userInput();
			finding();
			result();
			
			System.out.print("play again(y/n)? : ");
			String again = sc.next();
			
			if(again.equals("n") || again.equals("N") ) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			System.out.println("다시 시작합니다.");
		}
	}

}
