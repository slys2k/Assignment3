package Assignment3;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A3Driver
{
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
			char opCode = 0;
			for (String s = reader.readLine(); s != null; s = reader.readLine()) 
			{
				String[] input = s.split(" ");				// parse input, get first portion
				opCode = input[0].charAt(0);
			
				switch(opCode) // switch operations will further parse string s
										// to check for validity
				{
					case 'I': // insert
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
		
		//Stub for arraylist.
		ArrayList<Item> shoppingCart = new ArrayList<Item>(); 
		
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