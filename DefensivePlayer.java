/*Algorithm:
 * 1. create class DefensivePlayer that extends FootballPlayer
 * 2. create 2 private variables for this class, numberOfInterceptions and numberOfTackles
 * 3. create a constructor that accepts five arguments
 * 4. within constructor call on superclass constructor, with appropriate parameters
 * 5. also set private variables to appropriate values
 * 6. create get methods which return appropriate variable
 * 7. create set methods that change variable's value to parameter
 * 8. create a display method that prints information, make sure to call display method from superclass as well
 * 
 */

//create instance variables for class
public class DefensivePlayer extends FootballPlayer {
	private int numberOfInterceptions;
	private int numberOfTackles;
	
	//constructor which sets variables initial values
	public DefensivePlayer(String player, int played, int injuries, int inter, int tackles) {
		super(player, played, injuries);
		numberOfInterceptions = inter;
		numberOfTackles = tackles;
	}
	
	//getters that return appropriate variable
	public int getNumberOfInterceptions() {
		return numberOfInterceptions;
	}
	
	public int getNumberOfTackles() {
		return numberOfTackles;
	}
	
	//setters which change value of variable
	public void setNumberOfInterceptions(int interceptions) {
		numberOfInterceptions = interceptions;
	}
	
	public void setNumberOfTackles(int numTackles) {
		numberOfTackles = numTackles;
	}
	
	//print
	public void display() {
		//call on superclass display method
		super.display();
		System.out.println("Number Of Interceptions: " +numberOfInterceptions);
		System.out.println("Number Of Tackles: " +numberOfTackles);
	}

}
