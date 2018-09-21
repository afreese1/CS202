/*Alyssa Freese and Kenny Robinson
 * CS 202
 * Professor Petrovic
 * Lab 6
 * 
 * Algorithm:
 *  
 *  main
 *  1. import the java utility, Scanner
 *  2. create a new scanner called in, which will interact with the keyboard
 *  3. declare a new array that is type integer and has a length of 10
 *  4. declare variables index and count as integers and set initial values to 0
 *  5. print message that tells user to enter up to 10 numbers and provides a way to quit (-1)
 *  6. create a while loop which continues as long as index is less than 10
 *  7. within the loop, declare variable num as an integer and set equal to the next integer that is inputed through the keyboard
 *  8. check if num is equal to -1, if so set index equal to 10
 *  9. if not, set the array at position of index equal to num, increase index by 1 and increase count by 1
 *  10. print the outcome of the function standardDeviation, carrying over the array and the value of count
 *  11. close the scanner
 *  
 *  standardDeviation
 *  1. declare the variable total as an integer and set initial value to 0
 *  2. create a for loop which will read through the array, by setting the condition to i<size (count)
 *  3. within loop, have total increase by the value at position index of the array
 *  4. declare the variable average as a double and set it equal to total, as a double, divided by size (count)
 *  5. declare the variable difference as a double
 *  6. declare the variable sqDiffTotal as a double and set equal to 0
 *  7. create another for loop which will read through the array (same setup as previous one)
 *  8. within the loop, set the difference equal to the value at position of index in the array minus average
 *  9. have sqDiffTotal increase by the value of difference squared
 *  10. close the loop
 *  11. declare the variable variance as a double and set it equal to sqDiffTotal/size (count)
 *  12. declare the variable standardDev as a double and set it equal to the square root of variance
 *  13. return standardDev
 *
 */

import java.util.Scanner;

public class StandardDeviation 
{

	public static void main(String[] args) 
	{
		//open a scanner to allow for user input through the keyboard
		Scanner in = new Scanner(System.in);
		//declare new integer array with size of 10 
		int[] array = new int[10];
		//set initial values
		int index=0;
		int count=0;
		
		//give directions to user
		System.out.println("Enter up to 10 numbers.  Enter -1 to quit: ");
		
		//create while loop in order to add elements to the list
		while (index<10)
		{
			//have user enter an integer to add to the list
			int num = in.nextInt();
			//check if input is -1
			if (num==-1)
				//if num is -1, set index to 10 in order to end loop
				index=10;
			else
			{
				//if not -1, add num to the array at position index
				array[index] = num;
				//increase index by 1 in order to add next input to next slot within the array
				index++;
				//increase count by 1 in order to keep track of how long the list is (since it may end before 10)
				count++;
			}
		}
		//print the standard deviation, which is to be returned from the function standardDeviation
		System.out.println(standardDeviation(array,count));
		//close the scanner
		in.close();
		
	}
	
	public static double standardDeviation (int[] array,int size)
	{
		//set initial value of total to 0
		int total=0;
		
		//create for loop to read through elements within the array
		for (int i=0; i<size; i++)
		{
			//find the total of all the values within the array
			total=total+array[i];
		}
		//find average of all the integers within the array by dividing their total by size(ammount of integers)
		double average = (double) total/size;
		double difference;
		//set initial value
		double sqDiffTotal=0;
		//create another for loop to go through the list again
		for (int i=0; i<size; i++)
		{
			//find the difference between the average and each integer
			difference = array[i]-average;
			//total up the squares of each of these differences
			sqDiffTotal = sqDiffTotal + Math.pow(difference, 2);
		}
		//find the variance by finding the mean of all the differences, which is the sqDiffTotal divided by size
		double variance = sqDiffTotal/size;
		//calculate the standard deviation by finding the square root of the variance
		double standardDev = Math.sqrt(variance);
		//return the standard deviation
		return standardDev;
	}

}
