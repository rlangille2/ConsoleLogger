package app;

import java.util.regex.Pattern;

public class ValidatorEmail implements Validatable {

	private Pattern regex = Pattern.compile(
			"[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
			Pattern.CASE_INSENSITIVE);

	public Boolean validate(String value) {
		return Pattern.matches(regex.pattern(), value);
	}

}
