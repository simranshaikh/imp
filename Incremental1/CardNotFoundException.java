package Incremental1;

public class CardNotFoundException extends Exception{
	
	public CardNotFoundException(String message) {
		super(message);
		System.out.println("The card you are looking for is not available");
}
}