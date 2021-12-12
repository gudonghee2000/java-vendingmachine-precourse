package controller;

import model.VendingMachine;
import view.InputDisplay;

public class MachineController {

	private MachineController() {
	}

	public static void turnOnMachine() {
		VendingMachine vendingMachine = new VendingMachine();
		InputDisplay.askInputVendingMachineChange();
		vendingMachine.makeVendingMachineCoinBox(InputController.inputVendingMachineChange());
	}

}
