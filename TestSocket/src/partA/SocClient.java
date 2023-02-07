package partA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocClient
	{

		public static void main(String[] args)
			{
				try
					{
						System.out.println("Client started");
						Socket soc = new Socket("localhost",9806);
						BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
						System.out.println("Enter a string");
						String str = userInput.readLine();
						PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
						out.println(str);
						BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
						System.out.println(in.readLine());
					}
				catch (Exception e) 
				{
					e.printStackTrace();
				}

			}

	}
