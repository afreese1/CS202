// A BankAccount keeps track of a user's money balance and ID,
public class BankAccount {
    private String id;
    private double balance;
    
    
    // Constructs a BankAccount object with the given id and 0 balance.
    public BankAccount(String num){
    	id=num;
    	balance=0;
    }

    // Constructs a BankAccount object with the given id and balance
	   public BankAccount(String num, double iniBalance){
		   id=num;
		   balance=iniBalance;
	   }

    
    // returns the field values
    public double getBalance(){
    	return balance;
    }

    public String getID(){
    	return id;
    }
    
    
	  // Adds the amount to the balance if it is between 0-500.
    public void deposit(double amount){
    	if (amount>=0 && amount<=500)
    		balance=balance+amount;
    }
    
    // Subtracts the amount from the balance if the user has enough money.
	  // if not, do not make any change and report unsuccessful attempt
    public void withdraw(double amount){
    	if(balance>amount)
    		balance=balance-amount;
    	else
    		System.out.println("Insufficient Balance");
    
    }
    
	//toString
    public String toString(){
    	String response = "The new balance for id " +id +" is " +balance;
    	return response;
    }

 //equalAmount
    public boolean equalAmount(BankAccount other){
    	if (balance==other.balance)
    		return true;
    	else
    		return false;
    		
    }
    
	 
}
