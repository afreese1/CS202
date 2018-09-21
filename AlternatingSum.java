/*Alyssa Freese and Kenny Robinson
 * CS202
 * Professor Petrovic
 * Lab 7
 * 
 * Algorithm:
 * 1. import scanner
 * 2. create a new scanner to allow for user input data through the keyboard
 * 3. declare a new array which holds a large number of integers
 * 4. declare variables index and count as integers and set initial value to 0
 * 5. tell user to enter a sequence of numbers and give a way to quit (-1)
 * 6. declare variable num as an integer and set it equal to the next inputed integer
 * 7. create a while loop that will continue as long as user provides input that is not -1 (quit)
 * 8. within the loop, set the array at position index to num
 * 9. set num equal to the next inputed integer
 * 10. have index and count increase by 1
 * 11. outside of loop, declare the variable total as an integer and set initial value to 0
 * 12. create a for loop that will read through the array up to count
 * 13. within this loop, create a set of if statements
 * 14. for the first if statement, check if i equals 0 so that the program can print the array at position i and add that value to total
 * 15. in the else if, check if i is even, and then print a addition sign and the array at i, and add to total
 * 16. in the else, print the minus sign and array at position i, then subtract value from total
 * 17. outside of loop, print an equal sign and the total
 * 18. close the scanner
 * 
 * Test Case:
 * 1) input = 1 4 9 16 9 7 4 9 11 
 * 	  output = 1 - 4 + 9 - 16 + 9 - 7 + 4 - 9 + 11 = -2
 * 
 *    works as expected
 * 
 * 2) input = 10 6 11 4 1
 *    output = 10 - 6 + 11 - 4 + 1 = 12
 *    
 *    works as expected
 */

import java.util.Scanner;

public class AlternatingSum 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		//create an array with adequate amount of space holders
		int[] array = new int[100];
		//set initial values
		int index=0;
		int count=0;
		
		//give user directions
		System.out.println("Enter a sequence of integers. Type -1 to quit: ");
		
		//have user input integer using the scanner
		int num = in.nextInt();
		//create while loop to check if inputed number is -1
		while (!(num==-1))
		{
			//add the inputed value to the array
			array[index]=num;
			//have user input another integer
			num=in.nextInt();
			//increase index and count by 1
			index++;
			count++;
		}
		
		//set initial value
		int total=0;
		
		//create a for loop that will read through the array up to the last inputed number
		for (int i=0; i<count; i++)
		{
			//check for the first integer in the array
			if (i==0)
			{
				//print the value of the array at the first position
				System.out.print(array[i]);
				//add the integer at 0 to total
				total=total+array[i];
			}
			//check if i is even
			else if (i%2==0)
			{
				//print an addition sign and the integer in array at position i
				System.out.print(" + " +array[i]);
				//add integer of array at position i to total
				total=total+array[i];
			}
			else
			{
				//print a minus sign and the integer at position i
				System.out.print(" - " +array[i]);
				//subtract integer in array at position i from total
				total=total-array[i];
			}
		}
		
		//print an equals sign and the total
		System.out.print(" = " +total);
		//close the scanner
		in.close();
	}

}

//Run

//Enter a sequence of integers. Type -1 to quit: 
//1
//4
//9
//16
//9
//7
//4
//9
//11
//-1
//1 - 4 + 9 - 16 + 9 - 7 + 4 - 9 + 11 = -2

//Enter a sequence of integers. Type -1 to quit: 
//10
//6
//11
//4
//1
//-1
//10 - 6 + 11 - 4 + 1 = 12
