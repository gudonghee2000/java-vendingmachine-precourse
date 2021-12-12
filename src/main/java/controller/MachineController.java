package controller;

import java.util.Arrays;

import model.VendingMachine;
import view.InputDisplay;
import view.OutputDisplay;

public class MachineController {

	private MachineController() {
	}

	public static void turnOnMachine() {
		VendingMachine vendingMachine = new VendingMachine();
		InputDisplay.askInputVendingMachineChange();
		vendingMachine.makeVendingMachineCoinBox(InputController.inputVendingMachineChange());
		OutputDisplay.showEachCoinInCoinBox(vendingMachine.giveEachCoinPrice(), vendingMachine.giveEachCoinCount());
		InputDisplay.askInputVendingMachineProduct();
		InputController.inputVendingMachineProducts();
	}

}
