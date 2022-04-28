package java.example.hello;

public class HelloMessage {
	private static final String MESSAGE = "Hello World!";

	public static String getMessage() {
		return MESSAGE;
	}
	
	public static void main(String args[]) {
		System.out.println(getMessage());
	}
}
