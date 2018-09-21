/*Alyssa Freese and Kenny Robinson
 * Dr. Petrovic
 * CS202
 * Lab 8
 * 
 * Algorithm:
 * 
 * 1. import scanner and create new scanner within main
 * 2. declare new object of BankAccount called acc
 * 3. ask the user to input ID and balance of account, using scanner to communicate through keyboard
 * 4. if balance is zero, set acc equal to BankAccount constructor with only one parameter (id)
 * 5. else set acc equal to BankAccount constructor with two parameters (id and balance)
 * 6. declare variable action as a string
 * 7. ask the user whether he wants to deposit or withdraw, setting action equal to users input
 * 8. create while loop that will continue until user enters quit
 * 9. while in loop, check if user enter deposit or withdraw
 * 10. if deposit is entered, ask for user to input amount and then call on method deposit using object acc, with parameter amt
 *11. if withdraw is entered, ask user to input amount and then call on withdraw method through acc object with parameter amt
 *12. then print return from method toString, which is called on through the object acc
 *13. ask user if another transaction is desired
 *14. outside of loop, ask user to enter id and balance of another account
 *15. create object acc2, type BankAccount, with parameters id2 and balance2
 *16. print returned value from method equalAmount, called through object acc with parameter acc2
 *
 * Test Cases
 * 
 * 1) id = abcd, balance = 100, deposit = 200
 *    output = The new balance for id abcd is 300
 *    withdraw = 150 -> output = the new balance for id abcd is 150
 *    id2 = efgh, balance2 = 160 -> output = false
 *    
 *    works as expected
 *    
 * 2) id = xoxo, balance =  0, withdraw = 100
 *    output = insufficient balance, the new balance for id xoxo is 0
 *    deposit = 300 -> output = the new balance for id xoxo is 300
 *    id2 = lolol, balance2 = 300 -> output = true
 *    
 *    works as expected
 */

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) 
	{
		//create scanner to interact with keyboard
		Scanner in = new Scanner(System.in);
		//declare new BankAccount object
		BankAccount acc;
		
		//ask user to enter ID and balance, using scanner
		System.out.println("Enter ID and current balance: ");
		System.out.print("ID: ");
		String id = in.next();
		System.out.println("");
		System.out.print("Balance: ");
		double balance = in.nextDouble();
		System.out.println("");
		//check if balance is 0
		if (balance==0){
			acc = new BankAccount(id);
		}
		else{
			acc = new BankAccount(id,balance);
		}
		//declare variable action
		String action;
		//ask user which transaction he would like to perform
		System.out.println("Would you like to deposit or withdraw? Enter quit to exit");
		action = in.next();
		
		//create loop which will continue until user quits
		while (!action.equals("quit")){
			if(action.equalsIgnoreCase("deposit")){
				System.out.println("Enter amount you wish to deposit:");
				double amt = in.nextDouble();
				//calls on deposit method for BankAccount class
				acc.deposit(amt);
			}
			else if(action.equalsIgnoreCase("withdraw")){
				System.out.println("Enter amount you wish to withdraw:");
				double amt = in.nextDouble();
				//calls on withdraw method from BankAccount class
				acc.withdraw(amt);
			}
			
			//displays current balance by calling toString method from BankAccount class
			System.out.println(acc.toString());
			System.out.println();
			System.out.println("Make another transaction? ");
			action=in.next();
		}
		System.out.println();
		
		//ask user to enter another accounts information
		System.out.println("Enter another Account information: ");
		System.out.print("ID: ");
		String id2 = in.next();
		System.out.println();
		System.out.print("Balance: ");
		Double balance2 = in.nextDouble();
		System.out.println();
		
		//create second object with inputed id2 and balance2
		BankAccount acc2 = new BankAccount(id2, balance2);
		//call on method equalAmount in BankAccount class
		System.out.println("Same balance? " +acc.equalAmount(acc2));
			
	}

}

//Runs

//1

/*
Enter ID and current balance: 
ID: abcd

Balance: 100

Would you like to deposit or withdraw? Enter quit to exit
deposit
Enter amount you wish to deposit:
200
The new balance for id abcd is 300.0

Make another transaction? 
withdraw
Enter amount you wish to withdraw:
150
The new balance for id abcd is 150.0

Make another transaction? 
quit

Enter another Account information: 
ID: efgh

Balance: 160

Same balance? false
 */


//2

/*
Enter ID and current balance: 
ID: xoxo

Balance: 0

Would you like to deposit or withdraw? Enter quit to exit
withdraw
Enter amount you wish to withdraw:
100
Insufficient Balance
The new balance for id xoxo is 0.0

Make another transaction? 
deposit
Enter amount you wish to deposit:
300
The new balance for id xoxo is 300.0

Make another transaction? 
quit

Enter another Account information: 
ID: lolol

Balance: 300

Same balance? true
*/
