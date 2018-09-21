/*Algorithm:
 * 1. create OffensivePlayer class that extends FootballPlayer class
 * 2. create 2 private variables, totalYards (int) and numberOfTDs (int)
 * 3. create a constructor that has five parameters, for the three variables in FootballPlayer and the 2 within class
 * 4. within constructor call on super method with the three parameters from FootballPlayer class in order to set
 *    variables values.  set 2 private variables within OffensivePlayer to appropriate parameter
 * 5. create get methods to retrieve appropriate data, return variable
 * 6. create set methods which use a parameter to set value of variable to a diff amount
 * 7. create a display method which will print info, using display method from super to print variables from superclass
 */

//set private variables
public class OffensivePlayer extends FootballPlayer {
	private int totalYards;
	private int numberOfTDs;
	
	
	//set variables to values of parameter
	public OffensivePlayer(String player, int played, int injuries, int yards, int TDs) {
		//call on superclass constructor
		super(player, played,injuries);
		totalYards = yards;
		numberOfTDs = TDs;
	}
	
	//create getters which will return appropriate variable
	public int getTotalYards() {
		return totalYards;
	}
	
	public int getNumberOfTDs() {
		return numberOfTDs;
	}
	
	//create setters which will change value of variable to parameter
	public void setTotalYards(int totalYds) {
		totalYards = totalYds;
	}
	
	public void setNumberOfTDs(int TDs) {
		numberOfTDs = TDs;
	}
	
	//print
	public void display() {
		//call on superclass display method to print info
		super.display();
		System.out.println("Total Yards: " +totalYards);
		System.out.println("Number Of Touchdowns: " +numberOfTDs);
	}
	
}
