package app;

import java.util.Scanner;

public class ScannerController {

	private boolean isRunning = false;
	private Scanner scanner = new Scanner(System.in);

	public void start() {
		this.isRunning = true;
		ask(new AskBool(), "Key in one of the options and hit enter. Do you understand? [Y/N]" + '\n'
				+ "You can exit at any time by keying in: Exit");
	}

	public void ask(Queryable queryable, String question) {
		System.out.println(question);
		System.out.print("> ");
		scanner.hasNextLine();
		String input = scanner.nextLine();
		String text = StringUtil.upperCaseFirstCharacters(input);

		if (checkExitCondition(text)) {
			exit();
		}
		if (!queryable.isInputValid(text)) {
			queryable.errorHandler();
		} else {
			queryable.ask(text);
		}
	}

	// Exit Functions

	private Boolean checkExitCondition(String text) {
		return text.equals("Exit");
	}

	private void exit() {
		System.out.println("Exiting...1-2-3 Done!");
		System.exit(0);
	}

}
