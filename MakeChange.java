/*Alyssa Freese
 * CS202
 * Professor Petrovic
 * February 9, 2015
 * 
 * Lab 2
 * 
 * Algorithm:
 * 1. Have the user enter an integer that is less than 100
 * 2. Confirm that entered value meets requirements, if not ask again
 * 3. Divide amount inputed by 25 to find the largest number of quarters for change
 * 4. Find the remaining amount left by subtracting 25 times the number of quarter from the initial amount
 * 5. Find the highest number of dimes that can be used for change by diving the remaining amount by 10
 * 6. Calculate the new remaining amount by subtracting the product of 10 and the number of dimes from the remaining amount
 * 7. Find the highest number of nickels that can be used by diving the new remaining amount by 5
 * 8. Find the remaining amount by multiplying 5 by the number of nickels and subtracting it from the remaining amount
 * 9. Set the remaining amount equal to the number of pennies
 * 10. Print the totals of each coins that will be used to make up the change for the amount initially entered
 * 
 * Test Cases:
 * 1. input = 100  => expected result = Invalid. Enter again
 *    input = 99   => expected result = 3 quarters, 2 dimes and 4 pennies
 *    
 * 2. input = 67   => expected result = 2 quarters, 1 dime, 1 nickel and 2 pennies
 */
import java.util.Scanner;
public class MakeChange 
{

	public static void main(String[] args) 
	{
		//create new scanner in order to allow inputs
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an amount less than 100: ");
		//input the initial amount
		int amt = in.nextInt();
		//make sure the number entered fills the criteria of being less than 100
		while (amt>=100)
		{
			//if amount is greater than or equal to 100, ask again
			System.out.println("Invalid input. Enter an amout less than 100: ");
			amt = in.nextInt();
		}
		
		//calculate highest number of each coin be diving the amount by the coins value
		//find remaining amount by subtracting total value of coins from amount left of input value
		//Do this for each coin
		
		int quarter = amt/25;
		int remaining = amt-(25*quarter);
		int dime = remaining/10;
		remaining = remaining-(10*dime);
		int nickel = remaining/5;
		remaining = remaining-(5*nickel);
		int penny = remaining;
		//print change for initial amount entered
		System.out.println("Your change is " +quarter +" quarters, " +dime +" dimes, " +nickel +" nickels and " + penny +" pennies");
	}

}

//Runs

//Enter an amount less than 100: 
//100
//Invalid input. Enter an amout less than 100: 
//99
//Your change is 3 quarters, 2 dimes, 0 nickels and 4 pennies


//Enter an amount less than 100: 
//67
//Your change is 2 quarters, 1 dimes, 1 nickels and 2 pennies
