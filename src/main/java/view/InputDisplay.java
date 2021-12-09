package view;

public class InputDisplay {
	private static final String ASK_INPUT_VENDING_MACHINE_CHANGE_MESSAGE = "자판기가 보유하고 있는 금액을 입력해 주세요.";

	private InputDisplay() {
	}

	public static void askInputVendingMachineChange() {
		System.out.println(ASK_INPUT_VENDING_MACHINE_CHANGE_MESSAGE);
	}
}