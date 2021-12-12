package model;

public enum Coin {
	COIN_500(500),
	COIN_100(100),
	COIN_50(50),
	COIN_10(10);

	private final int amount;

	Coin(final int amount) {
		this.amount = amount;
	}

	// 추가 기능 구현
	public static Coin getCoinByPrice(int coinPrice) {
		if (coinPrice == 500) {
			return COIN_500;
		} else if (coinPrice == 100) {
			return COIN_100;
		} else if (coinPrice == 50) {
			return COIN_50;
		}
		return COIN_10;
	}
}
