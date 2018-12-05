package app;

public interface ConsoleSubject {

	public void addObserver(ConsolePrinter consolePrinter);
	
	public void removeObserver(ConsolePrinter consolePrinter);
	
}
