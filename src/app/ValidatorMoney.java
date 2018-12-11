package app;

import java.util.regex.Pattern;

public class ValidatorMoney implements Validatable {

	public Boolean validate(String value) {
		return (Pattern.matches("^\\$([1-9]\\d{0,2}(,\\d{3})*(\\.\\d{2})?)", value));
	}

}
