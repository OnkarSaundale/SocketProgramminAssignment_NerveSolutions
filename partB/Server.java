package partB;

import java.io.*;
import java.net.*;
import javax.crypto.*;
import javax.crypto.spec.*;

public class Server {
    public static void main(String[] args) throws Exception 
    	{
	        ServerSocket server = new ServerSocket(9876);
	        Socket client = server.accept();
	        
	        ObjectInputStream input = new ObjectInputStream(client.getInputStream());
	        Cipher cipher = Cipher.getInstance("AES");
	        
	        SecretKey key = (SecretKey)input.readObject();
	        cipher.init(Cipher.DECRYPT_MODE, key);
	        
	        byte[] decrypted = cipher.doFinal((byte[])input.readObject());
	        
	        System.out.println(new String(decrypted));
    }
}
