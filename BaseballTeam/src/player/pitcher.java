package player;

import human.Human;

public class pitcher extends Human{
	private int win;
	private int lose;
	private double defence;
	
	//승
	public void win() {
		System.out.println("picture 승");
	}
	
	//패
	public void lose() {
		System.out.println("picture 패");
	}
	
	//방어율
	public void rate() {
		System.out.println("picture 방어율");
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public double getDefence() {
		return defence;
	}

	public void setDefence(double defence) {
		this.defence = defence;
	}

	@Override
	public String toString() {
		return "Picture [win=" + win + ", lose=" + lose + ", defence=" + defence + "]";
	}
	
	
}
