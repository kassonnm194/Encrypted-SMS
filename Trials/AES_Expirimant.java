
import java.util.*;

public class AES_Expirement {

	//	Fields
	public static UUID key;
	public static String keyString;
	public static Scanner in;
	public static String message;
	public static byte[] messageBytes;
	public static ArrayList<byte[]> blocks;
//	public static int[] expKey;
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
		encode();
		decode();
		check();
	}
	
		
	public static void expandKey(){
		
	}
	
	public static void addRoundKey(int i){
		
	}
	
	public static void subBytes(int i){
		
	}
	
	public static void shiftRows(int i){
		
	}
	
	public static void mixColumns(int i){
		
	}
	
	public static void round(int i, boolean fin){
		if(fin){
			subBytes(i);
			shiftRows(i);
			addRoundKey(i);
		} else {
			subBytes(i);
			shiftRows(i);
			mixColumns(i);
			addRoundKey(i);
		}
	}
	
	//	Exec:	Breaks string into a Byte array,
	//			then breaks that into an ArrayList of 16-bit sub-arrays
	//	Pre:	boolean enc (True: encode "message" || False: decode "encoded)
	//	Post:	Saves ArrayList of blocks to "blocks" field
	public static void getBlocks(boolean enc) {
		if (enc)
			messageBytes = message.getBytes();
		else
			messageBytes = encoded.getBytes();
		blocks = new ArrayList<byte[]>();
		byte[] temp = new byte[16]();
		for (int i=0; i<messageBytes.length; i++){
			temp[i%16] = messageBytes[i];
			if(i%16 = 15){
				blocks.add(temp);
				if(i = messageBytes-1)
					return;
				temp = new byte[16]();
			}
			blocks.add(temp);
		}
	}
	
	//	Exec: Encodes message using AES encryption
	//	Post: Saves result to "encoded" field
	public static void encode() {
		getBlocks(True);
		expandKey();
		for (int i=0; i<blocks.size();
			addRoundKey();
			for (int j=0; j<10; i++)
				round(i, True);
			round(i, False);
		}
		
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
		getBlocks(False);
	}
}
