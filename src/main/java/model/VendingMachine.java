package model;

import java.util.List;

public class VendingMachine {
	private VendingMachineCoinBox vendingMachineCoinBox;
	private VendingMachineProducts vendingMachineProducts;
	private UserInsertMoneyBox userInsertMoneyBox;

	public void makeVendingMachineCoinBox(int insertVendingMachineChange) {
		vendingMachineCoinBox = new VendingMachineCoinBox(insertVendingMachineChange);
	}

	public void makeVendingMachineProducts(List<String> vendingMachineProductsInformation) {
		vendingMachineProducts = new VendingMachineProducts(vendingMachineProductsInformation);
	}

	public void makeUserInsertMoneyBox(int userInsertMoney) {
		userInsertMoneyBox = new UserInsertMoneyBox(userInsertMoney);
	}

	public List<Integer> giveEachCoinCount() {
		return vendingMachineCoinBox.bringEachCoinCountInCoinBox();
	}

	public List<Integer> giveEachCoinPrice() {
		return vendingMachineCoinBox.bringEachCoinPriceInCoinBox();
	}

	public int giveUserInsertMoney() {
		return userInsertMoneyBox.bringMoney();
	}

	public boolean isAllProductsSoldOut() {
		if (!vendingMachineProducts.hasAnyProduct()) {
			return true;
		}
		return false;
	}

	public boolean hasEnoughMoneyToBuyProduct() {
		if (userInsertMoneyBox.hasEnoughMoney(vendingMachineProducts.bringMinimumProductPrice())) {
			return true;
		}
		return false;
	}

	public void sellProduct(String productName) {
		int soldProductPrice = vendingMachineProducts.sellProduct(productName);
		userInsertMoneyBox.reduceMoney(soldProductPrice);
	}
}
