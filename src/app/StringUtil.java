package app;

public class StringUtil {
	
    public static String upperCaseFirstCharacters(String input) {

    	char[] characters = input.toCharArray();
    	characters[0] = Character.toUpperCase(characters[0]);
    	
    	for (int i = 1; i < characters.length; i++) {
    		if (Character.isWhitespace(characters[i - 1])) {
    			characters[i] = Character.toUpperCase(characters[i]);
    		}
    	}

        return new String(characters);
        
    }

}
