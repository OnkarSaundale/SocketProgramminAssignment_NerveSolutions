package partB;

import java.io.*;
import java.net.*;
import java.util.Scanner;

import javax.crypto.*;
import javax.crypto.spec.*;

public class Client {
    public static void main(String[] args) throws Exception 
    	{
	        Socket server = new Socket("localhost", 9876);
	        ObjectOutputStream output = new ObjectOutputStream(server.getOutputStream());
	        
	        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
	        keyGen.init(128);
	        
	        SecretKey key = keyGen.generateKey();
	        output.writeObject(key);
	        
	        Cipher cipher = Cipher.getInstance("AES");
	        cipher.init(Cipher.ENCRYPT_MODE, key);
	        
	        //getting user input
	        Scanner sc = new Scanner(System.in);
	        String str= sc.next();
	        
	        byte[] encrypted = cipher.doFinal(str.getBytes());
	        output.writeObject(encrypted);
    }
}
