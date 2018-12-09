package app;

import java.util.HashMap;

public class AskBool implements Queryable {

	private static HashMap<String, Boolean> boolMap = new HashMap<>();
	static {
		boolMap.put("Y", true);
		boolMap.put("Yes", true);
		boolMap.put("T", true);
		boolMap.put("True", true);
		boolMap.put("1", true);
		boolMap.put("N", false);
		boolMap.put("No", false);
		boolMap.put("F", false);
		boolMap.put("F", false);
		boolMap.put("0", false);
		boolMap.put("Exit", null);
	}

	public void ask(String input) {
		System.out.println(boolMap.get(input));
	}

	public Boolean isInputValid(String input) {
		return boolMap.containsKey(input);
	}

	// Error Handling

	public void errorHandler() {
		System.out.println("Error: " + "Input not included in static HashMap for AskBool");
	}

}