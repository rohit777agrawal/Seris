package series;

import java.util.Scanner;

/*
Program for Compound Interest.
Author: Rohit Agrawal
E-mail Address: ra2381@email.vccs.edu
Programming Assignment HW10.
Last Changed: March 30, 2018.
*/

public class series {
	@SuppressWarnings("resource")
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner (System.in);
		// Create while statement true 
		boolean statement = true;
		
		// create variable integer highest and lowest to store the meaningful integer
		int highest = 0;
		int lowest = 0;
		System.out.println("Enter integers in series to see the lowest and highest of all !");
		System.out.println("(-99 to end the series)");
		
		// if we do not take first two readings outside while loop, 
		// then while loop values will compare the initialized value=0
		
		lowest = keyboard.nextInt(); 
		if (lowest == -99)  // rare condition into account, if first integer is -99
		{
			System.out.println("There is no highest and lowest Integer");
			System.exit(0);
		}
		highest = keyboard.nextInt();
		if (highest == -99) // rare condition into account, if second integer is -99
		{
			System.out.println("highest number in this series is: " + lowest);
			System.out.println("Lowest number in this series is: " +lowest);
			System.exit(0);
		}
		
		while (statement)
		{
			int store = keyboard.nextInt();
			
			if (store > highest && store != -99)
			{
				highest = store; // store each time when highest increases.
			}
			if (store < lowest && store != -99)
			{
				lowest = store; // store each time when lowest decreases.
			}
			if (store == -99)
			{
				statement = false; // if -99 then do not continue the while loop. 
			}
			
		}
		
		System.out.println("highest number in this series is: " + highest);
		System.out.println("Lowest number in this series is: " +lowest);
		


	}      

}
