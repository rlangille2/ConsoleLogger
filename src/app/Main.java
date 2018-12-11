package app;

public class Main {

	public static void main(String[] args) {

		ValidatorMoney money1 = new ValidatorMoney();
		ValidatorEmail email1 = new ValidatorEmail();
		SetterValue value1 = new SetterValue();
		value1.setValue("");
		System.out.println(money1.validate("$200,000.00"));
		System.out.println(email1.validate("send.arman.email@gmail.com"));
		System.out.println(value1.getValue());
	}

}
