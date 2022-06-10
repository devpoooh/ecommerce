package player;

import human.Human;

public class Batter extends Human {

	private int batcount;
	private int hit;
	private double hitAvg;
	
	public void bat() {
		System.out.println("Batter 타수");
	}

	public void safe() {
		System.out.println("Batter 안타수");
	}

	public void rate() {
		System.out.println("Batter 타율");
	}

	public int getBatcount() {
		return batcount;
	}

	public void setBatcount(int batcount) {
		this.batcount = batcount;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public double getHitAvg() {
		return hitAvg;
	}

	public void setHitAvg(double hitAvg) {
		this.hitAvg = hitAvg;
	}

	@Override
	public String toString() {
		return "Batter [batcount=" + batcount + ", hit=" + hit + ", hitAvg=" + hitAvg + "]";
	}

	
}
