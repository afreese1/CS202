/*Algorithm:
 * 1. create quarterBack class that extends offensivePlayer
 * 2. create 2 private variables, interceptionsThrown and completionPercentage
 * 3. create a constructor that takes 7 arguments
 * 4. within constructor, call on super class constructor using appropriate parameters
 * 5. set private variables equal to parameters accordingly
 * 6. create get methods which return appropriate variable
 * 7. create set methods that change appropriate variable's value
 * 8. create display method to print information, make sure to call on display method of superclass
 * 
 */

//create private variables
public class QuarterBack extends OffensivePlayer {
	private int interceptionsThrown;
	private double completionPercentage;
	
	//constructor that sets initial values of variables
	public QuarterBack(String player, int played, int injuries, int interceptions, int tackles, int thrown, double percentage) {
		//calls on superclass constructor
		super(player, played, injuries, interceptions, tackles);
		interceptionsThrown = thrown;
		completionPercentage = percentage;
	}
	
	//getters return appropriate variable
	public int getInterceptionsThrown() {
		return interceptionsThrown;
	}
	
	public double getCompletionPercentage() {
		return completionPercentage;
	}
	
	//setters change variable
	public void setInterceptionsThrown(int numInterceptions) {
		interceptionsThrown = numInterceptions;
	}
	
	public void setCompletionPercentage(double completion) {
		completionPercentage = completion;
	}
	
	//print
	public void display() {
		//calls on display method from superclass
		super.display();
		System.out.println("Number Of Touchdowns: " +interceptionsThrown);
		System.out.println();
		System.out.println("Completion Percentage: " +completionPercentage);
	}

}
