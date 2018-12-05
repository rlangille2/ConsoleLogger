package app;

public class ConsoleController {
	
	private ConsoleScanner consoleScanner;
	private ConsolePrinter consolePrinter;
	private int numberOfObservers;
	
	public ConsoleController() {
		
		consoleScanner = new ConsoleScanner();
		consolePrinter = new ConsolePrinter();
		
		consoleScanner.addObserver(consolePrinter);
		numberOfObservers = consoleScanner.getNumberOfObservers();
		
		test();
		
	}
	
	public void test() {
		System.out.println("hi");
	}

}
