package Assignment3;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A3Driver
{
	private static int qty = 0;
	private static float price = 0;
	private static float weight = 0;
	private static String name = null;
	private static String option1 = null;
	private static String Option2 = null;

	public static void main(String[] args) 
	{ 
		if (args.length != 1) 
		{
			System.err.println ("Error: Incorrect number of command line "
					+ "arguments");
			System.exit(-1);
		}
		processLinesInFile (args[0]);
	}

	public static void processLinesInFile (String filename) 
	{ 
		// open file; file name specified in args (command line)
		A3Driver shoppingCart = new A3Driver(); 
		try 
		{
			FileReader freader = new FileReader(filename);
			BufferedReader reader = new BufferedReader(freader);
			
			for (String s = reader.readLine(); s != null; s = reader.readLine()) 
			{
				ArrayList<Item> cart = new ArrayList<Item>(); 

				String[] input = s.split(" ");				// parse input, get first portion
				opCode = input[0].charAt(0);
			
				switch(opCode) // switch operations will further parse string s
										// to check for validity
				{
					case 'I': // insert
						char type = itemType;
						if(type == 'C')
						{
							temp = new Clothing(name, price, qty, weight);
						}
						if(type == 'G')
						{
							temp = new Grocery(name, price, qty, weight, perishable);
						}
						if(type == 'E')
						{
							temp = new Electronics(name, price, qty, weight, fragile, taxable);
						}
						cart.add(temp);
						break;
					case 'S': // search
						break;
					case 'D': // delete
						break;
					case 'U': // update
						break;
					case 'P': // print
						break;
					default:
//					error(); // default on the switch is an error because falling 
									// through the switch indicates that the first part 
									// of the input line was incorrect

				}
				// get the first part of the line - use as a switch
				
				// each switch statement will handle the individual command
				
				// print command will handle the sort action prior to printing

				String shopping = A3Driver.shopping(s);				
			}
		} 
		catch (FileNotFoundException e) 
		{
			System.err.println ("Error: File not found. Exiting...");
			e.printStackTrace();
			System.exit(-1);
		}
		catch (IOException e) 
		{
			System.err.println ("Error: IO exception. Exiting...");
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	public static String shopping (String s)
	{
		char opCode = 0;
		String cat = "";
		String of1 = "";
		String of2 = "";
		String[] input = s.split(" ");				// parse input, get first portion
		
		if(input[0] == "insert")
		{
			opCode = 'I';
			cat = input[1];								
			if(cat == "clothing")
			{
				name = input[2];
				price = Integer.parseInt(input[3]);
				qty = Integer.parseInt(input[4]);
				weight = Integer.parseInt(input[5]);
			}
			if(cat == "electronics")
			{						
				name = input[2];
				price = Integer.parseInt(input[3]);
				qty = Integer.parseInt(input[4]);
				weight = Integer.parseInt(input[5]);
				of1 = input[6];
				of2 = input[7];
			}
			if(cat == "groceries")
			{
				name = input[2];
				price = Integer.parseInt(input[3]);
				qty = Integer.parseInt(input[4]);
				weight = Integer.parseInt(input[5]);
				of1 = input[6];						
			}
			else error();
		}
		else if(input[0] == "search")
		{
			opCode = 'S';
			name = input[1];
		}
		else if(input[0] == "delete")
		{
			opCode = 'D';
			name = input[1];
		}
		else if(input[0] == "update")
		{
			opCode = 'U';
			name = input[1];
			qty = Integer.parseInt(input[2]);	
		}
		else if(input[0] == "print")
		{
			opCode = 'P';
			
		}
		else error();
		
		
		
		
		
		
		
		
		switch(opCode) 					
		{
			case 'I':	
						break;
			case 'S': 					// search
						break;
			case 'D': 									// delete
						break;
			case 'U': 							// update
				break;
			case 'P': 									// print
				break;
			default:
			error(); 					// default on the switch is an error because falling 
										// through the switch indicates that the first part 
										// of the input line was incorrect

		}
				// get the first part of the line - use as a switch
		
				// each switch statement will handle the individual command
		
				// print command will handle the sort action prior to printing
		
	}
	
	public static void error(){
		System.out.println("The input contains commands that cannot be performed");
		break;
	}
		
		
		// General code example for how to iterate an array list. You will have to modify this heavily, to suit your needs.
		Iterator<Item> i = shoppingCart.iterator();
		while (i.hasNext()) 
		{
			Item temp = i.next();
			temp.calcPrice(); 
			temp.printAttributes();
			//This (above) works because of polymorphism: a determination is made at runtime, 
			//based on the inherited class type, as to which method is to be invoked. Eg: If it is an instance
			// of Grocery, it will invoke the calcPrice () method defined in Grocery.
		}		
	}
}