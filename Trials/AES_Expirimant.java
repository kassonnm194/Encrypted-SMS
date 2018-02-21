
import java.util.*;

public class AES_Expirement {

	//Fields
	public static UUID key;
	public static String keyString;
	public static Scanner in;
	public static String message;
	public static ArrayList blocks;
	public static String encoded;
	public static String decoded;
	
	//	Main Method
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		key = UUID.randomUUID();
		keyString = key.toString();
		System.out.println("\nAES test Key: "+keyString);
		System.out.print("\nPlease enter your message: ");
		message = in.nextLine();
		getBlocks();
		encode();
		decode();
		check();
	}
	
	//	Exec: Breaks "message" string into 16 bit strings
	//	Post: Saves 16 bit strings to "mList" field
	public static void getBlocks() {
		blocks = new ArrayList();
		
	}
	
	//	Exec: Encodes message using AES encryption
	//	Post: Saves result to "encoded" field
	public static void encode() {
		
	}
	
	//	Exec: Checks that "message" and "decoded" fields are equal
	public static void check() {
		if (message.equals(decoded))
			System.out.println("The decoded message MATCHES your input");
		else
			System.out.println("The decoded message DOES NOT match your input");
			System.out.println("Input: " + message);
			System.out.println("Result: " + decoded);
	}
	
	//	Exec: Decrypts encrypted message with AES
	//	Post: Saves result to "decoded" field
	public static void decode() {
		
	}
}