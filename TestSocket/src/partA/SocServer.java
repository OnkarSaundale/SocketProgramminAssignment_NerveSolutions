package partA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SocServer extends Thread
	{

		public static void main(String[] args)
			{
				try 
				{
					System.out.println("waiting for clients...");
					ServerSocket ss = new ServerSocket(9806);
					Socket soc = ss.accept();
					System.out.println("Connection established");
					BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
					String str = in.readLine();
					PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
					out.println("Server says: "+ str);

					//Storing Data
					Map<String, Map<String, Integer>> tp = new TreeMap<>();
					//SetA
					Map<String, Integer> A = new TreeMap<>();
					A.put("One", 1);
					A.put("Two", 2);

					tp.put("SetA", A);
					
					//SetB
					Map<String, Integer> B = new TreeMap<>();
					B.put("Three", 3);
					B.put("Four", 4);

					tp.put("SetB", B);
					
					//SetC
					Map<String, Integer> C = new TreeMap<>();
					C.put("Five", 5);
					C.put("Six", 6);

					tp.put("SetC", C);
					
					//SetD
					Map<String, Integer> D = new TreeMap<>();
					D.put("Seven", 7);
					D.put("Eight", 8);

					tp.put("SetD", D);
					
					//SetE
					Map<String, Integer> E = new TreeMap<>();
					E.put("Nine", 9);
					E.put("Ten", 10);

					tp.put("SetE", E);
					
					System.out.println(tp);

		  
			// System.out.println(employeeMap.containsKey("SetA"));
					 
					SocServer s1 = new SocServer();
					Date d1 = new Date();
					
					 switch (str)
						{
						case "SetA-One":
							{
								System.out.println("[{\"One\":1,\"Two\":2}]");
							  //System.out.println(A.get("One"));
								
								int num= A.get("One");
								for (int i = 0; i < num ; i++)
									{
										// Printing the value stored in above object after 1 sec
										s1.sleep(1000);
								      out.println("Current date is " + d1);
									}
							}
							break;
							
						case "SetA-Two":
								{
									System.out.println("[{\"One\":1,\"Two\":2}]");
								  //System.out.println(A.get("Two"));
									
									int num= A.get("Two");
									for (int i = 0; i < num ; i++)
										{
									      // Printing the value stored in above object after 1 sec
										  s1.sleep(1000);
									      out.println("Current date is " + d1);
										}
								}
								break;
							
						case "SetB-One":
								{
									System.out.println("[{\"Three\":3,\"Four\":4}]");
									int num= B.get("One");
									for (int i = 0; i < num ; i++)
										{
									      // Printing the value stored in above object
										  s1.sleep(1000);
									      out.println("Current date is " + d1);
										}
								}
								break;
								
						case "SetB-Two":
								{
									System.out.println("[{\"Three\":3,\"Four\":4}]");
									int num= B.get("Two");
									for (int i = 0; i < num ; i++)
										{
									      // Printing the value stored in above object
										  s1.sleep(1000);
									      out.println("Current date is " + d1);
										}
								}
								break;
								
						case "SetC-One":
								{
									System.out.println("[{\"Five\":5,\"Six\":6}]");
									int num= C.get("One");
									for (int i = 0; i < num ; i++)
										{
									      // Printing the value stored in above object
										  s1.sleep(1000);
									      out.println("Current date is " + d1);
										}
								}
								break;
								
						case "SetC-Two":
								{
									System.out.println("[{\"Five\":5,\"Six\":6}]");
									int num= C.get("Two");
									for (int i = 0; i < num ; i++)
										{
									      // Printing the value stored in above object
										  s1.sleep(1000);
									      out.println("Current date is " + d1);
										}
								}
								break;
								
						case "SetD-One":
								{
									System.out.println("[{\"Seven\":7,\"Eight\":8}]");
									int num= D.get("One");
									for (int i = 0; i < num ; i++)
										{
									      // Printing the value stored in above object
										  s1.sleep(1000);
									      out.println("Current date is " + d1);
										}
								}
								break;
								
						case "SetD-Two":
								{
									System.out.println("[{\"Seven\":7,\"Eight\":8}]");
									int num= D.get("Two");
									for (int i = 0; i < num ; i++)
										{
									      // Printing the value stored in above object
										  s1.sleep(1000);
									      out.println("Current date is " + d1);
										}
								}
								break;
							
						case "SetE-One":
								{
									System.out.println("[{\"Nine\":9,\"Ten\":10}]");
									int num= E.get("One");
									for (int i = 0; i < num ; i++)
										{
									      // Printing the value stored in above object
										  s1.sleep(1000);
									      out.println("Current date is " + d1);
										}
								}
								break;
								
						case "SetE-Two":
								{
									System.out.println("[{\"Nine\":9,\"Ten\":10}]");
									int num= E.get("Two");
									for (int i = 0; i < num ; i++)
										{
									      // Printing the value stored in above object
										  s1.sleep(1000);
									      out.println("Current date is " + d1);
										}
								}
								break;
						default:
							throw new IllegalArgumentException("Unexpected value: " + str);
						}
					
			
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}

			}

	}
