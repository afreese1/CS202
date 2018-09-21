/*Alyssa Freese and Kenny Robinson
 * CS202
 * Professor Petrovic
 * Lab 7
 * 
 * Algorithm:
 * 
 * main
 * 1. create new scanner that retrieves data through keyboard
 * 2. create a new array, type string, that is an adequate size
 * 3. have user enter as many words as they wish until they enter quit
 * 4. create a while loop to check for word "quit". If not entered, array at index will equal word
 * 5. increase index and count within loop, then have user enter another word
 * 
 * create a new array called sorted array which is equal to value returned from array sort method
 * print sorted array
 * 
 * arraySort
 * 1.create new array called my list which is type string and has size equal to count, which is parameter sent from main
 * 2. create variables hold, s1 and s2 as strings
 * 3. create nested for loops which will read through list and compare two elements from it
 * 4. have s1 equal to array at index i and s2 equal to array at index j within the second loop
 * 5. check if s2 comes before s1, if so, switch them in the array
 * 6. outside the nested loops, create a while loop which will copy over elements from original array to new blank one
 * 7. return the new array (mylist)
 */

import java.util.Scanner;
import java.util.Arrays;
import java.text.*;

public class arraySortsStrings 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String[] array = new String[100];
		System.out.println("Input a sequence of words.  Enter quit to stop");
		String word = in.next();
		int index = 0;
		int count= 0;
		//add sequences of words that the user inputs to the array
		while (!(word.equalsIgnoreCase("quit")))
		{
			array[index]=word;
			index++;
			count++;
			word=in.next();
		}
		in.close();
		
		String[] sortedArray = arraySort(array, count);
		System.out.println(Arrays.toString(sortedArray));
	}
	
	public static String[] arraySort(String[] array, int size)
	{
		String[] mylist = new String[size];
		String hold;
		String s1;
		String s2;
		for (int i = 0; i<size-1; i++)
		{
			for (int j = i+1; j<=size-1; j++)
			{
				//set variable equal to two elements from the array
				s1 = array[i];
				s2 = array[j];
				
				//check if s2 comes before s1, alphabetically
				if (s2.compareToIgnoreCase(s1)<0)
				{
					//have hold temporarily hold the value of s1
					hold = s1;
					//change element of array at position i to s2
					array[i] = s2;
					//change element of array at position j to hold (s1)
					array[j] = hold;
				}
				
			}
		}
			
		//copy over elements to new array in order to avoid printing null spaces
		int index = 0;
		while (index<size)
		{
			mylist[index] = array[index];
			index++;
		}
		
		//return the new array
		return mylist;
	}

}

//Run

//Input a sequence of words.  Enter quit to stop
//minnie
//goofy
//donald
//daisy
//pluto
//chip
//dale
//mickey
//quit
//[chip, daisy, dale, donald, goofy, mickey, minnie, pluto]

//works as expected
