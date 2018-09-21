import java.util.ArrayList;
import java.util.Scanner;
public class sortingCharacters 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string of letters: ");
		String s = in.next();
		System.out.println(charSort(s));
	}

	public static String charSort(String s)
	{
		char next;
		char check;
		String solution = "";
		for (int i = 0; i<s.length()-1;i++);
		{
			next= s.charAt(i);
			for (int j = i+1;i<=s.length(); j++)
			{
				
				if(check.compareToIgnoreCase(next)<0)
					next=check;
				
			}
			solution = solution + next
		}
		
		return solution;
	}			
		
}
