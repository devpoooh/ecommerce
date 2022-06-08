package main;

public class Coin {
	int coin;
	int[] betting=null;
	
	//초기화
	public void init() {
		coin = 20;
		betting = new int[6];
		//7: 6배  6,8: 7배  5,9: 9배  4,10: 12배  3,11: 18배
		int[] betting = {0,6,7,9,12,18}; 
	}
}
