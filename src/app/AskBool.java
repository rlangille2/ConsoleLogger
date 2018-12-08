package app;

import java.util.HashMap;

public class AskBool extends Queryable{

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
	}

	public static Boolean inputIsValid(String input) {
		return boolMap.containsKey(input);
	}
	
	public static void printError() {
		System.out.println("input invalid");
	}
}